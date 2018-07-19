package footBollGame;

public class MyThread extends Thread{
    public MyThread(String name) {
        super(name);
        this.bollnum = bollnum;
    }

    private int bollnum=0;
    @Override
    public void run() {
        synchronized (MyThread.class) {
            if (bollnum == 0) {
                bollnum = FootBoll.getFootBoll(0);
            }
            if ( bollnum> 0) {
                System.out.println(MyThread.currentThread().getName()+"抢到球");
                int num = Client.transmit("射门，进不进Server说的算");
                if (num == 1) {
                    System.out.println(MyThread.currentThread().getName()+"进球了！！！！"+bollnum--);
                }else {
                    System.out.println(MyThread.currentThread().getName()+"球没进····");
                }
            }
        }
    }


}
