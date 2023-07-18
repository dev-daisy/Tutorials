
package demo.linkedinlearning.advancejava.filesanddirectories.fileexample;

import java.io.File;
import java.io.IOException;


public class FileCreationExample {

    public static void main(String[] args) {

        File myFile = new File("CC:\\Users\\da.rota\\Downloads\\eclipse_workspace\\Demo\\example.txt");
        try {
            boolean fileCreated = myFile.createNewFile();
            System.out.println(fileCreated);
        } catch (IOException ioe) {

        }

    }

}