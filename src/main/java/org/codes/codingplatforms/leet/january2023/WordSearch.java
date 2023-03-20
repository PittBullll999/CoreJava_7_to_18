package org.codes.codingplatforms.leet.january2023;

import java.util.HashMap;

public class WordSearch {
    HashMap<Node,Boolean> hashMap=new HashMap<>();
    public static void main(String[] args) {
        char[] a=new char[]{'C','A','A'};
        char[] b=new char[]{'A','A','A'};
        char[] c=new char[]{'B','C','D'};
        char[][] x=new char[3][3];
        x[0]=a;
        x[1]=b;
        x[2]=c;
        WordSearch w=new WordSearch();
        System.out.println(w.exist(x,"AAABC"));

    }
    public boolean exist(char[][] board, String word) {
        boolean t=false;
        for(int i=0;i<board.length;i++)
        {
            for (int j=0;j<board[0].length;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    boolean l=find(board,word,i,j,0);
                    if(l)
                    {
                        return true;
                    }
                }
            }
        }
        return t;

    }
    private  boolean search(char[][] board,String word,int i,int j,int index)
    {
        if(i>board.length||j>board[0].length||i<0||j<0)
        {
            return false;
        }
        if(board[i][j]=='#')
        {
            return false;
        }
        if(board[i][j]==word.charAt(index)&&index==word.length()-1)
        {
            return true;
        }
        else if(board[i][j]==word.charAt(index)&&index!=word.length()-1)
        {
            board[i][j]='#';
            boolean a=false;
            boolean b=false;
            boolean c=false;
            boolean d=false;
            if(i==0&&j==0)
            {
                a=search(board, word, i, j+1, index+1)
                        ||search(board, word, i+1, j, index+1);
            }
            if(i==0&&j>0&&j<board[0].length)
            {
                b=search(board, word, i, j+1, index+1)
                        ||search(board, word, i+1, j, index+1)
                        ||search(board, word, i, j-1, index+1);
            }
            if(j==0&&i>0&&i<board.length)
            {
                c=search(board, word, i, j+1, index+1)
                        ||search(board, word, i-1, j, index+1)
                        ||search(board, word, i+1, j, index+1);
            }
            if(i>0&&j>0&&i<board.length&&j<board[0].length)
            {
                d=search(board, word, i, j+1, index+1)
                        ||search(board, word, i, j-1, index+1)
                        ||search(board, word, i+1, j, index+1)
                        ||search(board, word, i-1, j, index+1);
            }


            return (a||b||c||d);
        }
        else {
            return false;
        }

    }
    class Node{
        int i;
        int j;
        int index;
        Node(int i,int j,int index)
        {
            this.i=i;
            this.j=j;
            this.index=index;
        }
    }
    private  boolean find(char[][] board,String word,int i,int j,int index)
    {

        if(i<0||j<0||j>board[0].length-1||i>board.length-1||board[i][j]=='#')
        {
            return false;
        }
        if(hashMap.containsKey(new Node(i,j,index)))
        {
            return hashMap.get(new Node(i,j,index));
        }
        else {
            if(board[i][j]!=word.charAt(index))
            {
                return false;
            }

            if(board[i][j]==word.charAt(index)&&index==word.length()-1)
            {
                return true;
            }
            else if(board[i][j]==word.charAt(index)&&index!=word.length()-1)
            {
                char w[][]=new char[board.length][board[0].length];
                for(int f=0;f<board.length;f++)
                {
                    for (int m=0;m<board[0].length;m++)
                    {
                        w[f][m]=board[f][m];
                    }
                }
                //w=board;
                w[i][j]='#';
                int t=index+1;

                boolean k=((find(w, word, i+1, j, t)
                        ||find(w, word, i, j+1, t)
                        ||find(w, word, i-1, j, t)
                        ||find(w, word, i, j-1, t)));
                hashMap.put(new Node(i,j,index),k);
                return k;

            }
            else {
                return false;
            }
        }

    }
}
