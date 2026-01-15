import java.net.*;
import java.io.*;
import java.util.*;

public class ChatServer {

    private static Set<ClientHandler> clients = new HashSet<>();

    public static void main(String[] args) {
        int port = 1234;
        System.out.println("🚀 Chat Server started on port " + port);

        try (ServerSocket serverSocket = new ServerSocket(port)) {

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("✅ New client connected");

                ClientHandler client = new ClientHandler(socket, clients);
                clients.add(client);

                new Thread(client).start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
