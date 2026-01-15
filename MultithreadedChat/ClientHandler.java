import java.io.*;
import java.net.*;
import java.util.*;

public class ClientHandler implements Runnable {

    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;
    private Set<ClientHandler> clients;

    public ClientHandler(Socket socket, Set<ClientHandler> clients) {
        this.socket = socket;
        this.clients = clients;
    }

    @Override
    public void run() {
        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);

            String message;
            while ((message = in.readLine()) != null) {
                broadcast(message);
            }
        } catch (IOException e) {
            System.out.println("Client disconnected");
        } finally {
            try {
                socket.close();
                clients.remove(this);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void broadcast(String message) {
        for (ClientHandler client : clients) {
            client.out.println("Client: " + message);
        }
    }
}
