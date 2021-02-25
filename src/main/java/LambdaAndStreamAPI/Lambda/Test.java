package LambdaAndStreamAPI.Lambda;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
       /* MyValue myValue = () -> 99.9;
        System.out.println(myValue.getValue());

        MyParamValue myParamValue = (n) -> 1.0/n;
        System.out.println(myParamValue.getParamValue(3));

        NumericTest numericTest = (x, y) -> x>y;
        System.out.println(numericTest.test(5, 8) + "\n" + numericTest.test(8,5));

        numericTest = (x, y) -> x==y;
        System.out.println(numericTest.test(5,5)+"\n"+ numericTest.test(5,10));

        numericTest = (x, y) -> x<y;
        System.out.println(numericTest.test(5, 8) +"\n"+numericTest.test(8,5));

        numericTest = (n, m) -> (n<0?-n:n) == (m<0?-m:m);
        System.out.println(numericTest.test(-4,4));
        */
        /*NumericDil div = (n)->{
            int result = 1;
            for(int i = n; i>1; i--){
                if(n%i==0){
                    result = i;
                }
            }
            return result;
        };
        System.out.println(div.div(247));*/

        int [] arr = new int[100];
        for(int i = 0 ; i < 100 ; i ++){
            arr[i] = i;
        }
        Arrays.stream(arr).filter(x-> x>50&&x<70)
                            .map(x -> x+2)
                            .limit(15)
                            .forEach(System.out::println);
        System.out.println(Integer.parseInt("32", 16));
    }
}
