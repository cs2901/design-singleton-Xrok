class MultithreadingDemo implements Runnable{
    public void run(){
        ChocolateBoiler balde= ChocolateBoiler.getInstance();

        FalsechocolateBoiler balde2 = new FalsechocolateBoiler();
    }
}

public class Main {

    public static void main(String[] args) {

        ChocolateBoiler balde= ChocolateBoiler.getInstance();

        FalsechocolateBoiler balde2 = new FalsechocolateBoiler();

    

        MultithreadingDemo obj1=new MultithreadingDemo();
        MultithreadingDemo obj2=new MultithreadingDemo();
        MultithreadingDemo obj3=new MultithreadingDemo();
        MultithreadingDemo obj4=new MultithreadingDemo();
        Thread tobj1 =new Thread(obj1);
        Thread tobj2 =new Thread(obj2);
        Thread tobj3 =new Thread(obj3);
        Thread tobj4 =new Thread(obj4);
        tobj1.start();
        tobj2.start();
        tobj3.start();
        tobj4.start();

    }


}
