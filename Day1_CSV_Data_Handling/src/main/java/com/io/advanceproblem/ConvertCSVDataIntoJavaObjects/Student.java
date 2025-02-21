package com.io.advanceproblem.ConvertCSVDataIntoJavaObjects;

public class Student {
    private String Id;
    private String name;
    private String age;
    private String marks;

    // Constructor
    public Student(String Id, String name, String age,String marks) {
        this.Id = Id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    public String getId(){
        return Id;
    }
    public String getName(){
        return name;
    }
    public String getAge(){
        return age;
    }
    public String getMarks(){
        return marks;
    }
}
