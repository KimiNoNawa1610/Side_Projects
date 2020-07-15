import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
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
        System
    }
}
