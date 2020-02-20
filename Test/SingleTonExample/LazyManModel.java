package SingleTonExample;

//懒汉式单例,在开始的时候并不进行创建实例
class TheLazyMan{

    private  static  TheLazyMan theLazyMan;

    private  TheLazyMan(){

    }

    public static
//    synchronized      1.有锁则只适用于单线程,
//                        2.无锁则效率很低
    TheLazyMan getInstance(){

        if(theLazyMan==null){

           theLazyMan = new TheLazyMan();

        }
        return theLazyMan;
    }
}

class TheThread extends Thread{

    @Override
    public void run() {

        System.out.println(TheLazyMan.getInstance().hashCode());

    }
}

public class LazyManModel {

    public static void main(String[] args) {

        while (true){
            new TheThread().start();
        }
    }
}
