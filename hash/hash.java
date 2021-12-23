package HashGen.hash;

import java.util.*;

public class hash {

    public static void HashSR(String full_name, HashMap<String, Random> hashCreator) {
        Random hsh = new Random();
        hashCreator.put(full_name, hsh);
    }

    public static void HashRS(String full_name, HashMap<Random, String> hashCreator) {
        Random hshInv = new Random();
        hashCreator.put(hshInv, full_name);
    }
}