@FunctionalInterface
interface ZeroParameter0 {
    void display();
}

public class ZeroParameter {
    public static void main(String[] args)
    {
        // Lambda expression with zero parameters
        ZeroParameter0 zeroParamLambda = ()
            -> System.out.println(
                "This is a zero-parameter lambda expression!");

        // Invoke the method
        zeroParamLambda.display();
    }
}