package Lab4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Application extends JFrame
{
    private static final long serialVersionUID = 1L;
    int RM = 0, ACM = 0;
    String winner = "DRAW", last = "N/A";

    public Application()
    {
        super("Test First JFrame App");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Создание панели с двумя кнопками

        JPanel contents = new JPanel();
        contents.setLayout(new BorderLayout());
        JLabel MainLabel = new JLabel("Result: " + RM + " X " + ACM + "\n Last Scorer: "
                + last + "\n Winner: " + winner);

        contents.add(MainLabel, BorderLayout.CENTER);
        //Создаем кнопку для Реал Мадрида, подключаем к ней слушатель мыши и добавляем в контент
        JButton but1 = new JButton("Real Madrid");
        but1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                RM++;
                if(RM == ACM){
                    winner = "DRAW";
                }
                else {
                    winner = "Real Madrid";
                }
                last = "Real Madrid";
                MainLabel.setText("Result: " + RM + " X " + ACM + "\n Last Scorer: "
                        + last + "\n Winner: " + winner);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        contents.add(but1, BorderLayout.WEST);

        //Создаем кнопку для АС Милана, подключаем к ней слушатель мыши и добавляем в контент
        JButton but2 = new JButton("AC Milan");
        but2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ACM++;
                if(ACM == RM){
                    winner = "DRAW";
                }
                else {
                    winner = "AC Milan";
                }
                last = "AC Milan";
                MainLabel.setText("Result: " + RM + " X " + ACM + "\n Last Scorer: "
                        + last + "\n Winner: " + winner);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        contents.add(but2, BorderLayout.EAST);
        // Замена панели содержимого
        setContentPane(contents);

        // Определение размера окна
        setSize(450, 300);
        // Открытие окна
        setVisible(true);
    }

}
