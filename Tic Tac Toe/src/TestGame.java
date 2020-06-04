import java.util.Scanner;

public class TestGame {

    public static void main(String[] args){

        GameRule game= new GameRule(3);

        Scanner scan=new Scanner(System.in);

        System.out.println("Please choose your number symbol \n1.x\n2.o");

        int input=scan.nextInt();

        while(input!=1&&input!=2){

            System.out.println("Incorrect input, please choose your symbol again");

            input=scan.nextInt();


        }

        System.out.println(game.getBoard());

        if(input==1){

            ComputerPlayer Ai=new ComputerPlayer(game,"o");

            while(game.getEndGame()==false){

                System.out.println("Please enter your move ");

                int coordinate1=scan.nextInt();

                int coordinate2=scan.nextInt();

                if(game.LegalMove(coordinate1,coordinate2)==true){


                    game.getBoard().Xmove(coordinate1,coordinate2);

                }

                else{

                    System.out.println("You cannot make that move");

                    coordinate1=scan.nextInt();

                    coordinate2=scan.nextInt();

                }

                System.out.println(game.getBoard());

                System.out.println("Computer turn: ");

                Ai.MakeMove();

                System.out.println(game.getBoard());

                System.out.println("Your turn: ");


            }

        }

        else if(input==2){

            ComputerPlayer Ai=new ComputerPlayer(game,"x");

            while(game.getEndGame()==false){

                System.out.println(" Please enter your move ");

                int coordinate1=scan.nextInt();

                int coordinate2=scan.nextInt();

                if(game.LegalMove(coordinate1,coordinate2)==true){


                    game.getBoard().Omove(coordinate1,coordinate2);

                }

                else{

                    System.out.println("You cannot make that move");

                    coordinate1=scan.nextInt();

                    coordinate2=scan.nextInt();

                }

                System.out.println(game.getBoard());

                System.out.println("Computer turn: ");

                Ai.MakeMove();

                System.out.println(game.getBoard());

                System.out.println("Your turn: ");

            }

        }




    }


}
