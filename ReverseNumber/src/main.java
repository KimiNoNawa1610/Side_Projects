import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/*
Problem:
Given an Integer N, write a program to reverse it.

Input
The first line contains an integer T, total number of testcases.
Then follow T lines, each line contains an integer N

For each test case, display the reverse of the given number N, in a new line.
 */
public class main {
    public int reverse(int num){
        int out=0;
        while(num!=0){
            int digit=num%10;
            out=out*10+digit;
            num/=10;
        }
        return out;
    }
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\Side_Projects\\ReverseNumber\\Input.txt");
        Scanner scan=new Scanner(file);
        String data="";
        while(scan.hasNextLine()){
            data+=" "+scan.nextLine();
        }
        StringBuilder sr=new StringBuilder(data);
        sr.deleteCharAt(0);
        data=sr.toString();
        String[] temp=data.split(" ");
        int[] out=new int[temp.length-1];
        main m=new main();
        for(int i=1;i<temp.length;i++){
            out[i-1]=m.reverse(Integer.parseInt(temp[i]));

        }
        FileWriter newfile=new FileWriter("Output.txt");
        for(int i:out){
            newfile.write(Integer.toString(i));
            newfile.write("\n");
        }
        newfile.close();
    }
}
