package LambdaAndStreamAPI.Lambda;

public class Test {
    public static void main(String[] args) {
        MyValue myValue = () -> 99.9;
        System.out.println(myValue.getValue());

        MyParamValue myParamValue = (n) -> 1.0/n;
        System.out.println(myParamValue.getParamValue(3));
    }
}
