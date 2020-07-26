import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/*
Problem:

The game of billiards involves two players knocking 3 balls around on a green baize table. Well, there is more to it, but for our purposes this is sufficient.
The game consists of several rounds and in each round both players obtain a score, based on how well they played. Once all the rounds have been played,
the total score of each player is determined by adding up the scores in all the rounds and the player with the higher total score is declared the winner.
The Siruseri Sports Club organises an annual billiards game where the top two players of Siruseri play against each other.
The Manager of Siruseri Sports Club decided to add his own twist to the game by changing the rules for determining the winner.
In his version, at the end of each round, the cumulative score for each player is calculated, and the leader and her current lead are found.
Once all the rounds are over the player who had the maximum lead at the end of any round in the game is declared the winner.
Your task is to help the Manager find the winner and the winning lead. You may assume that the scores will be such that there will always be a single winner. That is, there are no ties.

Input

The first line of the input will contain a single integer N (N ≤ 10000) indicating the number of rounds in the game.
Lines 2,3,...,N+1 describe the scores of the two players in the N rounds.
Line i+1 contains two integer Si and Ti, the scores of the Player 1 and 2 respectively, in round i. You may assume that 1 ≤ Si ≤ 1000 and 1 ≤ Ti ≤ 1000.

Output

Your output must consist of a single line containing two integers W and L, where W is 1 or 2 and indicates the winner and L is the maximum lead attained by the winner.
 */
public class main {
    public int[] maxlead(String[] array){
        int max=0;
        int[] out=new int[2];
        int winner=0;
        for(int i=1;i<array.length;i+=2){
            int temp=Math.abs(Integer.parseInt(array[i])-Integer.parseInt(array[i+1]));
            if(temp>max){
                max=temp;
                if(Integer.parseInt(array[i])>Integer.parseInt(array[i+1])){
                    winner=1;
                }
                else{
                    winner=2;
                }
            }
        }
        out[0]=winner;
        out[1]=max;
        return out;
    }
    public static void main(String[] args) throws IOException {
        main m=new main();
        File file=new File("D:\\Side_Projects\\LeadGame\\Input.txt");
        Scanner scan=new Scanner(file);
        String data="";
        while(scan.hasNextLine()){
            data+=" "+scan.nextLine();
        }
        StringBuilder sr=new StringBuilder(data);
        sr.deleteCharAt(0);
        data=sr.toString();
        String[] Intemp=data.split(" ");
        int[]out=m.maxlead(Intemp);
        FileWriter newfile=new FileWriter("Output.txt");
        newfile.write(Integer.toString(out[0])+" "+Integer.toString(out[1]));
        newfile.close();

    }
}
