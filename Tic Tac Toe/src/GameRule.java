import java.util.ArrayList;

public class GameRule {

    private Board board;

    public GameRule(int n){

        board=new Board(n,n);

    }

    public Board getBoard(){

        return board;

    }

    public boolean WinCondition(){

        ArrayList<ArrayList<String>> tempRow=new ArrayList<>(board.getRow());


        Logger log =new Logger(this);

        Logger.setInstance(log);

        for(int i=0;i<tempRow.size();i++){


            if(!tempRow.get(i).contains("|o|")&&!tempRow.get(i).contains("|_|")){

                //log.logMove("x","Condition 1" );

                log.logMove("x","is the winner");

                return true;

            }

            else if(!tempRow.get(i).contains("|x|")&&!tempRow.get(i).contains("|_|")){

                //log.logMove("o","Condition 1" );

                log.logMove("o","is the winner");

                return true;

            }

            else if(!board.getColumn(i).contains("|x|")&&!board.getColumn(i).contains("|_|")){

                //log.logMove("o","Condition 2" );

                log.logMove("o","is the winner");

                return true;

            }

            else if(!board.getColumn(i).contains("|o|")&&!board.getColumn(i).contains("|_|")){

                //log.logMove("x","Condition 2" );

                log.logMove("x","is the winner");

                return true;

            }

        }

        if(!board.getMainDiag().contains("|x|")&&!board.getMainDiag().contains("|_|")){

            //log.logMove("o","Condition 3" );

            log.logMove("o","is the winner");

            return true;

        }

        else if(!board.getMainDiag().contains("|o|")&&!board.getMainDiag().contains("|_|")){

            //log.logMove("X","Condition 3" );

            log.logMove("x","is the winner");

            return true;

        }

        else if(!board.getReverseMainDiag().contains("|o|")&&!board.getReverseMainDiag().contains("|_|")){

            //log.logMove("x","Condition 4" );

            log.logMove("x","is the winner");

            return true;

        }

        else if(!board.getReverseMainDiag().contains("|x|")&&!board.getReverseMainDiag().contains("|_|")){

            //log.logMove("o","Condition 4" );

            log.logMove("o","is the winner");

            return true;

        }


        return false;

    }








}
