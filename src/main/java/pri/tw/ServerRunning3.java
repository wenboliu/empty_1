package pri.tw;

import java.io.IOException;

public class ServerRunning3 {
    public static void main(String args[]) throws IOException {
        Server server = new Server(9003);
        while (true) {
            server.run();
        }
    }
}
