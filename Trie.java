
import java.util.*;

public class Trie {

    List<Trie> child = null;
    boolean isLeaf;
    int counter;

    /**
     * Construct an empty Trie with just a root node.
     */
    public Trie() {

        isLeaf = false;
        child = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            child.add(null);
        }
    }

    /**
     * Adds a word to the trie (or increases its frequency by one if it already
     * exists in the trie).
     *
     * @param word - word to add to the trie.
     */
    public void addWord(String word) {

        Trie current = this;

        for (int i = 0; i < word.length(); i++) {
            if (current.child.get(word.charAt(i) - 'a') == null) {
                current.child.set(word.charAt(i) - 'a', new Trie());
            }

            current = current.child.get(word.charAt(i) - 'a');
        }
        current.isLeaf = true;

    }

    /**
     * @param word - query word to be searched.
     * @return - number of times word appears in file represented by the trie.
     */

    public int wordFrequency(String word) {
        Trie current = this;

        for (int i = 0; i < word.length(); i++) {
            current = current.child.get(word.charAt(i) - 'a');

            if (current == null) {
                return 0;
            }
        }
        return -1;
    }

    /**
     * @return - Return the kth word in the sorted sequence of unique words that
     * exist in the file/trie, where the first unique word is at position 1.
     * (returns null if k exceeds the number unique words in the file).
     *
     */
    public String kthWord(int k) {
        return "";
    }
}
