#!/bin/bash

function hashcrate() {
  mkdir hash
  touch hash.java
  echo package hash;

import java.util.*;

public class hash { public static void Hash(String full_name, HashMap<String, Random> hashCreator) { Random hsh = new Random();hashCreator.put(full_name, hsh);}} >> hash.java
javac hash.java
javac cf hashGen.jar hash.class
}
