import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/*
Problem:
Tomya like a positive integer p, and now she wants to get a receipt of Ciel's restaurant whose total price is exactly p.
Note that the i-th menu has the price 2i-1 (1 ≤ i ≤ 12).
Since Tomya is a pretty girl, she cannot eat a lot. So please find the minimum number of menus whose total price is exactly p.
Note that if she orders the same menu twice, then it is considered as two menus are ordered.

Input:
The first line contains an integer T, the number of test cases. Then T test cases follow. Each test case contains an integer p.

Output:
For each test case, print the minimum number of menus whose total price is exactly p.
 */
public class main {
    int minimumCourses(int sum) {
        int prices=2048, courses=0;
        while(sum>0){
            courses+=sum/prices;
            sum%=prices;
            prices/=2;
        }
        return courses;
    }


    public static void main(String[] args) throws IOException {
        main m=new main();
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
        FileWriter newFile=new FileWriter("Output.txt");
        for(int i=1;i<in.length;i++){
            newFile.write(Integer.toString(m.minimumCourses(Integer.parseInt(in[i]))));
            newFile.write("\n");
        }
        newFile.close();
    }

}
