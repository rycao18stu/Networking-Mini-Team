import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStream;
import java.util.Scanner;
/**
 * Write a description of class Webserver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WebServer
{   
    public static void main(String[] args) throws IOException
    {
        ServerSocket server = new ServerSocket(8080);
        Socket s = server.accept();
        InputStream inp = s.getInputStream();
        Scanner in = new Scanner(inp);
        while (true) {
            if (!in.hasNext()) return;
            String command = in.next();
            if (command.equals("QUIT")) return;
            else System.out.println(command);
        }
    }
}

