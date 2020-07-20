import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/*
Problem:
Given the list of numbers, you are to sort them in non decreasing order.

Input
t – the number of numbers in list, then t lines follow [t <= 10^6].
Each line contains one integer: N [0 <= N <= 10^6

Output
Output given numbers in non decreasing order.

**Due to the large number and data, radix sort is the best way to go
 */
public class main {

    public int getMax(int[] array){
        int max=array[0];
        for(int i=1;i<array.length;i++){
            if(max<array[i]){
                max=array[i];
            }
        }
        return max;
    }

    public void CountSort(int[] array, int find){
        int n=array.length;
        int[] newout=new int[n];
        int[] count =new int[10];
        //store the count of occurences in count[]
        for(int i=0;i<n;i++){
            count[(array[i]/find)%10]++;
        }
        //change count[i] so that count[i] now contain actual position
        //of this digit of newout[]
        for(int i=1;i<10;i++){
            count[i]+=count[i-1];
        }
        //build the newout array
        for(int i=n-1;i>=0;i--){
            newout[count[(array[i]/find)%10]-1]=array[i];
            count[(array[i]/find)%10]--;
        }
        //Copy the output array to array[], so that array[] is now containing
        // sorted numbers according to curent digit
        for(int i=0;i<n;i++){
            array[i]=newout[i];
        }
    }

    public void RadixSort(int[] array){
        int n=array.length;
        int m=getMax(array);
        for(int i=1;m/i>0;i*=10){
            CountSort(array,i);
        }
    }

    public static void main(String[] args) throws IOException {
        File file=new File("D:\\Side_Projects\\Turbo sort\\Input.txt");
        Scanner scan=new Scanner(file);
        String data=" ";
        while(scan.hasNextLine()){
            data+=" "+scan.nextLine();
        }
        System.out.println(data);
        StringBuilder sr=new StringBuilder(data);
        sr.deleteCharAt(0);
        sr.deleteCharAt(0);
        data=sr.toString();
        System.out.println(data);
        String[] temp=data.split(" ");
        System.out.println(Arrays.toString(temp));
        int[] Input=new int[temp.length-1];
        for(int i=1;i<temp.length;i++){
            Input[i-1]=Integer.parseInt(temp[i]);
        }
        System.out.println(Arrays.toString(Input));
        main main=new main();
        main.RadixSort(Input);
        FileWriter newfile=new FileWriter("Output.txt");
        for(int i:Input){
            newfile.write(Integer.toString(i));
            newfile.write("\n");
        }
        newfile.close();


    }
}
