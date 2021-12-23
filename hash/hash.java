package HashGen.hash;

import java.util.*;

public class hash {

    public static void Hash(String full_name, HashMap<String, Random> hashCreator) {
        Random hsh = new Random();
        hashCreator.put(full_name, hsh);
    }

    public static void getHash(HashMap<String, Random> hash, String full_name_get) {
        System.out.println(hash.get(full_name_get));
    }
}
