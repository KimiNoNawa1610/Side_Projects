import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/*
Problem:
Write a program that accepts a number, n, and outputs the same.
 */
public class main {
    public static void main(String[] args) throws IOException {
        File NewFile=new File("D:\\Side_Projects\\FileWriterPractice\\Input.txt");
        Scanner scan=new Scanner(NewFile);
        String data=" ";
        while(scan.hasNextLine()){
            data=scan.nextLine();
        }

        FileWriter Output=new FileWriter("Output.txt");
        Output.write(data);
        Output.close();
    }
}
