package mastery;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class WordGuess {
    public static void main(String[] args) {
        final String FLAG = "!";
        
        File file = new File("../chapter11/src/skillbuilder/words.txt"); 
        
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        
        int numWords = 0, wordToGuess;
        String secretWord = "";
        String wordSoFar = "", updatedWord = "";
        String letterGuess = ""; 
        int numGuesses = 0;
        
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while (bufferedReader.readLine() != null) {
                numWords++;
            }
            bufferedReader.close();
            fileReader.close();
            
            if (numWords == 0) {
                System.out.println("The word file is empty. Exiting game.");
                input.close();
                return;
            }
            
            wordToGuess = random.nextInt(numWords);
            
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            
            for (int i = 0; i <= wordToGuess; i++) {
                secretWord = bufferedReader.readLine().trim().toLowerCase();
            }
            
            bufferedReader.close();
            fileReader.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Error: The words file could not be found.");
            input.close();
            return;
        } catch (IOException e) {
            System.out.println("Error: An issue occurred while reading the file.");
            input.close();
            return;
        }
        
        System.out.println("WordGuess game.\n");
        
        for (int i = 0; i < secretWord.length(); i++) {
            wordSoFar += "-";
        }
        
        System.out.println("Hidden word: " + wordSoFar);
        
        do {
            System.out.print("Enter a letter (or '" + FLAG + "' to quit): ");
            letterGuess = input.nextLine().trim().toLowerCase();
            
            if (letterGuess.equals(FLAG)) {
                break;
            }
            
            if (letterGuess.length() != 1) {
                System.out.println("Please enter exactly one letter.");
                continue;
            }
            
            numGuesses++;
            
            updatedWord = "";
            char guessedChar = letterGuess.charAt(0);
            for (int i = 0; i < secretWord.length(); i++) {
                if (secretWord.charAt(i) == guessedChar) {
                    updatedWord += guessedChar;
                } else {
                    updatedWord += wordSoFar.charAt(i);
                }
            }
            wordSoFar = updatedWord;
            
            System.out.println(wordSoFar);
            
        } while (!letterGuess.equals(FLAG) && !wordSoFar.equals(secretWord));
        
//        if (wordSoFar.equals(secretWord)) {
            System.out.println("\nCongratulations! You guessed the word: " + secretWord);
            System.out.println("Total guesses made: " + numGuesses);
//        } else {
//            System.out.println("\nGame over. You didn't finish. The word was: " + secretWord);
//        }
        
        input.close();
    }
}