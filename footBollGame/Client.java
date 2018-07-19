package footBollGame;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {

    public static int transmit(String str) {
        try {
            Socket socket = new Socket("127.0.0.1", 6688);
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            out.writeUTF(str);
            System.out.println("client:"+str);
            DataInputStream in = new DataInputStream(socket.getInputStream());
            String str2 = in.readUTF();
            if (str2 .equals("1")) {
                return 1;//球进了
            }else {
                return 0;//球没进
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
