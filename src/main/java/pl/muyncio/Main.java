package pl.muyncio;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Generator generator = new Generator();
        FileCreator fileCreator = new FileCreator();
        WriteToFile writeToFile = new WriteToFile();


        fileCreator.FileCreator("target/text");
        String x = generator.nameAndSurnameToXML(1000);
        writeToFile.writer("target/text.xml",x);
    }
}
