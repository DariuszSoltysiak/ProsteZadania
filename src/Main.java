import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //double na int
        double a = 123.44;
        int b = (int) a;
        System.out.println(b);

        //char na int
        char c = '9';
        int d = (c - 48) + 2;
        System.out.println(d + "konik");

        //int na char (najpierw przekonwertowanie  na String)
        int i = 0;
        char j = Integer.toString(i).charAt(0);
        System.out.println(j);

        //także int na char
        char k = (char) (i - 48);
        System.out.println(k);

        //int na String 2 sposoby
        String slowo = Integer.toString(b);
        System.out.println(slowo + "aaa");
        String slowo1 = String.valueOf(b);
        System.out.println(slowo1);

        //String na char
        String ch = "a";
        char st = ch.charAt(0);
        System.out.println(st);

        //String na int
        int e = Integer.parseInt(slowo);
        System.out.println(e + 2);

        //double na String
        String dou = Double.toString(a);
        System.out.println(dou + "ere");

        //String na double
        double f = Double.parseDouble(dou);
        System.out.println(f + 2.12);

        //int na float
        int g = 123456789;
        float h = (float) g;
        System.out.println(String.format("%.0f", h));

        //typy złożone: Integer na Double
        Integer l = 15;
        Double m = l.doubleValue();
        System.out.println(m);

        //typy złożone: Double na Integer
        Double n = 14.54;
        Integer o = n.intValue();
        System.out.println(o);




    }
}