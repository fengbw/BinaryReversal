package com.derek;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String input = "47";
        Main m = new Main();
        System.out.println(m.BinaryReversal(input));
    }

    public String BinaryReversal(String input) {
        String inputBinary = Integer.toBinaryString(Integer.valueOf(input));
        int inputBinaryLength = inputBinary.length();
        int leadingZero = 8 - inputBinaryLength % 8;
        StringBuilder sb = new StringBuilder();
        if (inputBinaryLength % 8 != 0) {
            for (int i = 0; i < leadingZero; i++) {
                sb.append(0);
            }
            sb.append(inputBinary);
        }
        String resBinary = sb.reverse().toString();
        String res = String.valueOf(Integer.parseInt(resBinary, 2));
        return res;
    }
}
