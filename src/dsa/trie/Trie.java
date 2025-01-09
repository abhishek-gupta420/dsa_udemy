package dsa.trie;

public class Trie {
    private TrieNode root;
    public Trie() {
        root = new TrieNode();
        System.out.println("Trie has been successfully created.");
    }

    public void insert(String word) {
        TrieNode current = root;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = current.children.get(ch);
            if (node == null) {
                node = new TrieNode();
                current.children.put(ch, node);
            }
            current = node;
        }

        current.endOfString = true;
        System.out.println("The word " + word  + " is successfully inserted in Trie");
    }

//    search for word in trie
    public boolean search(String word) {
        TrieNode currentNode = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = currentNode.children.get(ch);
            if (node == null) {
                System.out.println("Word " + word + " doesn't exists in TRIE.");
                return false;
            }
            currentNode = node;
        }

        if (currentNode.endOfString == true) {
            System.out.println("Word " + word + " exists in TRIE.");
            return true;
        } else {
            System.out.println("Word " + word + " doesn't exists in TRIE but it is prefix of other string");

        }

        return currentNode.endOfString;
    }


//    delete methhod helper method
    private boolean delete(TrieNode parentNode, String word, int index) {
        char ch = word.charAt(index);
        TrieNode currentNode = parentNode.children.get(ch);
        boolean canThisNodeBeDeleted;

//        implementing 4 cases;

        if (currentNode.children.size() > 1) {
            delete(currentNode, word, index + 1);
            return false;
        }

        if (index == word.length() - 1) {
            if (currentNode.children.size() >= 1) {
                currentNode.endOfString = false;
                return false;
            } else {
                parentNode.children.remove(ch);
                return true;
            }
        }

        // some other word is prefix of word

        if (currentNode.endOfString == true) {
            delete(currentNode, word, index + 1);
            return false;
        }

//        no other word is dependent on this word

        canThisNodeBeDeleted = delete(currentNode, word, index + 1);
        if (canThisNodeBeDeleted == true) {
            parentNode.children.remove(ch);
            return true;
        } else {
            return false;
        }
    }

//     delete method
    public void delete (String word) {
        if (search(word) == true) {
            delete(root, word, 0);
        }
    }
}
