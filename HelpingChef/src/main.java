import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/*
Problem:
Write a program, which takes an integer N and if the number is less than 10 then display "Thanks for helping Chef!" otherwise print "-1".
 */
public class main {
    public static void main(String[] args) throws IOException {
        File file=new File("Input.txt");
        Scanner scan=new Scanner(file);
        String data="";
        while(scan.hasNext()){
            data+=" "+scan.nextLine();
        }
        StringBuilder sr=new StringBuilder(data);
        sr.deleteCharAt(0);
        data=sr.toString();
        String[] in=data.split(" ");
        FileWriter newfile=new FileWriter("Output.txt");
        int limit=10;
        for(int i=1;i<in.length;i++){
            if(Integer.parseInt(in[i])<limit){
                newfile.write("Thanks for helping Chef!");
                newfile.write("\n");
            }
            else{
                newfile.write("-1");
                newfile.write("\n");
            }
        }
        newfile.close();
    }
}
