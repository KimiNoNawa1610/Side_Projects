import java.util.*;

public class Board {
    int Col;
    int Row;
    ArrayList<ArrayList<String>> temp=new ArrayList<>();

    public Board(int row, int column){
        Row=row;
        Col=column;
        temp=MakeRow(Row);
    }

    private ArrayList<String> MakeColumn(int Column){

        ArrayList<String> output= new ArrayList<>();

        for(int i=0; i< Col;i++){

            output.add("|_|");

        }

        return output;
    }

    private ArrayList<ArrayList<String>> MakeRow(int Row){

        ArrayList<ArrayList<String>> output= new ArrayList<>();

        for(int i=0; i< Row;i++){

            output.add(MakeColumn(Col));

        }

        return output;

    }

    public ArrayList<ArrayList<String>> getRow(){

        return temp;

    }

    public void Xmove(int row, int col){

        temp.get(row).set(col,"|x|");

    }

    public void Omove(int row, int col){

        temp.get(row).set(col,"|o|");

    }

    @Override
    public String toString(){

        String output="";

        for(ArrayList<String> m:temp){

            output=output+m.toString().
                    replace("[","").
                    replace("]","").
                    replace(", ","")+"\n";

        }

        return output;
        
    }

}

