package com.company;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	    Scanner kb = new Scanner(System.in);

        PrintWriter file = new PrintWriter("TruthTable.txt");
        boolean A, B;

        System.out.println("Enter the expression you would like a truth table for using A and B.");
        String exp = kb.next();

        file.write("A\tB\t" + exp);



        file.close();

    }
}
