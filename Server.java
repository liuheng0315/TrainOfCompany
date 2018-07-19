package footBollGame;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable{

    @Override
    public void run() {
        try {
            ServerSocket server = new ServerSocket(6688);
            while (true) {
                Socket socket = server.accept();
                DataInputStream in = new DataInputStream(socket.getInputStream());
                String str = in.readUTF();
                if (!str .equals("")) {
                    double random = Math.random();
                    DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                    if (random >= 0.5) {
                        out.writeUTF("1");
                    }else {
                        out.writeUTF("0");
                    }
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
