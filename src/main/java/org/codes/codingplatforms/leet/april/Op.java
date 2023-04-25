package org.codes.codingplatforms.leet.april;
public class  Op{
    public static void main(String[] args) {
        Trie t=new Trie();
        t.insert("abh");
    }

}
class Trie {

    boolean stop;
    Trie[] words;


    public Trie() {
        this.stop=false;
        this.words=new Trie[26];

    }

    public void insert(String word) {
        if(word.length()==1)
        {
            words[word.charAt(0)-97]=new Trie();
            this.stop=true;
            return;

        }
        else {
            int i=word.charAt(0)-97;
            words[i]=new Trie();
            words[i].insert(word.substring(1,word.length()));
        }

    }

    public boolean search(String word) {
        return true;
    }

    public boolean startsWith(String prefix) {
return true;
    }
}