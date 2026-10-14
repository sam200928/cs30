package skillbuilder;

import java.io.*;
import java.text.NumberFormat;
import java.util.Scanner;

public class statsp2 {
    public static void main(String[] args) {
        File dataFile = null; 
        FileReader in;
        BufferedReader readFile;
        FileWriter out;
        BufferedWriter writeFile; 
        
        Scanner input = new Scanner(System.in);
        String fileName;
        String stuName, score;
        int numStu;
        int numScores = 0;
        double lowScore = 100;
        double highScore = 0;
        double avgScore;
        double totalScores = 0;
        double scoreValue; 
        
        NumberFormat percent = NumberFormat.getPercentInstance();

        System.out.println("Enter file name:");
        fileName = input.next();
        System.out.println("How many students?");
        numStu = input.nextInt();

        try {
            dataFile = new File(fileName);
            out = new FileWriter(dataFile);
            writeFile = new BufferedWriter(out);
            
            for (int i = 0; i < numStu; i++) {
                System.out.println("Student name:");
                stuName = input.next();
                System.out.println("Test score:");
                score = input.next();
                
                writeFile.write(stuName);
                writeFile.newLine();
                writeFile.write(score);
                writeFile.newLine();
            }
            writeFile.close();
            out.close();
            System.out.println("Data written to file.\n");
            
        } catch (IOException e) {
            System.out.println("Problem writing to file.");
            System.err.println("IOException: " + e.getMessage());
        }

        try {
            if (dataFile != null) {
                in = new FileReader(dataFile);
                readFile = new BufferedReader(in);
                
                while ((stuName = readFile.readLine()) != null) {
                    score = readFile.readLine();
                    System.out.println(stuName + " " + score);
                    numScores += 1;
                    
                    scoreValue = Double.parseDouble(score);
                    totalScores += scoreValue;
                    
                    if (scoreValue < lowScore) lowScore = scoreValue;
                    if (scoreValue > highScore) highScore = scoreValue;
                }
                
                if (numScores > 0) {
                    avgScore = totalScores / numScores;
                    System.out.println("Low score = " + percent.format(lowScore / 100));
                    System.out.println("High score = " + percent.format(highScore / 100));
                    System.out.println("Average score = " + percent.format(avgScore / 100));
                }
                
                readFile.close();
                in.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist or could not be found.");
            System.err.println("FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Problem reading file.");
            System.err.println("IOException: " + e.getMessage());
        }
        
        input.close();
    }
}