/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.linkedinlearning.advancejava.filesanddirectories.pathclassexample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Bethan Palmer
 */
public class PathClassExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Path path = Paths.get("example1.txt");
        try {
            Files.deleteIfExists(path);
        } catch (IOException ex) {

        }

        Path path2 = Paths.get("C:\\Users\\da.rota\\Downloads\\eclipse_workspace\\Demo\\example.txt");
        System.out.println(path2.getParent());
        System.out.println(path2.getRoot());
        System.out.println(path2.getFileName());

    }

}
