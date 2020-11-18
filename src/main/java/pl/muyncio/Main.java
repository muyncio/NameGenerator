package pl.muyncio;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Generator generator = new Generator();
        FileCreator fileCreator = new FileCreator();
        WriteToFile writeToFile = new WriteToFile();

        System.out.println("how many rows:");
        int rows = input.nextInt();
        String x = generator.nameAndSurnameToXML(rows);
        System.out.println("where you want to save file:");
        String path = input2.nextLine();

        fileCreator.FileCreator(path);
        writeToFile.writer((path + ".xml"),x);
    }
}
