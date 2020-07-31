import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
Problem:
Three numbers A, B and C are the inputs. Write a program to find second largest among them.

Input:
The first line contains an integer T, the total number of testcases. Then T lines follow, each line contains three integers A, B and C.

Output:
For each test case, display the second largest among A, B and C, in a new line.
 */
public class main {
    public int SecondLargest(int a,int b, int c){
        ArrayList<Integer> A=new ArrayList<>();
        A.add(a);
        A.add(b);
        A.add(c);
        int min=a,max=0;
        for(int i=0;i<A.size();i++){
            if(A.get(i)>max){
                max=A.get(i);
            }
            else if(A.get(i)<min){
                min=A.get(i);
            }
        }
        A.remove(Integer.valueOf(max));
        A.remove(Integer.valueOf(min));
        return A.get(0);
    }

    public static void main(String[] args) throws IOException {
        main m=new main();
        File file=new File("D:\\Side_Projects\\SecondLargest\\Input.txt");
        Scanner scan=new Scanner(file);
        String data="";
        while(scan.hasNext()){
            data+=" "+scan.nextLine();
        }
        StringBuilder sr=new StringBuilder(data);
        sr.deleteCharAt(0);
        data=sr.toString();
        String[] in=data.split(" ");
        int[] tempin=new int[in.length-1];
        FileWriter newfile=new FileWriter("Output.txt");
        for(int i=1;i<in.length;i++){
            tempin[i-1]=Integer.parseInt(in[i]);
        }
        for(int i=0;i<tempin.length;i+=3){
            int a=tempin[i];
            int b=tempin[i+1];
            int c=tempin[i+2];
            newfile.write(Integer.toString(m.SecondLargest(a,b,c)));
            newfile.write("\n");
        }
        newfile.close();

    }
}
