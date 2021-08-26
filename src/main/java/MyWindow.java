import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    public MyWindow () {
        setLocation(650,250);
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton myFirstButton = new JButton ("Выход");

        ActionListener myButtonLisiner;
        myButtonLisiner = new CloseActionListener();
        myFirstButton.addActionListener(myButtonLisiner);

        JButton mySecondButton = new JButton("Вторая кнопка");


        JPanel myPanel = new JPanel(new GridLayout(1,2));
        myPanel.add(myFirstButton);
        myPanel.add(mySecondButton);

        add(myPanel, BorderLayout.SOUTH);

        setVisible(true);
    }
}
