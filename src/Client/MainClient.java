package Client;

import java.io.IOException;
import java.net.*;

public class MainClient {
        public static void main(String[] args) {

            System.out.println("Client!!");
            try {
                int port = 12345;
                InetAddress serverAddress = InetAddress.getLocalHost();

                System.out.println("Indirizzo del server trovato!");
                DatagramSocket dSocket = new DatagramSocket();

                String message = "Ciao Server!";
                DatagramPacket dpo = new DatagramPacket(message.getBytes(),
                        message.length(),
                        serverAddress,
                        port);

                dSocket.send(dpo);

                byte[] buffer = new byte[256];

                DatagramPacket inPacket = new DatagramPacket(buffer, buffer.length);

            } catch (UnknownHostException e) {
                throw new RuntimeException(e);
            } catch (SocketException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
}
