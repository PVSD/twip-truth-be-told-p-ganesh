package com.company;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	    Scanner kb = new Scanner(System.in);
        FileWriter fw = new FileWriter("C:\\")
        PrintWriter file = new PrintWriter("TruthTable.txt");

        System.out.println("Enter the expression you would like a truth table for.");
        String exp = kb.next();

        System.out.println(exp);


    }
}
