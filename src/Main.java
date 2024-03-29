import javax.swing.*;
import java.awt.*;

class Main extends JFrame {
    
    class App extends JPanel {
        
        //Stage stage;
        Grid grid;

        public App() {
            setPreferredSize(new Dimension(920, 720));
            //stage = new Stage();
            grid = new Grid();
        }

        @Override
        public void paint(Graphics g) {
            //stage.paint(g, getMousePosition());
            grid.paint(g, getMousePosition());
        }

    }

    public static void main(String[] args) throws Exception {
        Main window = new Main();
        window.run();
    }

    private Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        App canvas = new App();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);
    }

    public void run() {
        while (true) {
            this.repaint();
        }
    }
}