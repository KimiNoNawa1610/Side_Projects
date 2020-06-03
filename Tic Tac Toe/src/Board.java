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

    public ArrayList<String> getMainDiag(){

        ArrayList<String> output=new ArrayList<>();

        for(int i=0;i<temp.size();i++){

            output.add(temp.get(i%temp.size()).get(i%(temp.get(0).size())));

        }

        return output;

    }

    public  ArrayList<String> getReverseMainDiag(){

        ArrayList<String> output=new ArrayList<>();

        for(int i=temp.size()-1;i>=0;i--){

            output.add(temp.get(temp.size()-1-i).get(i%(temp.get(0).size())));

        }

        return output;
    }

    public ArrayList<ArrayList<String>> getRow(){

        return temp;

    }

    public ArrayList<String> getColumn(int n){

        ArrayList<String> output= new ArrayList<>();

        for(int i=0;i<temp.size();i++){

            output.add(temp.get(i).get(n));

        }

        return output;

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

