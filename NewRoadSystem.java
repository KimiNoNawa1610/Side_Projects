package graph;

//Author Nhan Vo
public class NewRoadSystem {

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

    }

    boolean newRoadSystem(boolean[][] roadRegister)
    {
        int length = roadRegister.length;

        for (int i = 0; i < length; i++)
        {
            int incoming = 0;
            int outgoing = 0;
            for (int j = 0; j < length; j++)
            {
                if (roadRegister[i][j] == true)
                    incoming++;
                if (roadRegister[j][i] == true)
                    outgoing++;
            }
            if (incoming != outgoing)
                return false;

        }
        return true;

    }

}
