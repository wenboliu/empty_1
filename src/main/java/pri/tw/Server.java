package pri.tw;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Server {
    private ServerSocket providerSocket;
    private Random random;

    public Server(int port) throws IOException {
        providerSocket = new ServerSocket(port);
        random = new Random();
    }

    void run() throws IOException {
        Socket connection = providerSocket.accept();
        OutputStream outputStream = connection.getOutputStream();
        IOUtils.write(getRandomStatus(random.nextInt(3)), outputStream);
        outputStream.close();
    }

    private String getRandomStatus(int i) {
        switch (i) {
            case 0:
                return "running";
            case 1:
                return "suspend";
            default:;
                return "stop";
        }
    }
}
