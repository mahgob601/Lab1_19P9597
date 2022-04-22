public class Q2
{


    private int iters;


    public String inEquilibrium(int iter,int[][] arr)
    {
        if(iter < 1 || iter > 100 || iter != arr.length)
        {
            return("ERROR");
        }

        int[] result = new int[3];
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                if(arr[i][j] > 100 || arr[i][j] < -100)
                {
                    return("ERROR");
                }
                result[j] += arr[i][j];
            }
        }
        if (result[0] == 0 & result[1] == 0 & result[2] == 0)
            return("YES");
        else
            return("NO");

    }

}
