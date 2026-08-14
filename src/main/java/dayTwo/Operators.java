package dayTwo;

public class Operators {
    public static void main(String[] args) {
        /*
        int x =10;
        int y =20;

        System.out.println(x == y);
        System.out.println(x = y);
        System.out.println(x == y);
        System.out.println(x != y);

        double a = 15.0;
        int b = 15;

        System.out.println(a == b);
        System.out.println(a != b);

        int a = 25;
        System.out.println(a);
        int b = 25;
        System.out.println(a + b);
        a += 5;
        a = a + 5;
        System.out.println(a);

        a = a - 5;
        a -= 5;
        System.out.println(a);

        a = a * 5;
        a *= 5;
        System.out.println(a);

        a = a / 5;
        a /= 5;
        System.out.println(a);
//      System.out.println("The div of a is : %d%n", a);

        int x = 655856625;
        int y = 655;
        System.out.println(x % y);

        int a = 7;
        int b = 5;
        int c = 7;
        int d = 7;

        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a != b);

        boolean v1 = true;
        boolean v2 = false;

        System.out.println(v1 && v2);
        System.out.println(v1 || v2);

        System.out.println(a > b && b < c);
        System.out.println(a > b && b > c);
        System.out.println(a < b || d > a);


        int num = 10;
        System.out.println(num++);
        System.out.println(num);
        System.out.println(++num);

*/
        int a = 7, b = 10, c;
        c = a > b ? a : b;
        System.out.println(c);

        if(a > b)
            c = a;
        else
            c = b;
        System.out.println(c);

    }

}
