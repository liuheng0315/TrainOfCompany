package footBollGame;
/*
工厂模式
 */
public class TeamFactory {
    public static Thread getThread(MyThread myThread,String name) {
        return new Thread(myThread,name);
    }
}
