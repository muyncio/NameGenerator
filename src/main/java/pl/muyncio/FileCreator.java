package pl.muyncio;

import java.io.File;
import java.io.IOException;

public class FileCreator {

    public void FileCreator(String pathAndFileName){
        try {
            pathAndFileName += ".xml";
            File myObj = new File(pathAndFileName);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
