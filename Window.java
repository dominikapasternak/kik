import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame{


    //zmiana O na X i odwrotnie przy kolejnych turach
    public void changePlayer(){

        if(currentPlayermark == player1.GetMark()){
            currentPlayermark = player2.GetMark();
        }

        else{
            currentPlayermark = player1.GetMark();
        }
    }
    public void restart()
    {

        for (int i  = 0; i < 3; i ++)
        {
            for (int j  = 0 ; j < 3; j++)
            {
                board[i][j] = " ";
            }
        }
       /*button0.setEnabled(true);
         button1.setEnabled(true);
         button2.setEnabled(true);
         button3.setEnabled(true);
         button4.setEnabled(true);
         button5.setEnabled(true);
         button6.setEnabled(true);
         button7.setEnabled(true);
         button8.setEnabled(true); */
    }
    //klasa z okienkami
    public Window()
    {
        //okno glowne
        setSize(500, 300);
        setTitle("Kolko i krzyzyk");
        setLayout(null);

        //tablica w ktorej sa zapisane gdzie jest jaki znak
        String[][] board = new String[3][3];
        for (int i  = 0; i < 3; i ++)
        {
            for (int j  = 0 ; j < 3; j++)
            {
                board[i][j] = " ";
            }
        }
       
        JLabel JLabel1= new JLabel();
        JLabel JLabel2 = new JLabel();



        JButton button0 = new JButton(board[0][0]);
        button0.setBounds(0,0, 50,50);
        add(button0);
        button0.addActionListener(e->{
            button0.setText(currentPlayermark);
            changePlayer();
            button0.setEnabled(false);
            board[0][0] = currentPlayermark;
            JLabel1.setFont(new java.awt.Font("Dialog", 0, 24));
            JLabel1.setText("Tura gracza");
            JLabel2.setText(currentPlayermark);

        });


        JButton button1 = new JButton(board[0][1]);
        button1.setBounds(50,0, 50,50);
        add(button1);
        button1.addActionListener(e->{
            button1.setText(currentPlayermark);
            changePlayer();
            button1.setEnabled(false);
            board[0][1] = currentPlayermark;
            JLabel1.setFont(new java.awt.Font("Dialog", 0, 24));
            JLabel1.setText("Tura gracza");
            JLabel2.setText(currentPlayermark);


        });

        JButton button2 = new JButton(board[0][2]);
        button2.setBounds(100,0, 50,50);
        add(button2);
        button2.addActionListener(e->{
            button2.setText(currentPlayermark);
            changePlayer();
            button2.setEnabled(false);
            board[0][2] = currentPlayermark;
            JLabel1.setFont(new java.awt.Font("Dialog", 0, 24));
            JLabel1.setText("Tura gracza");
            JLabel2.setText(currentPlayermark);

        });

        JButton button3 = new JButton(board[1][0]);
        button3.setBounds(0,50, 50,50);
        add(button3);
        button3.addActionListener(e->{
            button3.setText(currentPlayermark);
            changePlayer();
            button3.setEnabled(false);
            board[1][0] = currentPlayermark;
            JLabel1.setFont(new java.awt.Font("Dialog", 0, 24));
            JLabel1.setText("Tura gracza");
            JLabel2.setText(currentPlayermark);

        });

        JButton button4 = new JButton(board[1][1]);
        button4.setBounds(50,50, 50,50);
        add(button4);
        button4.addActionListener(e->{
            button4.setText(currentPlayermark);
            changePlayer();
            button4.setEnabled(false);
            board[1][1] = currentPlayermark;
            JLabel1.setFont(new java.awt.Font("Dialog", 0, 24));
            JLabel1.setText("Tura gracza");
            JLabel2.setText(currentPlayermark);
        });

        JButton button5 = new JButton(board[1][2]);
        button5.setBounds(100,50, 50,50);
        add(button5);
        button5.addActionListener(e->{
            button5.setText(currentPlayermark);
            changePlayer();
            button5.setEnabled(false);
            board[1][2] = currentPlayermark;
            JLabel1.setFont(new java.awt.Font("Dialog", 0, 24));
            JLabel1.setText("Tura gracza");
            JLabel2.setText(currentPlayermark);
        });


    JButton button6 = new JButton(board[2][0]);
    button6.setBounds(0, 100, 50, 50);
    add(button6);
        button6.addActionListener(e->{
        button6.setText(currentPlayermark);
        changePlayer();
        button6.setEnabled(false);
        board[2][0] = currentPlayermark;
        JLabel1.setFont(new java.awt.Font("Dialog", 0, 24));
        JLabel1.setText("Tura gracza");
        JLabel2.setText(currentPlayermark);
    });

    JButton button7 = new JButton(board[2][1]);
    button7.setBounds(50,100, 50,50);
    add(button7);
        button7.addActionListener(e->{
        button7.setText(currentPlayermark);
        changePlayer();
        button7.setEnabled(false);
        board[2][1] = currentPlayermark;
        JLabel1.setFont(new java.awt.Font("Dialog", 0, 24));
        JLabel1.setText("Tura gracza");
        JLabel2.setText(currentPlayermark);
    });

    JButton button8 = new JButton(board[2][2]);
    button8.setBounds(100,100, 50,50);
    add(button8);
        button8.addActionListener(e->{
        button8.setText(currentPlayermark);
        changePlayer();
        button8.setEnabled(false);
        board[2][2] = currentPlayermark;
        JLabel1.setFont(new java.awt.Font("Dialog", 0, 24));
        JLabel1.setText("Tura gracza");
        JLabel2.setText(currentPlayermark);
    });

        JButton button10 = new JButton();
        button10.setBounds(200,0, 50,50);
        add(button10);
        button10.addActionListener(e->{
        button10.setText("Restart");
        restart();
         
        });
}

    Player player1 = new Player("Gracz niebieski", "O");
    Player player2 = new Player("Gracz czerwony", "X");

    String currentPlayermark = player1.GetMark();


    String[][] board = new String[3][3];

    public boolean checkRows()
    {
        for(int i = 0; i < 3; i++)
        {
            if(board[i][0].equals(currentPlayermark) || board[i][1].equals(currentPlayermark) || board[i][2].equals(currentPlayermark))
                return true;
        }
        return false;
    }

    public boolean checkColumns()
    {
        for(int i = 0; i < 3; i++)
        {
            if(board[0][i].equals(currentPlayermark) || board[1][i].equals(currentPlayermark) || board[2][i].equals(currentPlayermark))
                return true;
        }
        return false;
    }

    public boolean checkDiagonal()
    {
        if((board[0][0].equals(currentPlayermark) || board[1][1].equals(currentPlayermark) || board[2][2].equals(currentPlayermark)) || (board[2][0].equals(currentPlayermark) || board[1][1].equals(currentPlayermark) || board[0][2].equals(currentPlayermark)))
            return true;
        else
            return false;
    }

    public void checkWin() {

        JLabel JLabel3 = new JLabel();
        JLabel JLabel4 = new JLabel();
        JLabel JLabel5 = new JLabel();
        if (checkColumns() || checkDiagonal() || checkRows()) {
            JLabel3.setFont(new java.awt.Font("Dialog", 0, 24));
            JLabel3.setText("Wygrał gracz");
            JLabel4.setText(currentPlayermark);
        } else {
            JLabel5.setFont(new java.awt.Font("Dialog", 0, 24));
            JLabel5.setText("Remis");
        }
        
    }

}
