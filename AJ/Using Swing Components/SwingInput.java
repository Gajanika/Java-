import javax.swing.*;

public class SwingInput {
    public static void main(String[] args) {
        String temp;
        temp = JOptionPane.showInputDialog(null, "First number");
        int a = Integer.parseInt(temp);
        temp = JOptionPane.showInputDialog(null, "Second number");
        int b = Integer.parseInt(temp);
        temp = JOptionPane.showInternalInputDialog(null, "Third number");
        int c = Integer.parseInt(temp);
        JOptionPane.showMessageDialog(null, "Average is " + (a + b + c) / 3);

    }
}