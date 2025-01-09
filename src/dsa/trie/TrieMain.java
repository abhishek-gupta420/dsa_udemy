package dsa.trie;

public class TrieMain {
    public static void main(String[] args) {

        Trie trie = new Trie();
        trie.insert("API");
        trie.insert("APIS");

        trie.search("API");
        trie.search("BAR");
        trie.search("APIS");
        trie.search("AP");
        trie.delete("APIS");
        trie.search("APIS");
    }
}
