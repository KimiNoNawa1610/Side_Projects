//Work on finding the alternative sum 
package arcade;

public class AlternatingSums {

    int[] alternatingSums(int[] a)
    {

        int team1Weight = 0;
        int team2Weight = 0;
        for (int i = 0; i < a.length; i++)
        {
            if ((i + 1) % 2 == 0)
                team2Weight = team2Weight + a[i];
            else
                team1Weight = team1Weight + a[i];
        }

        return new int[]
        { team1Weight, team2Weight };

    }

}
