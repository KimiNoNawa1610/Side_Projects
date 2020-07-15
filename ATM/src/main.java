import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


/*
Problem: Pooja would like to withdraw X $US from an ATM. The cash machine will only accept the transaction if X is a multiple of 5,
and Pooja's account balance has enough cash to perform the withdrawal transaction (including bank charges). For each successful
withdrawal the bank charges 0.50 $US. Calculate Pooja's account balance after an attempted transaction.
 */
public class main {

    public static void main(String[] args) throws IOException {

        String data="";

        File NewFile=new File("D:\\Side_Projects\\ATM\\src\\Input.txt");

        Scanner scan=new Scanner(NewFile);

        while (scan.hasNextLine()){

            data= scan.nextLine();

        }

        String[] part=data.split(" ");

        double[] input=new double[2];

        for(int i=0;i<part.length;i++){

            input[i]=Double.parseDouble(part[i]);

        }

        FileWriter output=new FileWriter("Output.txt");

        if(input[0]%5!=0){

            output.write(Double.toString(input[1]));

        }
        else if(input[0]> input[1]){

            output.write(Double.toString(input[1]));

        }

        else{

            output.write(Double.toString(input[1]-0.5-input[0]));

        }
        
        output.close();
    }
}
