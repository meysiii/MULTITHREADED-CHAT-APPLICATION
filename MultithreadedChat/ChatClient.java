import java.net.*;
import java.io.*;

public class ChatClient {

    public static void main(String[] args) {
        String serverAddress = "localhost";
        int port = 1234;

        try {
            Socket socket = new Socket(serverAddress, port);

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            BufferedReader keyboard = new BufferedReader(
                    new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Thread to read server messages
            new Thread(() -> {
                String msg;
                try {
                    while ((msg = in.readLine()) != null) {
                        System.out.println(msg);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();

            // Send messages
            String userInput;
            while ((userInput = keyboard.readLine()) != null) {
                out.println(userInput);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
