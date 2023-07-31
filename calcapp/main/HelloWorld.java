package calcapp.main;

public class HelloWorld {
    int i = 10;
    static int j = 20;
    void methodA(int a) {

        System.out.println("methodA(int a)");
    }
    static void methodB(int a) {
        System.out.println("methodB(int a)");
    }
    public static void main(String[] args) {
        System.out.println(HelloWorld.j);
        HelloWorld.methodB(10);
        HelloWorld a = new HelloWorld();
        System.out.println(a.i);
        System.out.println(a.j);
        a.methodA(a.i);
        a.methodB(a.j);
    }
}
