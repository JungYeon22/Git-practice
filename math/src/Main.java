import java.util.ArrayList;
import java.util.List;

public class Main {


    public static <list> void main(String[] args) {
        Main main = new Main();
        int a = 14;
        int b = 3;

        // add(a, b) - 더하기
        System.out.println(main.add(a,b));
        // sub(a, b) - 빼기
        System.out.println(main.sub(a,b));
        // div(a, b) - 나누기

        System.out.println(main.div(a,b));
        // mul(a, b) - 곱하기
        System.out.println(mul(10,2));
    }

    public int div(int a,int b){
        return a/b;
    }

    public  int add(int a, int b){
        return a+b;
    }

    public int sub(int a, int b) {return a-b;}

    public static int mul(int a, int b) {
        return a * b;
    }
}