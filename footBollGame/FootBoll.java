package footBollGame;

public class FootBoll {
    private static FootBoll footBoll=null;
    //球的单利
    public static FootBoll getBoll() {
        if (footBoll == null) {
            synchronized (FootBoll.class) {
                if (footBoll == null) {
                    return new FootBoll();
                }
            }
        }
        return footBoll;
    }
    //球的数量
    public static int getFootBoll(int boll) {
        if (footBoll == null) {
            getBoll();
            return 1;
        }
        return 1;
    }


}
