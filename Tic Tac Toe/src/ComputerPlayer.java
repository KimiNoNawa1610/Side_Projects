import java.util.ArrayList;
import java.util.Arrays;

public class ComputerPlayer {

    private GameRule game;

    private String Symbol;

    public ComputerPlayer(GameRule b,String sym){

        game=b;

        Symbol=sym;

    }

    public void MakeMove(){

        if(game.WinCondition()==false){

            ArrayList<Integer> position= new ArrayList<>(emptySlots());

            int[] temp=position.stream().mapToInt(p-> p).toArray();

            int n=position.size();

            if(n==0){

                Logger log=new Logger(game);

                log.logString("It is a raw");
            }

            int height=Minimax.Log2(n);

            int output= Minimax.minimax(0,0,true,temp,height);

            System.out.println(output);

            if(Symbol=="x"){

                game.getBoard().Xmove((int)output/10,(int)output%10);

            }

            else if(Symbol=="o"){

                game.getBoard().Omove((int)output/10,(int)output%10);

            }

        }

    }

    public ArrayList<Integer> emptySlots(){

        ArrayList<Integer> coordinate=new ArrayList<>();

        int counter =0;

        for(int i=0;i<game.getBoard().getRow().size();i++){

            for(int j=0;j<game.getBoard().getRow().size();j++){

                counter+=1;

                if(game.getBoard().getRow().get(i).get(j)=="|_|") {

                    String num=i+""+j;

                    System.out.println(num+"|"+Integer.valueOf(num));

                    coordinate.add(Integer.valueOf(num));



                }

            }

        }
        System.out.println(Arrays.toString(coordinate.toArray()));
        return coordinate;

    }





}
