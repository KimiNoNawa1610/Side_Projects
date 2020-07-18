import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        File NewFile=new File("D:\\Side_Projects\\FindReminder\\Input.txt");
        Scanner scan=new Scanner(NewFile);
        String data=" ";

        while(scan.hasNextLine()){
            data=data+" "+scan.nextLine();
        }
        StringBuilder tempin=new StringBuilder(data);
        tempin.deleteCharAt(0);
        tempin.deleteCharAt(0);
        data=tempin.toString();
        System.out.println(data);
        String[] Input=data.split(" ");
        System.out.println(Arrays.toString(Input));

    }
}
