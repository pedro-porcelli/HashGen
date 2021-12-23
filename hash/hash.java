package hash;

import java.util.*;

public class hash {

    public static void Hash(String first_name, HashMap<Random, String> hashCreator) {
        Random hsh = new Random();
        hashCreator.put(hsh, first_name);
    }
}