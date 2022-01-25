/**
 * Trie Node for trie data structure
 *
 *@author George Abot Abraham Ret
 *@version 1.0, 03/09/2021
 */


import java.util.HashMap;
import java.util.Map;

public class TrieNode {
  Map<Character, TrieNode> children;
  boolean endOfString;

  public TrieNode() {
    children = new HashMap<>();
    endOfString = false;
  }
}
