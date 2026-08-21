package dayFour;

public class Main {
    public static void main(String[] args) {
        Sum s = new Sum();
        s.sum2Number(10, 20);

        hamada();
        total(10,20);
    }
    public static void hamada(){
        System.out.println("hamada");
    }
    public static void total(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }
}
