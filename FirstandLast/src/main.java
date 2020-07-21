import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/*
Problem:
If Give an integer N . Write a program to obtain the sum of the first and last digits of this number.

Input
The first line contains an integer T, the total number of test cases. Then follow T lines, each line contains an integer N.

Output
For each test case, display the sum of first and last digits of N in a new line.
 */
public class main {
    public int SumFirstLast(int num){
        if(Integer.toString(num).length()==1){
            return num;
        }
        else{
            String[] tempin=Integer.toString(num).split("");
            int out=Integer.parseInt(tempin[0])+Integer.parseInt(tempin[tempin.length-1]);
            return out;
        }
    }
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\Side_Projects\\FirstandLast\\Input.txt");
        Scanner scan=new Scanner(file);
        String data="";
        while(scan.hasNextLine()){
            data+=" "+scan.nextLine();
        }
        StringBuilder sr=new StringBuilder(data);
        sr.deleteCharAt(0);
        data=sr.toString();
        main m=new main();
        String[] tempin=data.split(" ");
        int[] out=new int[tempin.length-1];
        for(int i=1;i<tempin.length;i++){
            out[i-1]=m.SumFirstLast(Integer.parseInt(tempin[i]));
        }
        FileWriter newfile=new FileWriter("Output.txt");
        for(int i:out){
            newfile.write(Integer.toString(i));
            newfile.write("\n");
        }
        newfile.close();
    }
}
