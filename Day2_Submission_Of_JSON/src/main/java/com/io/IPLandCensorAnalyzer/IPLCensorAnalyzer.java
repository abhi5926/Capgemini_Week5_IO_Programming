package com.io.IPLandCensorAnalyzer;

import com.opencsv.exceptions.CsvException;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class IPLCensorAnalyzer
{
    private static String maskingTeamName(String teamName) {
        return teamName.replaceAll("(?<=\\S{3})\\S", "*");
    }

    private static void censoringMatchData(JSONObject match) {
        // Mask team names
        String team1 = match.getString("team1");
        String team2 = match.getString("team2");
        match.put("team1", maskingTeamName(team1));
        match.put("team2", maskingTeamName(team2));

        // Redact player of the match
        match.put("player_of_the_match", "REDACTED");
    }

    public static void JSONData(String jsonFile, String censoredJSONFile) {
        // Handling IOException
        try {
            FileReader fileReader = new FileReader(jsonFile);
            JSONTokener jsonTokener = new JSONTokener(fileReader);
            JSONArray jsonArray = new JSONArray(jsonTokener);
            JSONArray censoredJsonArray = new JSONArray();

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject match = jsonArray.getJSONObject(i);
                censoringMatchData(match);
                censoredJsonArray.put(match);
            }

            FileWriter jsonWriter = new FileWriter(censoredJSONFile);
            jsonWriter.write(censoredJsonArray.toString(4));
            System.out.println("JSON Data successfully censored ");
            jsonWriter.flush();
            jsonWriter.close();
        }
        catch (IOException e) {
            System.out.println("IOException occur: " + e.getMessage());
        }
    }

    public static void CSVData(String csvFile , String censoredCSVFile) {
        // Handling IOException
        try {
            CSVReader csvReader = new CSVReader(new FileReader(csvFile));
            List<String[]> records = csvReader.readAll();
            csvReader.close();

            for (String[] record : records) {
                // Mask team names
                record[0] = maskingTeamName(record[0]);
               record[1] = maskingTeamName(record[1]);
                // Redact player of the match
                record[2] = "REDACTED";
            }

            CSVWriter csvWriter = new CSVWriter(new FileWriter(censoredCSVFile));
            csvWriter.writeAll(records);
            System.out.println("CSV Data successfully censored");
            csvWriter.flush();
            csvWriter.close();
        }
        catch (IOException e) {
            System.out.println("IOException occur: " + e.getMessage());
        }
        catch (CsvException e) {
            System.out.println("CSV exception occur: " + e.getMessage());
        }
    }

    // Main method
    public static void main(String[] args) {
        String jsonFile = "D:\\Capgemini Notes\\JSONFile\\SampleIPL.json";
        String censoredJSONFile = "D:\\Capgemini Notes\\JSONFile\\IPLJSONOutputFile.json";
        String csvFile = "D:\\Capgemini Notes\\JSONFile\\SampleIPL.csv";
        String censoredCSVFile = "D:\\Capgemini Notes\\JSONFile\\CSVOutputFile.csv";
        // Calling method
        JSONData(jsonFile, censoredJSONFile);
        // Calling method
        CSVData(csvFile, censoredCSVFile);
    }
}