public class Q1
{
    public String fruitDivisor(int weight)
    {
        if(weight < 1 || weight > 100)
            return("ERROR");
        if(weight % 2 == 0 && weight != 2)
        {
            return("YES");
        }
        else
        {
            return("NO");
        }
    }
}
