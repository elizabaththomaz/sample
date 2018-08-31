import javax.swing.*;

/**
 * Created by user on 25/7/18.
 */
public class Sample {
    private JButton button1;
    private  JPanel panel1;
    Sample(){
     JFrame frame=new JFrame("First App");
     button1=new JButton("click");
     frame.setLayout(null);
     frame.setSize(500,500);
     frame.add(button1);
     button1.setBounds(120,100,70,30);
     frame.setVisible(true);

    }

    public static void main(String[] args) {
        new Sample();
    }

}
