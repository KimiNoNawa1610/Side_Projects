import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    
    public static void main(String[] args) throws FileNotFoundException {

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

        double[] tempin=new double[input.length];

        for(int i=0;i< input.length;i++){

            tempin[i]=Double.parseDouble(input[i]);

        }

    }
}
