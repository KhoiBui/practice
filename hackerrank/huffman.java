/*
   Huffman coding enables compression of different files by reducing
   the amount of bytes a character can take up if it appears too often.
   For example, a text file contains 100 E's, each E takes 1 byte or 8
   bits to represent, the size of the file would be 100 bytes. Using
   Huffman compression, we could encode E in such a way that it would
   only take 2 bits to represent each character. After compression,
   this file would be 200 bits or 25 bytes. Essentially, more frequent
   characters are given encodings that take fewer bits to represent.
   These characters are stored in a binary tree. When the decompression
   algorithm iterates over an encoded string, it would go left down the
   tree if it sees a 0 and right when it sees a 1.

   The challenge is to write a general decompression algorithm that would
   work on any Huffman tree.
 */ 

public class huffman {

   class Node {
        public  int frequency; // the frequency of this tree
        public  char data;
        public  Node left, right;
    }

    void decode(String S, Node root) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        Node temp = root;
        while (i != S.length()) {
            if (S.charAt(i) == '0') {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
            // reached the leaf node
            if (temp.left == null && temp.right == null) {
                result.append(temp.data);
                // reset temp once letter is found
                temp = root;
            }
            i++;
        }
        System.out.println(result.toString());
    }
}
