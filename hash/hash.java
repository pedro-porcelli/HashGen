package HashGen.hash;

import java.net.*;
import java.util.*;
import java.io.*;

public class hash {

    Socket clientSocket;
    PrintWriter out;
    BufferedReader in;

    public static Random HashSR(String full_name, HashMap<String, Random> hashCreator) {
        Random hsh = new Random();
        hashCreator.put(full_name, hsh);
        return hsh;
    }

    public static Random HashRS(String full_name, HashMap<Random, String> hashCreator) {
        Random hshInv = new Random();
        hashCreator.put(hshInv, full_name);
        return hshInv;
    }

    public static String HashRSstring(String full_name, HashMap<String, String> hashCreator) {
        Random hshInv = new Random();
        String hshInvString = hshInv.toString();
        hashCreator.put(hshInvString, full_name);
        return hshInvString;
    }

    public static String HashSRstring(String full_name, HashMap<String, String> hashCreator) {
        Random hshInv = new Random();
        String hshInvString = hshInv.toString();
        hashCreator.put(full_name, hshInvString);
        return hshInvString;
    }

    public void serverHash(String ipAddress, int port, HashMap<Object, Object> hashSrv) {
        clientSocket = new Socket(ipAddress, port);
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        out.println(hashSrv);
    }
}