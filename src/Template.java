package com.reply;

import java.io.*;
import java.util.*;

public class Template {
    private static final File input = new File("input.txt");
    private static final File output = new File("output.txt");
    private static Scanner sc;
    private static PrintWriter pw;
    
    private static void solve() {
        int N = sc.nextInt();
        
        // TODO
        
        pw.println(N);
    }
    
    public static void main(String[] args) {
        try {
            sc = new Scanner(input);
            pw = new PrintWriter(output);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int T = sc.nextInt();
        for (int t = 1; t <= T; ++t) {
            pw.printf("Case #%d: ", t);
            solve();
        }
    }
}
