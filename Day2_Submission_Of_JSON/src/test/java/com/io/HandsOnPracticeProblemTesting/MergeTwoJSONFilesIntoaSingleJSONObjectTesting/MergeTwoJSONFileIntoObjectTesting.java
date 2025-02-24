package com.io.HandsOnPracticeProblem.MergeTwoJSONFilesIntoaSingleJSONObjectTesting;

import com.io.HandsOnPracticeProblem.MergeTwoJSONFilesIntoaSingleJSONObject.MergeJSONFile;
import org.junit.jupiter.api.Test;

public class MergeTwoJSONFileIntoObjectTesting {
    @Test
    public void twoJSONFileTesting(){
        // File paths for the JSON files
        String file1 = "D:\\Capgemini Notes\\JSONFile\\file1.json";
        String file2 = "D:\\Capgemini Notes\\JSONFile\\file2.json";

         // Creating class object
        MergeJSONFile ob = new MergeJSONFile();
        // Calling method to merge the files
        ob.mergeJSONFile(file1, file2);
    }
}
