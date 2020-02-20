package algorithm;

//质数(素数)
public class ZhiShu {

    public static void main(String[] args) {

        ZhiShuhu(129);
    }

    private static void ZhiShuhu(int i) {

        int j = (int)Math.sqrt(i);

        boolean flag = false;

        if(i==3||i==2){

            System.out.println("是质数");
            return;
        }

        for (int a = 2 ;a < j; a++){

            if( i%a == 0){

                flag=true;

            }

        }
        if(flag==true){

            System.out.println(i+"不是质数");

        }else{

            System.out.println("第"+i+"个数字是质数");

        }
    }
}
