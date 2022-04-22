import java.util.*;
public class Q2Demo
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int iter = inp.nextInt();

        int[][] arr = new int[iter][3];

        int[] result = new int[3];

        if(iter < 1 || iter > 100)
        {
            System.out.println("ERROR");
        }
        else
        {
            boolean flag = true;
            for(int i = 0; i < iter; i++)
            {
                for (int j = 0; j < 3; j++) {
                    arr[i][j] = inp.nextInt();
                    if(arr[i][j] > 100 || arr[i][j] < -100)
                    {
                        System.out.println("ERROR");
                        flag = false;
                    }
                    if(flag)
                        result[j] += arr[i][j];
                    else
                        break;
                }

            }

            if (result[0] == 0 & result[1] == 0 & result[2] == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }





    }
}
