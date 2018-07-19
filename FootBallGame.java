package footBollGame;

import com.sun.corba.se.spi.activation.Server;

import java.util.ArrayList;

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
        MyThread thread1 = new MyThread("thread1");
        MyThread thread2 = new MyThread("thread2");
        MyThread thread3 = new MyThread("thread3");
        MyThread thread4 = new MyThread("thread4");
        MyThread thread5 = new MyThread("thread5");
        MyThread thread6 = new MyThread("thread6");
        MyThread thread7 = new MyThread("thread7");
        MyThread thread8 = new MyThread("thread8");
        MyThread thread9 = new MyThread("thread9");
        MyThread thread10 = new MyThread("thread10");
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
