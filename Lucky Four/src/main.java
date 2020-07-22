import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/*
Problem:
Kostya likes the number 4 much. Of course! This number has such a lot of properties.
Impressed by the power of this number, Kostya has begun to look for occurrences of four anywhere.
He has a list of T integers, for each of them he wants to calculate the number of occurrences of
the digit 4 in the decimal representation. He is too busy now, so please help him.

Input
The first line of input consists of a single integer T, denoting the number of integers in Kostya's list.
Then, there are T lines, each of them contain a single integer from the list.

Output
Output T lines. Each of these lines should contain the number of occurences of the digit 4 in the respective integer from Kostya's list.
 */
public class main {
    public int FindRecussion(int n, int x){
        int count=0;
        String data=Integer.toString(n);
        if(data.length()==1&& n==x){
            count=1;
        }
        else {
            String[] temp =data.split("");
            for(String i:temp){
                if(i.equals(Integer.toString(x))){
                    count++;
                }
            }

        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        main m=new main();
        File file=new File("D:\\Side_Projects\\Lucky Four\\Input.txt");
        Scanner scan=new Scanner(file);
        String data="";
        while(scan.hasNextLine()){
            data+=" "+scan.nextLine();
        }
        StringBuilder sr=new StringBuilder(data);
        sr.deleteCharAt(0);
        data=sr.toString();
        String[] Input=data.split(" ");
        int[] out=new int[Input.length-1];
        for(int i=1;i<Input.length;i++){
            out[i-1]=m.FindRecussion(Integer.parseInt(Input[i]),4);
        }
        FileWriter newfile=new FileWriter("Output.txt");
        for(int i:out){
            newfile.write(Integer.toString(i));
            newfile.write("\n");
        }
        newfile.close();

    }
}
