/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.io.IOException;

/**
 *
 * @author Kyra Balliram
 */
public class Test {
    public static void main(String[] args) throws IOException {
        
        String output = BACKEND.ChatGPT.askChatBot("Awaken prometheus");
        System.out.println(output);

    }
}
