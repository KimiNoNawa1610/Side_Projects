import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

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

    public void Sort(int[] array, int find){
        int n=array.length;
        int[] newout=new int[n];
        int[] count =new int[10];
        for(int i=0;i<n;i++){
            count[(array[i]/find)%10]++;
        }
        for(int i=1;i<10;i++){
            count[i]+=count[i-1];
        }
        for(int i=n-1;i>=0;i--){
            
        }
    }

    public void RadixSort(int[] array){
        int n=array.length;
        int m=getMax(array);
        for(int i=1;m/i>0;i*=10){
            Sort(array,i);
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("D:\\Side_Projects\\Turbo sort\\Input.txt");
        Scanner scan=new Scanner(file);
        String data="";
        while(scan.hasNextLine()){
            data+=scan.nextLine();
        }
        System.out.println(data);
        String[] temp=data.split("");
        System.out.println(Arrays.toString(temp));
        int[] Input=new int[temp.length-1];
        for(int i=1;i<temp.length;i++){
            Input[i-1]=Integer.parseInt(temp[i]);
        }
        System.out.println(Arrays.toString(Input));

    }
}
