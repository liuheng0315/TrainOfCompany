package footBollGame;

public class FootBoll {
//球的数量
    public static int getFootBoll(int footBoll) {
        if (footBoll == 0) {
            synchronized (FootBoll.class) {
                if (footBoll == 0) {
                    return ++footBoll;
                }
            }
        }
        return footBoll;
    }

  
}
