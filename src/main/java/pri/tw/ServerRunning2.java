package pri.tw;

import java.io.IOException;

public class ServerRunning2 {
    public static void main(String args[]) throws IOException {
        Server server = new Server(9002);
        while (true) {
            server.run();
        }
    }
}
