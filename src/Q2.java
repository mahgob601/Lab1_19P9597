import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2
{
    public static void main(String[] args) {

        inEquilibrium(4,"-1 0 2","4 5 6", "-99 10 200");

    }

    public static String inEquilibrium(int num, String coord1,String coord2, String coord3) {
        String[] arrOfStr1 = coord1.split(" ", 3);
        String[] arrOfStr2 = coord2.split(" ", 3);
        String[] arrOfStr3 = coord3.split(" ", 3);

        int x, y,z;

        int[] finalArr;
        finalArr = new int[3];


        for( int i= 0; i < arrOfStr1.length; i++)
        {
            x = Integer.parseInt(arrOfStr1[i]);
            y = Integer.parseInt(arrOfStr2[i]);
            z = Integer.parseInt(arrOfStr3[i]);

            finalArr[i] = x + y + z;
            if(finalArr[i] != 0)
            {

                break;
            }
        }

        for (String a : arrOfStr1) {
            System.out.println(a);

        }
        return null;
    }

}
