package pri.tw;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.net.Socket;

public class Client1 {

    public static void main(String[] args) throws IOException {
        Socket echoSocket = new Socket("localhost", 9000);
        String out = IOUtils.toString(echoSocket.getInputStream());
        System.out.println("============" + out);
        echoSocket.close();
    }
}
