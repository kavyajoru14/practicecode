package methodoverloading;

class MathHelper {
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        MathHelper helper = new MathHelper();
        
        int sum1 = helper.add(2, 3);
        System.out.println("2 + 3 = " + sum1); // 2 + 3 = 5
        
        double sum2 = helper.add(2.5, 3.7);
        System.out.println("2.5 + 3.7 = " + sum2); // 2.5 + 3.7 = 6.2
        
        int sum3 = helper.add(2, 3, 4);
        System.out.println("2 + 3 + 4 = " + sum3); // 2 + 3 + 4 = 9
    }
}
