package practice;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class Problem5 {

    public static void main(String[] args) {
        String arr[] = new String[10];
        ArrayList<String> mkdir = new ArrayList<>();

        FileWriter writer;
        PrintWriter out;
        int dirCounter = 0;
        try {

            BufferedReader in = new BufferedReader(new FileReader("/Users/anassiry/eclipse-workspace/JavaPracticesNov2018/src/practice/prog5.dat"));
            String line;
            line = in.readLine();
            writer = new FileWriter("/Users/anassiry/eclipse-workspace/JavaPracticesNov2018/src/practice/prog5.out");
            out = new PrintWriter(writer);
            out.println("Problem 5 by team X");

            while (line != null) {
                arr = line.split(" ");

                if (arr[0].equals("dir") && arr[0] != null) {
                    out.println("Command: " + arr[0] + "\nDirectory of root: " + Paths.get(".").toAbsolutePath().normalize().toString());
                    if (dirCounter == 0) {
                        out.println("No Subdirectories");
                    }
                    if (dirCounter > 0) {
                        for (int i = 0; i < mkdir.size(); i++) {
                            out.print(mkdir.get(i) + " ");
                        }
                        out.println();
                    }

                }
                if (arr[0].equals("mkdir")) {
                    
                    out.println("Command: " + arr[0] + " " + arr[1]);
                    if (mkdir.contains(arr[1])) {
                        out.println("Subdirectory already exists");
                    } else {
                        mkdir.add(arr[1]);
                        dirCounter++;
                    }

                }

                if (arr[0].equals("cd")) {
                    out.println("Command: " + arr[0] + " " + arr[1]);
                    if (!mkdir.contains(arr[1])) {
                        out.println("Subdirectory does not exist");
                    }
                    else
                    {
                        
                    }
                        

                }

                line = in.readLine();

            }
            in.close();
            out.close();

        } catch (IOException e) {
            System.out.println("file not found");
            e.printStackTrace();

        }

    }

}
