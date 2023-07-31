package calcapp.main;

import java.util.ArrayList;
public class test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Integer i1 = 10;
        int i2 = 2;
        Integer i3 = i1;
        list.add(i1);
        list.add(i2);
        list.add(i3);
        list.add(1, 5);
        System.out.println("size : " + list.size());
        for(Integer i : list) {
            System.out.print(i + " ");
        }
    }
}