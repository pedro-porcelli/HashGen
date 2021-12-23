package hash;

import java.util.*;

public class hash {

    public static void Hash(String full_name, HashMap<Random, String> hashCreator) {
        Random hsh = new Random();
        hashCreator.put(hsh, full_name);
    }
}