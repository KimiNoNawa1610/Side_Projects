import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/*
Problem:
Assume that you happen to hear the above words and you want to give a try in finding the square root of any given integer using in-built functions.
So here's your chance.

Input:
The first line of the input contains an integer T, the number of test cases. T lines follow.
Each line contains an integer N whose square root needs to be computed.

Output:
For each line of the input, output the square root of the input integer, rounded down to the nearest integer, in a new line.
 */
public class main {
    public int SquareRoot(int n){
        int out= (int) Math.pow(n,0.5);
        return out;
    }
    public static void main(String[] args) throws IOException {
        main m=new main();
        File file=new File("D:\\Side_Projects\\FindingSquareRoot\\Input.txt");
        Scanner scan=new Scanner(file);
        String data="";
        while(scan.hasNextLine()){
            data+=" "+scan.nextLine();
        }
        StringBuilder sr=new StringBuilder(data);
        sr.deleteCharAt(0);
        data=sr.toString();
        String[] temp=data.split(" ");
        int[] dataout=new int[temp.length-1];
        for(int i=1;i<temp.length;i++){
            dataout[i-1]=m.SquareRoot(Integer.parseInt(temp[i]));
        }
        FileWriter newfile=new FileWriter("Output.txt");
        for(int i:dataout){
            newfile.write(Integer.toString(i));
            newfile.write("\n");
        }
        newfile.close();
    }
}
