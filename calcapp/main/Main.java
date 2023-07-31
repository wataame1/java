package calcapp.main;

import calcapp.calc.Hero;

class SuperA {
    public void print(String s) {
        System.out.println("SuperA print : " + s);
    }
    public void method() {}
}
class SubA extends SuperA {
    public void print(String s) {
        s = "渡された文字列は " + s + " です";
        System.out.println("subA print : " + s);
    }
// void method() {} // コンパイルエラー
}
public class Main {
    public static void main(String[] args) {
        SuperA obj1 = new SuperA();
        obj1.print("Java");

        SubA obj2 = new SubA();
        obj2.print("Java");
    }
}