package calcapp.main;

class StaticMethodSample11 {
    void staticMethod() {
        System.out.println("StaticMethodSample11.staticMethod()");
    }

    void instanceMethod() {
        System.out.println("StaticMethodSample11.instanceMethod()¥n");
    }

    void invokeMethod() {
        staticMethod();
        instanceMethod();
    }
}

class StaticMethodSample12 extends StaticMethodSample11 {
    // スーパークラスにあるものと同じシグネチャのstaticメソッドを宣言
    // このクラスのスコープでは、単純名としてのstaticMethod()はこれになる
    @Override
    void staticMethod() {
        System.out.println("StaticMethodSample12.staticMethod()");
    }

    // インスタンスメソッドはオーバーライドしてみる
    void instanceMethod() {
        System.out.println("StaticMethodSample12.instanceMethod()");
    }

    public static void main(String[] args) {
        StaticMethodSample11 a = new StaticMethodSample11();
        StaticMethodSample12 b = new StaticMethodSample12();
        a.invokeMethod();
        b.invokeMethod();
       // staticMethod(); // このクラスで宣言されたstaticメソッドを呼び出すことになる
        //StaticMethodSample11.staticMethod(); // スーパークラスの同名staticメソッドを呼びたいなら、クラスを経由する
    }
}