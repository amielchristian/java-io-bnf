package inputoutputbnf;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class InputOutputBNF {
    public static void main(String[] args) throws FileNotFoundException, IOException  {
        JFrame f = new JFrame("Input/Output Checker");
        JPanel p1 = new JPanel(); JPanel p2 = new JPanel(); JPanel p3 = new JPanel();

        JTextField textField = new JTextField(20);
        JButton button = new JButton("Test");
        JLabel result = new JLabel();
        
        JRadioButton rbInput = new JRadioButton("Input");
        rbInput.setSelected(true);
        JRadioButton rbOutput = new JRadioButton("Output");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(rbInput);
        buttonGroup.add(rbOutput);
        
        button.addActionListener( new ActionListener()    {
            @Override
            public void actionPerformed(ActionEvent e)  {
                String input = textField.getText();
                String msg = "";
                if (rbInput.isSelected())
                    msg = inputChecker(input);
                else if (rbOutput.isSelected())
                    msg = outputChecker(input);
                
                result.setText(msg);
            }
        });

        f.setLayout(new GridLayout(3,1));
        p1.add(textField);
        p1.add(button);
        p2.add(rbInput);
        p2.add(rbOutput);
        p3.add(result);
        f.add(p1);
        f.add(p2);
        f.add(p3);
        f.setSize(300, 150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    
    public static String inputChecker(String str)  {
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
            msg = "Covered. ";
            if (!valid)
                msg = msg+"It shouldn't be.";
        }
        else    {
            msg = "Not covered. ";
            if (valid)
                msg = msg+"It should be.";
        }
        return msg;
    }
    
    public static String outputChecker(String str)  {
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
            msg = "Covered. ";
            if (!valid)
                msg = msg+"It shouldn't be.";
        }
        else    {
            msg = "Not covered. ";
            if (valid)
                msg = msg+"It should be.";
        }
        return msg;
    }
}