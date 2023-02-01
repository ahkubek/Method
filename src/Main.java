
public class Main {
    public static void printTask1() {
        int year = 2021;
        if (year%4==0&year%100 != 0 || (year % 400 ==0)) {
            System.out.println(year + "год високостный");
        }else{
            System.out.println(year + "год не високостный");

        }

    }

    public static void main(String[] args) {
        printTask1();


    }
}