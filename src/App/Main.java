package App;

public class Main {
    public static void main(String[] args) {
        System.out.println("Super hay!!");
        int a = 2;
        int b = 8;
        int c = add(a,b);
        System.out.println(c);
    }
    private static int add(int a, int b){
        return a + b;
    }

}
