package dayFour;

public class Main {
    public static void main(String[] args) {
//        Sum s = new Sum();
//        s.sum2Number(10, 20);
//
//        hamada();
//        total(10,20);

//    Rectangle re = new Rectangle();
//    double x = re.calculateArea();
//    System.out.println("The area of x is: " + x);

      Rectangle r1 = new Rectangle();
      r1.setWidth(10);
      r1.setLength(20);
      double areaOfRoom1 = r1.calculateArea();
      System.out.println("The area of room 1 = " + areaOfRoom1);

      Rectangle r2 = new Rectangle();
      r2.setWidth(10);
      r2.setLength(20);
      double areaOfRoom2 = r2.calculateArea();
      System.out.println("The area of room 2 = " + areaOfRoom2);

      System.out.println("---------------------------");
      double totalArea = areaOfRoom1 + areaOfRoom2;
      System.out.println("The total area of room 1 and room 2 = " + totalArea);

    }
    public static void hamada(){
        System.out.println("hamada");
    }
    public static void total(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }
}
