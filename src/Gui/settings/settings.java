package gui.settings;

import logic.logic;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;

// creates a second window that allows end users to edit the settings of the gui

public class settings implements ActionListener {

    public boolean state = false;

    // creates a button object on the frame
    public boolean button(JFrame frame, String text) {
        JButton button = new JButton(text);

        button.setBounds(50, 50, 150, 50);
        frame.add(button);

        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (state == false) {
                    state = true;
                } else {
                    state = false;
                }
                System.out.println(state);
            }
        });

        // button.addActionListener(e -> {
        // if(state == false){
        // button.setText("ON");
        // state = true;
        // }else{
        // button.setText("OFF");
        // state = false;
        // }
        // });
        return state;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("states was changed");

    }

    // public static void main(String args[]) {
    //     int dimension = 500;
    //     JFrame frame = new JFrame();
    //     System.out.println(state);

    //     screenSettings(frame, dimension);
    //     button(frame, "Show Elevation");

    // }

}
