package com.engeto.RSSctecka;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class File {

    public static File loadFromFile(String filename) throws FileException {
        File fileResult = new File();
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(filename)))){
            while (scanner.hasNext()) {
                //String line = scanner.nextLine();
                System.out.println(scanner.next());
            }
        } catch (FileNotFoundException eFile){
            throw new FileException("Soubor "+filename+ " neexistuje!"+eFile.getLocalizedMessage());
        }
        return fileResult;
    }


}
