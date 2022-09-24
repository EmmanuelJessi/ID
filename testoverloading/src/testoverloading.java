public class testoverloading{


        public static int compareTwo(int num1, int num2)
        {
            if(num1>num2)
            {
                return num1;
            }
            else
            {
                return num2;
            }
        }


        public static float compareTwo(float num1, float num2)
        {
            if(num1>num2)
            {
                return num1;
            }
            else
                return num2;
        }


    public static void main(String[]args)
    {
        int a,b,c;
        float d,e,f;

        a = 10;
        b = 20;
        c = compareTwo(a,b);
        System.out.println("the highest integer value is "+c);

        d = 10.5F;
        e = 20.2F;
        f = compareTwo(d,e);
        System.out.println("The highest float value is "+f);
    }
}


