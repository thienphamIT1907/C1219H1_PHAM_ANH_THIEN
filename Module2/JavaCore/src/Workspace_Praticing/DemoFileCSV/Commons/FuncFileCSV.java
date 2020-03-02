package Workspace_Praticing.DemoFileCSV.Commons;

import Workspace_Praticing.DemoFileCSV.Models.Student;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FuncFileCSV {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String fileName = "./src/Workspace_Praticing/DemoFileCSV/Data/StudentDetail.csv";
    private static final String FILE_HEADER = "name, grade, address"; //head viet giong thuoc tinh trong class student

    public static void writeToFileCSV(ArrayList<Student> studentArrayList) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileName);
            fileWriter.append(FILE_HEADER);
            fileWriter.append(NEW_LINE_SEPARATOR);

            for(Student student: studentArrayList) {
                fileWriter.append(student.getName());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(student.getGrade());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(student.getAddress());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }

        } catch(Exception e) {
            System.out.println("We have some problem in CSV file...");
        } finally {
            try {
                assert false;
                fileWriter.flush();
                fileWriter.close();
            } catch(Exception e) {
                System.out.println("Error flushing or closing");
            }
        }
    }

    public static ArrayList<Student> getFileCSV() {
        BufferedReader bufferedReader = null;
        ArrayList<Student> studentArrayList = new ArrayList<>();
        Path path = Paths.get(fileName);
        if(!Files.exists(path)) {
            try {
                File file;
                Writer writer = new FileWriter(fileName);
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }

        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader(fileName));
            while((line = bufferedReader.readLine())!= null) {
                String[] splitData = line.split(",");

                //pass first line in file (title line)
                if(splitData[0].equals("name")) {
                    continue;
                }

                Student student = new Student();
                student.setName(splitData[0]);
                student.setGrade(splitData[1]);
                student.setAddress(splitData[2]);

                studentArrayList.add(student);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                bufferedReader.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return studentArrayList;
    }
}
