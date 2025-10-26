
import java.util.Arrays;

public class MethodReference {

    public static void print(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
        String[] names = {"rabbi","ali","mohammad"};

        Arrays.stream(names).forEach(MethodReference::print);
    }
}
