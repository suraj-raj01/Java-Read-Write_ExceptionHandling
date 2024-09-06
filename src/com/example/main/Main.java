package com.example.main;

import com.example.bean.Student;
import com.example.io.ReadStudentData;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ReadStudentData readStudentData = new ReadStudentData();
        String fileName = "resources/studentdata.csv";
        try {
            Student[] students = readStudentData.readData(fileName);
            for(Student element:students){
                System.out.println(students);
            }
        }catch (IOException e){
            System.err.println("IOException");
        }
    }
}