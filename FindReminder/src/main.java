import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
/*
Problem:
Write a program to find the remainder when an integer A is divided by an integer B.

Input:
The first line contains an integer T, the total number of test cases.
Then T lines follow, each line contains two Integers A and B.

Output:
For each test case, find the remainder when A is divided by B, and display it in a new line.
 */
public class main {
    public static void main(String[] args) throws IOException {
        File NewFile=new File("D:\\Side_Projects\\FindReminder\\Input.txt");
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
        for(int i=2;i<Input.length;i+=2){
            Output.write(Integer.toString(Integer.parseInt(Input[i])%Integer.parseInt(Input[i+1])));
            Output.write("\n");
        }
        Output.close();

    }
}
