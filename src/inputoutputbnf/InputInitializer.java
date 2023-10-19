/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inputoutputbnf;

import org.antlr.v4.Tool;

/**
 *
 * @author chris
 */
public class InputInitializer {
    public static void main(String[] args)  {
        String[] antlrArgs = {"-visitor", "-package", "inputoutputbnf", "Input.g4"};
        Tool.main(antlrArgs);
    }
}
