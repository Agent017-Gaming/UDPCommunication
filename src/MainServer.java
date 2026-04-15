import java.io.*;
import java.net.*;

public class MainServer {
    public static void main(String[] args) {
        System.out.println("Server!!");

        try{

                int port = 12345;
                DatagramSocket dSocket = new DatagramSocket(port);
                System.out.println("Server in attesa della porta " + port + "!\n");

                byte[] bufferIn = new byte[256];

                DatagramPacket dpi = new DatagramPacket(bufferIn, bufferIn.length);

                dSocket.receive(dpi);
                System.out.println("Recieved effectivly");
                InetAddress clientAddress = dpi.getAddress();
                int clientPort = dpi.getPort();

                DatagramPacket dpo = new DatagramPacket(bufferIn, bufferIn.length, clientAddress, clientPort);


                dSocket.send(dpo);

        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}