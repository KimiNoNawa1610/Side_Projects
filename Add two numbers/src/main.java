import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/*
Problem:
Shivam is the youngest programmer in the world, he is just 12 years old.
Shivam is learning programming and today he is writing his first program.
Program is very simple, Given two integers A and B, write a program to add these two numbers.

Example:
Input
3
1 2
100 200
10 40

Output
3
300
50
 */
public class main {

    public static void main(String[] args) throws IOException {

        String data=" ";

        File file=new File("D:\\Side_Projects\\Add two numbers\\Input.txt");

        Scanner scan=new Scanner(file);

        while( scan.hasNextLine()){

            data=data+" "+scan.nextLine();

        }
        StringBuilder sr=new StringBuilder(data);

        sr.deleteCharAt(0);

        sr.deleteCharAt(0);

        data=sr.toString();

        String[] tempin=data.split(" ");

        System.out.println(Arrays.toString(tempin));

        int[] input=new int[tempin.length];

        for(int i=0;i<tempin.length;i++){

            input[i]=Integer.parseInt(tempin[i]);

        }

        System.out.println(Arrays.toString(input));

        int[] output=new int[input[0]];

        int num=0;

        for(int i=1;i<input.length;i=i+2){

            output[num]=input[i]+input[i+1];

            num++;

        }

        System.out.println(Arrays.toString(output));

        FileWriter Newfile=new FileWriter("Output.txt");

        for(int i:output){

            Newfile.write(Integer.toString(i));

            Newfile.write("\n");

        }

        Newfile.close();
    }
}
