import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App extends JFrame {

    private static final String OS_QUESTION_LABEL = "Escoja un sistema operativo: (solo una opción).";

    // declare a new container to get the content pain
    Container window = getContentPane();

    public static void main(String[] args) {
        new App("Exercise", 800, 600);
    }

    /* Constructors =============================================== */
    public App(String title, int width, int height) {
        
        // create the window frame
        createWindow(title, width, height);
        JPanel panel = new OsQuestionComponent();
        window.add(panel);
    }

    /* Methods ==================================================== */
    public void createWindow(String title, int width, int height) {
        // set title, visibility, size and default close operation
        setTitle(title);
        setVisible(true);
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //Custom components class
    public class OsQuestionComponent extends JPanel {

        JLabel osLabel;

        JRadioButton firstCheckBoxSelection;
        JRadioButton secondCheckBoxSelection;
        JRadioButton thirdCheckBoxSelection;        

        ButtonGroup selectionGroup;

        public OsQuestionComponent() {
            Handler al = new Handler();

            osLabel = new JLabel(OS_QUESTION_LABEL, SwingConstants.CENTER);

            firstCheckBoxSelection = new JRadioButton("Microsoft");
            firstCheckBoxSelection.addActionListener(al);

            secondCheckBoxSelection = new JRadioButton("Unix");
            secondCheckBoxSelection.addActionListener(al);

            thirdCheckBoxSelection = new JRadioButton("Solaris");
            thirdCheckBoxSelection.addActionListener(al);

            selectionGroup = new ButtonGroup();
            selectionGroup.add(firstCheckBoxSelection);
            selectionGroup.add(secondCheckBoxSelection);
            selectionGroup.add(thirdCheckBoxSelection);

            this.add(osLabel);
            this.add(firstCheckBoxSelection);
            this.add(secondCheckBoxSelection);
            this.add(thirdCheckBoxSelection);
        }

        private class Handler implements ActionListener {
        
            public void actionPerformed(ActionEvent event){
                if (event.getSource() == firstCheckBoxSelection) {
                    String cmd = event.getActionCommand();
                    System.out.println("Here we are" + cmd);
                }
                if (event.getSource() == secondCheckBoxSelection) {
                    String cmd = event.getActionCommand();
                    System.out.println("Here we are" + cmd);
                }
                if (event.getSource() == thirdCheckBoxSelection) {
                    String cmd = event.getActionCommand();
                    System.out.println("Here we are" + cmd);
                }
            }
        }
    }  
}