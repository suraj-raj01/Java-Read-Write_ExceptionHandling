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
                System.out.println(element);
            }
            System.out.println("====================================================================================================");
            System.out.println("Print Data who's Rank is 1");
            for(Student element:students){
                if(element.getRank()==1){
                    System.out.println(element);
                }
            }
            System.out.println("====================================================================================================");
            System.out.println("Print Data who's name start with M");
            for(Student element:students){
                if(element.getName().startsWith("M")){
                    System.out.println(element);
                }
            }
        }catch (IOException e){
            System.err.println("IOException");
        }
    }
}