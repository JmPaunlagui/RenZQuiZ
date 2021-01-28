/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jnom.quiz;

import java.util.Scanner;

/**
 *
 * @author JmPaunlagui
 */
public class main {

    static Scanner cin = new Scanner(System.in);

    public static void main(String args[]) {
        
        int correct = 0;
        int incorrect = 0;
        int questions = 5;
        System.out.println("Welcome to the Multiple Choice Quiz! \n");

        String[][] Ques_Ans = {
            { "Who is the king arthur in fate stay?", "\nA. Archer \nB. Saber \nC. Lancer \n", "B" },
            { "Who are the main protagonist in fate zero?", "\nA. Emiya Kiritsugu and Irisviel \nB. Emiya Kiritsugu and Saber \nC. Emiya Shirou and Saber \n", "B" },
            { "Who is the main character in kimetsu no yaiba?", " \nA. Kamada Tanjiro \nB. Giyu Tomioka \nC. Shinobu Kocho \n", "A" },
            { "Who is the strongest in pillar in kimetsu no yaiba?", " \nA. Mitsuri Kanroji\nB. Sanemi Shinazugawa\nC. Gyomei Himejima \n", "C" },
            { "Who is the demon that don't eat humans?", "\nA. Nezuko \nB. Rui\nC. Muzan \n", "A" }
        };
        String[] user_ans = new String[(int) questions];
        int i = 0;
        do {
            System.out.print("" + (i + 1) + ". " + Ques_Ans[i][0] + "   " + Ques_Ans[i][1]);

            user_ans[i] = String.valueOf(cin.next().charAt(0));

            if (Ques_Ans[i][2].equals(user_ans[i])) {
                System.out.println("\n Correct!");
                correct++;
            } else {
                System.out.println("\n Incorrect. The correct answer is " + Ques_Ans[i][2]);
                incorrect++;
            }
            System.out.print("\n");
            i++;
        } while (i < questions);
        System.out.println("\n Number of correct answers: " + correct);
        System.out.println("\n Number of incorrect answers: " + incorrect);
        System.exit(0);
    }
}


