package arcade;

public class AreSimilar {

    boolean areSimilar(int[] a, int[] b)
    {

        if (a.length != b.length)
            return false;
        int noOfDiff = 0;
        int[] firstDiff = new int[2];

        for (int i = 0; i < a.length; i++)
        {
            if (a[i] != b[i])
            {
                noOfDiff++;
                if (noOfDiff == 1)
                {
                    firstDiff[0] = a[i];
                    firstDiff[1] = b[i];
                }
                if (noOfDiff == 2)
                {
                    if (firstDiff[0] != b[i] || firstDiff[1] != a[i])
                        return false;
                }
                if (noOfDiff > 2)
                    return false;

            }
        }
        return true;
    }

}
