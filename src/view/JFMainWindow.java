package view;

import javax.swing.*;

public class JFMainWindow extends JFrame {

    public JFMainWindow() {
        setTitle("Titulo de app");
        this.setIconImage( new ImageIcon(getClass().getResource("ruta de el icono")).getImage());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setExtendedState( MAXIMIZED_BOTH );
//        setSize(550,1000);

        setResizable(false);

        setVisible(true);
        initicomponents();
    }

    public void initicomponents(){

    }
}
