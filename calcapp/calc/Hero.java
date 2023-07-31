package calcapp.calc;

public class Hero {

    private String name;
/*カプセル化のメリット
　変数を取得するだけのメソッド、設定するだけのメソッドを用意するのが基本 getter setter
* １、Read Only、Write Onlyのフィールドを実現できる
* 　　→setNameメソッドを削除すればnameは外部からはアクセスできない
* 2、フィールドの名前など、クラス内部の設計を自由に変更できる
* 　　→変数nameをnewNameとかに変更する場合、getNameとsetName内だけ変更するだけですむ
* ３、フィールドへのアクセスを検査できる
* 　　→外部からはsetName経由でのみnameにアクセスが可能なのでこれを利用して
* 　　　変数に設定されようとしている値を妥当かどうか検査できる
*      例えば名前は8文字以上禁止にしたい場合
* */
    public String getName(){
        return this.name;
    }
    public int calc(int a,int b){
        int c = a+b;
        return  c;
    }
    public String calc(int a,int b){
        String c;
        return  c;
    }
    public String calc(int a, int b, int c){
        String s="";
        return s;

    }

    public void setName(String name){
        if(name.length()>=8){
            throw new IllegalArgumentException("名前が長すぎます");
        }
        if(name.length()<=1){
            throw new IllegalArgumentException("名前が短すぎます");
        }
        if(name==null){
            throw new IllegalArgumentException("名前がnullです");
        }
        this.name = name;
    }
    public Hero(){

    }

}
