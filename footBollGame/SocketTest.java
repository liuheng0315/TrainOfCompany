package footBollGame;

public class SocketTest {
    public static void main(String[] args) {
        Server server = new Server();
        Thread thread = new Thread(server);
        thread.start();
        Client.transmit("哈哈哈啊哈哈哈哈哈");
    }
}
