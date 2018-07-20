package footBollGame;

public class MyThread extends Thread{
    private static int count1=0;//第一只球队的进球数
    private static int count2=0;//第二只球队的进球数
    volatile boolean flag=true;
    int count=5;//count为最终胜利的进球数

    private volatile int bollnum=0;
    @Override
    public void run() {
        while (flag) {
            synchronized (MyThread.class) {
                if (flag){
                    if (bollnum == 0) {
                        bollnum = FootBoll.getFootBoll(0);
                    }
                    if ( bollnum> 0) {
                        System.out.println(MyThread.currentThread().getName()+":抢到球");
                        int num = Client.transmit("开始射门，进不进球门说的算");
                        if (num == 1) {
                            String threadName = MyThread.currentThread().getName();
                            bollnum--;
                            System.out.println(threadName+"：进球了！！！！");
                            shootCount(threadName);
                            if (count1 == count) {
                                flag=false;
                                System.out.println("最终结果第一只球队取得了胜利！！！！进球数为:"+count1);
                            } else if (count2 == count) {
                                flag=false;
                                System.out.println("最终结果第二只球队取得了胜利！！！！进球数为:"+count2);
                            }
                        }else {
                            System.out.println(MyThread.currentThread().getName()+":球没进····");
                        }
                    }
                }
            }
            }
        }

    public static void shootCount(String str) {
        String s = str.substring(6);
        int i = Integer.parseInt(s);
        //thread(1-5)属于第一只球队，thread(6-10)属于第二只球队
        if (i <= 5 && i >= 1) {
            count1++;
            System.out.println("第一只球队总共进球数："+count1);
        }else {
            count2++;
            System.out.println("第二只球队总共进球数："+count2);
        }
    }

}
