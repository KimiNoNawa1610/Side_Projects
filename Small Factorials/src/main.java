import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/*
Problem:
You are asked to calculate factorials of some small positive integers.

Input:
An integer t, 1<=t<=100, denoting the number of testcases, followed by t lines, each containing a single integer n, 1<=n<=100.

Output;
For each integer n given at input, display a line with the value of n!
 */
public class main {
    
    public double factorial(int x){
        if(x<=0||x==1){
            return 1;
        }
        else{
            return x*factorial(x-1);
        }
    }

    public static void main(String[] args) throws IOException {
        main m=new main();
        String data="";
        File file=new File("D:\\Side_Projects\\Small Factorials\\Input.txt");
        Scanner scan=new Scanner(file);
        while(scan.hasNextLine()){
            data=data+" "+scan.nextLine();
        }
        StringBuilder sr=new StringBuilder(data);
        sr.deleteCharAt(0);
        data=sr.toString();
        String[] Input=data.split(" ");
        FileWriter newFile=new FileWriter("Output.txt");
        for(int i=1;i<=Integer.parseInt(Input[0]);i++){
            newFile.write(Double.toString(m.factorial(Integer.parseInt(Input[i]))));
            newFile.write("\n");
        }
        newFile.close();
    }
}
