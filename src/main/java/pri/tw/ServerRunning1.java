package pri.tw;

import java.io.IOException;

public class ServerRunning1 {
    public static void main(String args[]) throws IOException {
        Server server = new Server(9000);
        while (true) {
            server.run();
        }
    }
}
