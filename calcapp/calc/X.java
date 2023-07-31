package calcapp.calc;

public class X {
    void methodA() {}
    void methodB() {}
}
class Y extends X {
    // 本当は、methodA() をオーバーライドするつもりが間違えたしまった場合
    @Override
    void methodA() {}
}
