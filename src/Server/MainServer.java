package Server;

import java.io.*;
import java.io.OutputStream;
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


            /*while(true){

                InetAddress clientAddress = inPacket.getAddress();
                int clientPort = inPacket.getPort();

                String messageIn = new String(inPacket.getData(), 0, inPacket.getLength());
                System.out.println("I'm the Client " + clientAddress + ":" + clientPort + "> " + messageIn);

            }*/
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}