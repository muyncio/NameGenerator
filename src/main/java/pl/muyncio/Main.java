package pl.muyncio;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Generator generator = new Generator();
        FileCreator fileCreator = new FileCreator();
        WriteToFile writeToFile = new WriteToFile();

        String x = "przykladowy text";

        fileCreator.FileCreator("target/text");
        writeToFile.writer("target/text.xml",x);
    }
}
