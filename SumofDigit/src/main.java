import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
/*
Problem:
You're given an integer N. Write a program to calculate the sum of all the digits of N.

Input:
The first line contains an integer T, the total number of testcases.
Then follow T lines, each line contains an integer N.

Output:
For each test case, calculate the sum of digits of N, and display it in a new line.
 */

public class main {
    public static void main(String[] args) throws IOException {
        File NewFile=new File("D:\\Side_Projects\\SumofDigit\\Input.txt");
        Scanner scan=new Scanner(NewFile);
        String data=" ";

        while(scan.hasNextLine()){
            data=data+" "+scan.nextLine();
        }
        StringBuilder tempin=new StringBuilder(data);
        tempin.deleteCharAt(0);
        tempin.deleteCharAt(0);
        data=tempin.toString();
        System.out.println(data);
        String[] Input=data.split(" ");
        System.out.println(Arrays.toString(Input));
        FileWriter Output=new FileWriter("Output.txt");
        for(int i=2;i<Input.length;i++){
            int out=0;
            String[] temp=Input[i].split("");
            System.out.println(Arrays.toString(temp));
            for(int j=0;j<temp.length;j++) {
                out = out + Integer.parseInt(temp[j]);
            }
            Output.write(Integer.toString(out));
            Output.write("\n");
        }
        Output.close();
    }
}

