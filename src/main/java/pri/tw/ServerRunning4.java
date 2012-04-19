package pri.tw;

import java.io.IOException;

public class ServerRunning4 {
    public static void main(String args[]) throws IOException {
        Server server = new Server(9004);
        while (true) {
            server.run();
        }
    }
}
