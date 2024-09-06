package com.example.io;

import com.example.bean.Student;

import java.io.*;

public class ReadStudentData {
    // create a method readData which accept a parameter fileName  of type String
    public Student[] readData(String fileName) throws IOException {
        Student[] studentData = null;
        // create array-size? count number of lines
        File file = new File(fileName);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String line = bufferedReader.readLine();
        int count = 0;
        while(line!=null){
            line = bufferedReader.readLine();
            count++;
        }
        studentData = new Student[count];
        // read data from file, and objects of student to array
        bufferedReader = new BufferedReader(new FileReader(file));
        line = bufferedReader.readLine();
        int indexOfStudentData = 0;
        while(line!=null){
            line = bufferedReader.readLine();
            if(line!=null){
                String[] split = line.split(",");
                Student student = new Student();
                student.setName(split[0]);
                student.setRollNo(Integer.parseInt(split[1]));
                student.setEmail(split[2]);
                student.setMobile(split[3]);
                student.setRank(Integer.parseInt(split[4]));
                studentData[indexOfStudentData] = student;
                indexOfStudentData++;
            }
        }
        return studentData;
    }
}
