package SwitchCasePrograms;

import java.util.Scanner;

public class CheckVowelAndConsonant {
    public static void main(String args[]) {
        char ch;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Alphabet: ");
        ch = input.next().charAt(0);
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(ch +" is a vowel");
                break;
            default:
                System.out.println(ch +" is a consonant");
                break;
        }
    }
}
