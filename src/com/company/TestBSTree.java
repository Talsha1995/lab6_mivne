package com.company;

import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class TestBSTree {

    public static void main(String[] args) throws Exception {

        InputStreamReader reader = new InputStreamReader(System.in);
        StreamTokenizer tokens = new StreamTokenizer(reader);
        int curr;

        BSTree myTree = new BSTree ();

        System.out.println("welcome to BSTree printer");
        curr = tokens.nextToken(); //our current state
        try {
            while ((curr != StreamTokenizer.TT_NUMBER) && (!tokens.sval.equals("Q"))) { //checking for proper input and end signal
                switch (tokens.sval) { //switch cases

                    case ("add"):
                        if (tokens.nextToken() != StreamTokenizer.TT_NUMBER) {
                            throw new Exception("illegal use of push");
                        }
                        myTree.insert((int) tokens.nval);
                        break;
                    case ("find"):
                        if (tokens.nextToken() != StreamTokenizer.TT_NUMBER) {
                            throw new Exception("illegal use of push");
                        }
                        System.out.println(myTree.retrieve((int) tokens.nval)   );
                        break;
                    case ("K"):
                        System.out.println(myTree.Inorder());
                        break;
                    case ("E"):
                        System.out.println(myTree.isEmpty());
                        break;
                    case ("F"):
                        System.out.println(myTree.isFull());
                        break;
                    case ("C"):
                        myTree.clear();
                        break;
                    default:
                        throw new Exception();
                }
                curr = tokens.nextToken(); //token++

            }
            if (curr == StreamTokenizer.TT_NUMBER) {
                throw new Exception("illegal input");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
