package StackIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        List<Integer> list = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        while (!input.equals("END")) {
            String[] command = input.split(" \\d,");
            switch (command[0]) {
                case "Push":
                    stringBuilder.delete(0, 0);
                    for (int i = 0; i < command.length - 2; i++) {
                        stringBuilder.append(command[i]);
                    }
                    break;
                case "Pop":
                    break;
            }

            input = in.nextLine();
        }
        System.out.println();
    }
}

