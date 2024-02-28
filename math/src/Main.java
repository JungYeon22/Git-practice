import java.util.ArrayList;
import java.util.List;

public class Main {
    public static <list> void main(String[] args) {

        int a = 14;
        int b = 3;

        // add(a, b) - 더하기

        // sub(a, b) - 빼기

        // div(a, b) - 나누기
        Main main = new Main();
        System.out.println(main.div(a,b));
        // mul(a, b) - 곱하기
    }

    public int div(int a,int b){
        return a/b;
    }
}