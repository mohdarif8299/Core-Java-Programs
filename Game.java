import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Game implements ActionListener  {
static JFrame f;
JButton l;
static int i=0,j=0,k,p=0,q=0,r=0;
boolean turn = false;
static String tictactoe[][] = new String[3][3];
JButton player1,player2,exit,reset,play_again;
JButton g[] = new JButton[9];
    Game() {
      f = new JFrame("TIC TAC TOE");
      l = new JButton("SELECT PLAYER");
      player1 = new JButton("PLAYER O");
      player2 = new JButton("PLAYER X");
      reset = new JButton("RESET");
      play_again = new JButton("PLAY AGAIN");
      f.setLayout(new GridLayout(0,3));
   for(k=0;k<9;k++)
     g[k] = new JButton("");
      exit = new JButton("EXIT");
      f.setVisible(true);
      f.setSize(400,400);
      f.add(l);
      f.add(player1);
      f.add(player2);
   for(k=0;k<9;k++)
     f.add(g[k]);
      f.add(exit);
      f.add(reset);
      f.add(play_again);
      for(k=0;k<9;k++)
        g[k].addActionListener(this);
    exit.addActionListener(this);
    reset.addActionListener(this);
    play_again.addActionListener(this);
  }
    public void actionPerformed(ActionEvent ae) {
    if(ae.getSource()==exit)
        f.dispose();
    if(ae.getSource()==play_again) {
      i=0;
      for(k=0;k<9;k++)
        g[k].setText("");
      for(k=0;k<3;k++)
        for(j=0;j<3;j++)
          tictactoe[k][j] = null;
    }
    if(ae.getSource()==reset) {
      for(k=0;k<9;k++)
      g[k].setText("");
      for(k=0;k<3;k++)
        for(j=0;j<3;j++)
          tictactoe[k][j] = null;
      i=0;
    }
    //logic
    for (k=0;k<9;k++) {
      if(ae.getSource()==g[k]) {
        if(turn) {
        g[k].setText("X");
        for (p=0;p<=k;p++) {
          for (j=0;j<3;j++) {
            if (k>=0&&k<=2) {
              tictactoe[j][k] = g[k].getText().toString();
              turn = false;
              i++;
              winner();
              return;
            }
            if(k>2&&k<=5) {
              j =1;
              tictactoe[j][k-3] = g[k].getText().toString();
              turn = false;
              i++;
              winner();
              return;
            }
            if (k>5&&k<=8) {
              j=2;
              tictactoe[j][k-6] = g[k].getText().toString();
              turn = false;
              i++;
              winner();
              return;
            }
          }
        }
        }
        else {
          g[k].setText("O");
          for (p=0;p<=k;p++) {
            for (j=0;j<3;j++) {
              if (k>=0&&k<=2) {
                tictactoe[j][k] = g[k].getText().toString();
                turn = true;
                i++;
                winner();
                return;
              }
              if(k>2&&k<=5) {
                j=1;
                tictactoe[j][k-3] = g[k].getText().toString();
                turn = true;
                i++;
                winner();
                return;
              }
              if (k>5&&k<=8) {
                j=2;
                tictactoe[j][k-6] = g[k].getText().toString();
                turn = true;
                i++;
                winner();
                return;
              }
            }
          }
        }
      }
    }
    }
  public static void main(String[] args) {
     new Game();
  }
  public void winner() {
    String horiz_upper = tictactoe[0][0]+tictactoe[0][1]+tictactoe[0][2];
    String horiz_middle = tictactoe[1][0]+tictactoe[1][1]+tictactoe[1][2];
    String horiz_lower = tictactoe[2][0]+tictactoe[2][1]+tictactoe[2][2];
    String ver_left = tictactoe[0][0]+tictactoe[1][0]+tictactoe[2][0];
    String ver_middle = tictactoe[0][1]+tictactoe[1][1]+tictactoe[2][1];
    String ver_right = tictactoe[0][2]+tictactoe[1][2]+tictactoe[2][2];
    String diag = tictactoe[0][0]+tictactoe[1][1]+tictactoe[2][2];
    String diag1 = tictactoe[0][2]+tictactoe[1][1]+tictactoe[2][0];
    if(i>2) {
      if(horiz_upper.equals("OOO")||horiz_lower.equals("OOO")||ver_right.equals("OOO")||ver_left.equals("OOO")||diag.equals("OOO")||horiz_middle.equals("OOO")||ver_middle.equals("OOO")||diag1.equals("OOO")) {
        JOptionPane.showMessageDialog(null,"O WINS","TIC TAC TOE",JOptionPane.WARNING_MESSAGE);
                              for(k=0;k<9;k++)
                                g[k].setText("");
                                for(k=0;k<3;k++)
                                  for(j=0;j<3;j++)
                                    tictactoe[k][j] = null;
                                i=0;
       }
       if(horiz_upper.equals("XXX")||horiz_lower.equals("XXX")||ver_right.equals("XXX")||ver_left.equals("XXX")||diag.equals("XXX")||horiz_middle.equals("XXX")||ver_middle.equals("XXX")||diag1.equals("XXX")) {
         JOptionPane.showMessageDialog(null,"X WINS","TIC TAC TOE",JOptionPane.WARNING_MESSAGE);
                               for(k=0;k<9;k++)
                                 g[k].setText("");
                                 for(k=0;k<3;k++)
                                   for(j=0;j<3;j++)
                                     tictactoe[k][j] = null;
                                 i=0;
                      }
                  }
    if(i>=9) {
          JOptionPane.showMessageDialog(null,"MATC TIED","TIC TAC TOE",JOptionPane.WARNING_MESSAGE);
          for(k=0;k<3;k++)
            for(j=0;j<3;j++)
              tictactoe[k][j] = null;
          i=0;
        }
}
}
