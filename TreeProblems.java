/*
 * *** Taylor Hales COMP 400C-001 - Fall 2024 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */
  
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {

    //
    // This can be done numerous ways, but once such will only that
    // *several* lines of code. Hint: create two temporary TreeSets and utilize the
    // methods retainAll(), addAll(), and removeAll(). But in the end, get something to work.

    // make a copy of setA & setB
    Set<Integer> inSetA = new TreeSet<>(setA);
    Set<Integer> inSetB = new TreeSet<>(setB);
    Set<Integer> commonElements = new TreeSet<>(setA);

    // find the common elements
    commonElements.retainAll(setB); // commonElements now holds the intersection of setA & setB

    // remove common elements from each set
    inSetA.removeAll(commonElements);
    inSetB.removeAll(commonElements);

    // combine the elements that are left
    inSetA.addAll(inSetB);

    return inSetA;
  }


  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {

    // a set that will hold the even keys
    Set<Integer> keysForRemoval = new HashSet<>();

    // iterate through keys & find the evens
    for (Integer key : treeMap.keySet()){
      if (key % 2 == 0){
        keysForRemoval.add(key);
      }
    }

    // remove even keys
    for (Integer key : keysForRemoval){
      treeMap.remove(key);
    }
  }


  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {

    // you can compare both TreeMaps using the built-in equals() method
    return tree1.equals(tree2);
  }

} // end treeProblems class
