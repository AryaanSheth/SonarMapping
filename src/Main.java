import gui.settings.*;
import gui.display.*;
import logic.logic;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Main {
    static int GUIdimension = 500;
    static int Settingsdimension = 500;
    static float[][] matrix = { {1, 2, 3, 4}, { 5, 6, 7, 8}, { 9, 10, 11, 12 }, {13, 14, 15, 16}};

    /**
     * 
     * 
     * @param frame
     *  
     * Defines frame attributes for main display.
     */
    public static void GUIscreenSettings(JFrame frame, int dimension) {
        frame.setSize(dimension+13, dimension+37);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("Matrix Display");
        frame.setResizable(false);
    }

    /**
     * 
     * @param frame
     * 
     *              Defines frame attributes for main display.
     */
    public static void SETINNGSscreenSettings(JFrame frame, int dimension) {
        frame.setSize(dimension + 13, dimension + 37);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("Settings");
        frame.setResizable(false);
    }

    public static void GUI(logic logic, JFrame frame, display display) {
        float[][] normMatirx = logic.normalizeMatrix(matrix, logic.findMaxMatrix(matrix));
        logic.printMatrix(normMatirx);

        GUIscreenSettings(frame, GUIdimension);
        display.generatePanels(normMatirx, frame, display.objectMatrix(normMatirx), GUIdimension);
    }

    public static void SETTINGS(JFrame frame, settings settings) {
        SETINNGSscreenSettings(frame, Settingsdimension);
        settings.button(frame, "test");


    }


    public static void main(String[] args) {
        logic logic = new logic();
        JFrame[] frame = {new JFrame(),new JFrame()}; // each frame is for a diferent window (gui, settings)
        display display = new display();
        settings settings = new settings();

        GUI(logic, frame[0], display);
        SETTINGS(frame[1], settings);
        

    }
    
}
