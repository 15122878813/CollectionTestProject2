package Thread;

public class 线程奇数偶数交替打印 {

    private  static  Object object = new Object();

    private  static  int i = 0;

    public static void main(String[] args){

        new Thread(){

            @Override
            public void run() {

                while (true){

                   synchronized (object){

                       if(i%2==1){

                           try {

                               object.notify();

//                               System.out.println("奇数线程进入运行状态");

                               System.out.println("奇数线程打印:: "+i++);

                               object.wait();

//                               System.out.println("奇数线程进入阻塞状态");

                           } catch (InterruptedException e) {

                               e.printStackTrace();
                           }


                       }else{

                           try {
                               object.wait();

                           } catch (InterruptedException e) {

                               e.printStackTrace();
                           }

                       }

                   }
                }
            }
        }.start();




        new Thread(){

            @Override
            public void run() {

                while (true){

                    synchronized (object){

                        if(i%2==0){

                            object.notify();

//                            System.out.println("偶数线程进入运行状态");

                            System.out.println("偶数线程打印:: "+i++);

                            try {

                                object.wait();

                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

//                            System.out.println("偶数线程进入阻塞状态");
                        }else{

                            try {

                                object.wait();

                            } catch (InterruptedException e) {

                                e.printStackTrace();
                            }

                        }

                    }

                }
            }
        }.start();
    }
}
