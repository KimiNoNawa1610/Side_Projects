import java.util.ArrayList;

public class GameRule {

    private Board board;

    private Boolean EndGame;

    public GameRule(int n){

        board=new Board(n,n);

        EndGame=false;

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

                log.logMove("x","is the winner");

                EndGame=true;

                return true;

            }

            else if(!tempRow.get(i).contains("|x|")&&!tempRow.get(i).contains("|_|")){

                log.logMove("o","is the winner");

                EndGame=true;

                return true;

            }

            else if(!board.getColumn(i).contains("|x|")&&!board.getColumn(i).contains("|_|")){

                log.logMove("o","is the winner");

                EndGame=true;

                return true;

            }

            else if(!board.getColumn(i).contains("|o|")&&!board.getColumn(i).contains("|_|")){

                //log.logMove("x","Condition 2" );

                log.logMove("x","is the winner");

                EndGame=true;

                return true;

            }

        }

        if(!board.getMainDiag().contains("|x|")&&!board.getMainDiag().contains("|_|")){

            //log.logMove("o","Condition 3" );

            log.logMove("o","is the winner");

            EndGame=true;

            return true;

        }

        else if(!board.getMainDiag().contains("|o|")&&!board.getMainDiag().contains("|_|")){

            //log.logMove("X","Condition 3" );

            log.logMove("x","is the winner");

            EndGame=true;

            return true;

        }

        else if(!board.getReverseMainDiag().contains("|o|")&&!board.getReverseMainDiag().contains("|_|")){

            //log.logMove("x","Condition 4" );

            log.logMove("x","is the winner");

            EndGame=true;

            return true;

        }

        else if(!board.getReverseMainDiag().contains("|x|")&&!board.getReverseMainDiag().contains("|_|")){

            //log.logMove("o","Condition 4" );

            log.logMove("o","is the winner");

            EndGame=true;

            return true;

        }


        return false;

    }

    public Boolean getEndGame(){

        return EndGame;

    }

    public void setEndGame(boolean t){

        EndGame=t;

    }

    public boolean LegalMove(int row, int column){

        if(board.getRow().get(row).get(column)=="|_|"){

            return true;
        }

        return false;

    }








}
