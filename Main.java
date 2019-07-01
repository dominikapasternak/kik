import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Window okno = new Window();
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setVisible(true);

        while(true){
            for(int i = 0; i < 3; i++)
                System.out.println(okno.board[i][0]);
        }
    }
}
