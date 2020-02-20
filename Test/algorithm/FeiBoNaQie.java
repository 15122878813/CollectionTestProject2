package algorithm;

import java.beans.MethodDescriptor;

//斐波那契数
public class FeiBoNaQie {
    public static void main(String[] args) {

        //查询第i个斐波那契数
        int lom = method(7);

        System.out.println("第i个斐波那契数为?"+lom);

        //查询前i个斐波那契数的和
        int sum = Sum(7);

        System.out.println("前i个斐波那契数为?"+sum);
        
    }

    private static int Sum(int i) {

        int sum = 0;

        for (int j = 1;j <= i; j++){

            sum += method(j);

    }
        return sum;
    }

    private static int method(int i) {

        if(i==1){

            return 1;
        }
        if(i==2){

            return 1;

        }
        return method(i-1)+ method(i-2);
    }
}
