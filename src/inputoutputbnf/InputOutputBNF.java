package inputoutputbnf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class InputOutputBNF {
    public static void main(String[] args) throws FileNotFoundException, IOException  {
        // inputChecker();
        outputChecker();
    }
    
    public static void inputChecker() throws FileNotFoundException, IOException  {
        boolean stopper = false;
        while (!stopper)    {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter input statement (enter 0 to stop): ");
            String str = sc.nextLine();
            if (str.equals("0"))    {
                stopper = true;
                break;
            }
            
            Boolean valid = str.contains("\\V");
            str = str.replace("\\V", "");
            str = str.replace("\\I", "");

            CharStream input = CharStreams.fromString(str);
            InputLexer lexer = new InputLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            InputParser parser = new InputParser(tokens);
            ParseTree tree = parser.input_statement();

            String msg = "";
            if (parser.getNumberOfSyntaxErrors() == 0)  {
                msg = msg+input+": covered. ";
                if (!valid)
                    msg = msg+"it shouldn't be.";
            }
            else    {
                msg = msg+input+": not covered. ";
                if (valid)
                    msg = msg+"it should be.";
            }

            System.out.println(msg);
        }
    }
    
    public static void outputChecker() throws FileNotFoundException, IOException  {
        boolean stopper = false;
        while (!stopper)    {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter output statement (enter 0 to stop): ");
            String str = sc.nextLine();
            if (str.equals("0"))    {
                stopper = true;
                break;
            }
            
            Boolean valid = str.contains("\\V");
            str = str.replace("\\V", "");
            str = str.replace("\\I", "");

            CharStream input = CharStreams.fromString(str);
            OutputLexer lexer = new OutputLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            OutputParser parser = new OutputParser(tokens);
            ParseTree tree = parser.program();

            String msg = "";
            if (parser.getNumberOfSyntaxErrors() == 0)  {
                msg = msg+input+": covered. ";
                if (!valid)
                    msg = msg+"it shouldn't be.";
            }
            else    {
                msg = msg+input+": not covered. ";
                if (valid)
                    msg = msg+"it should be.";
            }

            System.out.println(msg);
        }
    }
}