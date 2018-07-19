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
        Thread thread1 = new Thread(myThread,"thread1");
        Thread thread2 = new Thread(myThread,"thread2");
        Thread thread3 = new Thread(myThread,"thread3");
        Thread thread4 = new Thread(myThread,"thread4");
        Thread thread5 = new Thread(myThread,"thread5");
        Thread thread6 = new Thread(myThread,"thread6");
        Thread thread7 = new Thread(myThread,"thread7");
        Thread thread8 = new Thread(myThread,"thread8");
        Thread thread9 = new Thread(myThread,"thread9");
        Thread thread10 = new Thread(myThread,"thread10");
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
