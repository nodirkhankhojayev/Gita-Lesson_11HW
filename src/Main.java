//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("task 1");
        Convertor.setKurs(12900.0);
        System.out.println("500 000 sum dollarda= " + Convertor.getDollar(500000) + " $");
        System.out.println("50 dollar sumda= " + Convertor.getSum(50.0) + " sum");

        System.out.println();
        System.out.println();
        System.out.println("task 2");

        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        System.out.println(a1.getIndex());
        System.out.println(a2.getIndex());
        System.out.println(a3.getIndex());
    }
}
//Task 1
class Convertor{
    static double kurs;


    public static void setKurs(double newkurs){
         kurs = newkurs;
    }
    public static double getSum(double dollar){
        return dollar * kurs;
    }

    public static double getDollar(double sum){
        return sum/kurs;
    }


}



//  2 task
class A{
    private int index;
    static int counter;

    A(){
        counter++;
        this.index = counter;
    }

    public int getIndex(){
        return index;
    }
}