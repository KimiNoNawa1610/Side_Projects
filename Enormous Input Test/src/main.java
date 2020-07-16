import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws IOException {

        String data="";

        File NewFile=new File("D:\\Side_Projects\\Enormous Input Test\\src\\Input.txt");

        Scanner scan=new Scanner(NewFile);

        while(scan.hasNextLine()){

            data=data+" "+scan.nextLine();

        }

        StringBuilder newdata=new StringBuilder(data);

        newdata.deleteCharAt(0);

        data=newdata.toString();

        String[] input=data.split(" ");

        int[] tempin=new int[input.length];

        for(int i=0;i< input.length;i++){

            tempin[i]=Integer.parseInt(input[i]);

        }

        int bench=tempin[1];

        int output=0;

        for(int i=2;i<tempin.length;i++){

            if(tempin[i]%bench==0){

                output+=1;

            }

        }

        System.out.println("There are "+output+" number(s) divisible by "+bench);

        FileWriter out=new FileWriter("Output.txt");

        out.write(String.valueOf(output));

        out.close();

    }
}
