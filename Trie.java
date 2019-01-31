package trietest;
import java.util.*; 

public class Trie {
 
 char c;
		Trie[] children;
		boolean word;
 
   /**
    * Construct an empty Trie with just a root node.
    */
   public Trie()
    
   	this.c=0;
	this.children = new Trie[26];
	this.word = false;
           
   /** 
    * Adds a word to the trie (or increases its frequency 
    * by one if it already exists in the trie).
    * @param word - word to add to the trie.
    */
   public void addWord(String word){
	   
	   if(s.isEmpty()){
		this.word = true; 
		return;
	   }
			
	   char letter = s.charAt(0);
	   int index = letter - 'a'; //'a' index of 97 b = 98, 98-97
			
	   if(this.children[index] == null){
		this.children[index] = new Trie();
	   }
   }
	 this.children[index].addWord(s.substring(1));  

   /**
    * @param word - query word to be searched.
    * @return - number of times word appears in file 
    * represented by the trie. 
    */
   public int wordFrequency(String word){
  if(s.isEmpty()){
			return this.word;
		}
		char letter = s.charAt(0);
		int index = letter - 'a';
		
		if(this.children[index] == null)
		{
			return false;
		}
		
		return this.children[index].isWord(s.substring(1));
   }
   /**
    * @return - Return the kth word in the sorted sequence
    * of unique words that exist in the file/trie,
    * where the first unique word is at position 1.
    * (returns null if k exceeds the number unique
    * words in the file).
    * 
    */
   public String kthWord(int k)
           
}
