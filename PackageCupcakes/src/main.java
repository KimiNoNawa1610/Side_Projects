import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/*
Problem:
Now that Chef has finished baking and frosting his cupcakes, it's time to package them.
Chef has N cupcakes, and needs to decide how many cupcakes to place in each package.
Each package must contain the same number of cupcakes.
Chef will choose an integer A between 1 and N, inclusive, and place exactly A cupcakes into each package.
Chef makes as many packages as possible. Chef then gets to eat the remaining cupcakes.
Chef enjoys eating cupcakes very much. Help Chef choose the package size A that will let him eat as many cupcakes as possible.

Input:
Input begins with an integer T, the number of test cases. Each test case consists of a single integer N, the number of cupcakes.

Output:
For each test case, output the package size that will maximize the number of leftover cupcakes.
If multiple package sizes will result in the same number of leftover cupcakes, print the largest such size.
 */
public class main {
    public int MaxPackage(int n){
        return (n/2)+1;
    }
    public static void main(String[] args) throws IOException {
        File file=new File("D:\\Side_Projects\\PackageCupcakes\\Input.txt");
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
        main m=new main();
        for(int i=1;i<in.length;i++){
            newfile.write(Integer.toString(m.MaxPackage(Integer.parseInt(in[i]))));
            newfile.write("\n");
        }
        newfile.close();
    }
}
