package com.io.PracticeProblem.ConvertaJavaObjectIntoJSONFormat;
import com.fasterxml.jackson.databind.ObjectMapper;
public class Car {
    // Attrinutes of Car
     public  String carName;
     public String ownerName;
     public  String registrationNumber;

      // Constructor
    public Car(String carName,String ownerName,String registrationNumber){
        this.carName = carName;
        this.ownerName = ownerName;
        this.registrationNumber = registrationNumber;
    }
}
