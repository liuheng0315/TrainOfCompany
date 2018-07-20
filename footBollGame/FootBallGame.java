package footBollGame;

/*
设计一段程序，小型半场足球赛：
	两只足球队，各有5名队员；（工厂模式）
	有1个足球；（单例模式）
	队员抢到球后进行射门（同步锁）
	射门的结果由球门决定（Socket通信，可计算随机数）
	先到5分的队伍胜利

通过打印显示比赛过程及结果
 */
public class FootBallGame {
    public static void main(String[] args) {
        footBollGame.Server server = new footBollGame.Server();
        Thread serverThread = new Thread(server);
        serverThread.start();
        MyThread myThread = new MyThread();
        //工厂模式拿到线程
        Thread thread1 = TeamFactory.getThread(myThread, "thread1");
        Thread thread2 = TeamFactory.getThread(myThread, "thread2");
        Thread thread3 = TeamFactory.getThread(myThread, "thread3");
        Thread thread4 = TeamFactory.getThread(myThread, "thread4");
        Thread thread5 = TeamFactory.getThread(myThread, "thread5");
        Thread thread6 = TeamFactory.getThread(myThread, "thread6");
        Thread thread7 = TeamFactory.getThread(myThread, "thread7");
        Thread thread8 = TeamFactory.getThread(myThread, "thread8");
        Thread thread9 = TeamFactory.getThread(myThread, "thread9");
        Thread thread10 = TeamFactory.getThread(myThread, "thread10");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();
    }
}
