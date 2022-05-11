import java.lang.Math;
public class Model {
    public static int FindMax(int min,int max){
        int maxValue=Function(min);
        int temp;
        for (int i=min;i<=max;i++){
            temp=Function(i);
            if(maxValue<temp)
                maxValue=temp;
        }
        return maxValue;
    }
    public static String Points(int min,int max){
        String points="X          f(x)\n";
        for (int i=min;i<=max;i++){
            points+=(i+"          "+Function(i)+"\n");
        }
        return points;
    }
    public static int Function(int x){
        return x*x*x-3;
    }
    private static float f(double x)
    {
        return (float) (x*x*x-3);
    }
    private static float df(float x)
    {
        return 15*x*x;
    }
    private static float d2f(float x)
    {
        return 30*x;
    }
    public static String Root(int min,int max){
        int i=0;
        double x0,xn;
        double a=min, b=max, eps=0.0001;
        i=0;
        if (a > b)
        {
            x0 = a;
            a = b;
            b = x0;
        }
        if (f(a)*f(b)>0)
            return "\nError!\n";
        else
        {
            if (f(a)*d2f((float) a)>0) x0  = a;
            else x0 = b;
            xn = x0-f(x0)/df((float) x0);
            while(Math.abs(x0-xn) > eps)
            {
                x0 = xn;
                xn = x0-f(x0)/df((float) x0);
                ++i;
            }
            return xn+"";
        }
    }
}
