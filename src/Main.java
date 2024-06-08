//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    int a=10;
    static int b=20;
    int display(){
        return 108;
    }
    static int display1(){
        return 200;
    }
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Main a1=new Main();
        System.out.println(a1.a);
        System.out.println(a1.display());
        System.out.println(Main.b);
        System.out.println(Main.display1());

    }
}