package inputoutputbnf;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class InputOutputBNF {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        ArrayList<String> list = inputChecker();
        for (int i = 0; i < list.size(); i++)   {
            System.out.println(list.get(i));
        }
        // outputChecker();
    }
    
    public static ArrayList inputChecker() throws FileNotFoundException, IOException  {
        File inputCases = new File("Input Cases.txt");
        BufferedReader br = new BufferedReader(new FileReader(inputCases));
        
        ArrayList<String> list = new ArrayList<>();
        String str;
        while ((str = br.readLine()) != null)	{
            Boolean valid;
            valid = str.contains("\\V");
            str = str.replace("\\V", "");
            str = str.replace("\\I", "");
            
            CharStream input = CharStreams.fromString(str);
            InputLexer lexer = new InputLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            InputParser parser = new InputParser(tokens);
            ParseTree tree = parser.scanner_declaration(); // replace with your start rule

            String msg = "";
            if (parser.getNumberOfSyntaxErrors() == 0)  {
                msg = msg+input+": covered. ";
                if (!valid) {
                    msg = msg+"it shouldn't be.";
                }
            }
            else    {
                msg = msg+input+": not covered. ";
                if (valid) {
                    msg = msg+"it should be.";
                }
            }
            list.add(msg);
        }
        return list;
    }
    
    public static void outputChecker() throws FileNotFoundException, IOException  {
        File outputCases = new File("Output Cases.txt");
        BufferedReader br = new BufferedReader(new FileReader(outputCases));
        
        String str;
        while ((str = br.readLine()) != null)	{
            CharStream input = CharStreams.fromString(str);
            OutputLexer lexer = new OutputLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            OutputParser parser = new OutputParser(tokens);
            ParseTree tree = parser.scanner_declaration(); // replace with your start rule

            if (parser.getNumberOfSyntaxErrors() == 0)  {
                System.out.println(input+" : covered!");
            }
            else    {
                System.out.println(input+" : not covered.");
            }
        }
    }
}