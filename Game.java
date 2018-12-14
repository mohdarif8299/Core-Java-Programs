import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Game implements ActionListener  {
static JFrame f;
JButton l;
static int i=0,j=0,k;
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
   for(k=0;k<9;k++) {
     g[k] = new JButton("");
   }
      exit = new JButton("EXIT");
      f.setVisible(true);
      f.setSize(400,400);
      f.add(l);
      f.add(player1);
      f.add(player2);
   for(k=0;k<9;k++) {
     f.add(g[k]);
   }
      f.add(exit);
      f.add(reset);
      f.add(play_again);
      for(k=0;k<9;k++) {
        g[k].addActionListener(this);
      }
    exit.addActionListener(this);
    reset.addActionListener(this);
    play_again.addActionListener(this);
  }
    public void actionPerformed(ActionEvent ae) {
    if(ae.getSource()==exit) {
        f.dispose();
    }
    if(ae.getSource()==play_again) {
      i=0;
      for(k=0;k<9;k++) {
        g[k].setText("");
      }
      for(k=0;k<3;k++) {
        for(j=0;j<3;j++) {
          tictactoe[k][j] = null;
        }
      }
    }
    if(ae.getSource()==reset) {
      for(i=0;i<9;i++)
      g[i].setText("");
    }
      if(ae.getSource()==g[0]) {
        if(turn) {
          g[0].setText("X");
          tictactoe[0][0]=g[0].getText().toString();
          turn = false;
          i++;
          winner();
        }
        else {
          g[0].setText("O");
          tictactoe[0][0]=g[0].getText().toString();
          turn = true;
             i++;
            winner();
        }
      }
      if(ae.getSource()==g[1]) {
        if(turn) {
          g[1].setText("X");
          tictactoe[0][1]=g[1].getText().toString();
          turn = false;
          i++;
            winner();
        }
        else {
          g[1].setText("O");
          tictactoe[0][1]=g[1].getText().toString();
          turn = true;
          i++;
            winner();
        }
      }
      if(ae.getSource()==g[2]) {
        if(turn) {
          g[2].setText("X");
          tictactoe[0][2]=g[2].getText().toString();
          turn = false;
          i++;
            winner();
        }
        else {
          g[2].setText("O");
          tictactoe[0][2]=g[2].getText().toString();
          turn = true;
          i++;
            winner();
        }
      }
      if(ae.getSource()==g[3]) {
        if(turn) {
          g[3].setText("X");
          tictactoe[1][0]=g[3].getText().toString();
          turn = false;
          i++;
            winner();
        }
        else {
          g[3].setText("O");
          tictactoe[1][0]=g[3].getText().toString();
          turn = true;
          i++;
            winner();
        }
      }

      if(ae.getSource()==g[4]) {
        if(turn) {
          g[4].setText("X");
          tictactoe[1][1]=g[4].getText().toString();
          turn = false;
          i++;
            winner();
        }
        else {
          g[4].setText("O");
          tictactoe[1][1]=g[4].getText().toString();
          turn = true;
          i++;
        winner();
      }
    }
      if(ae.getSource()==g[5]) {
        if(turn) {
          g[5].setText("X");
          tictactoe[1][2]=g[5].getText().toString();
          turn = false;
          i++;
            winner();
        }
        else {
          g[5].setText("O");
          tictactoe[1][2]=g[5].getText().toString();
          turn = true;
          i++;
            winner();
        }
      }
      if(ae.getSource()==g[6]) {
        if(turn) {
          g[6].setText("X");
          tictactoe[2][0]=g[6].getText().toString();
          turn = false;
          i++;
            winner() ;
        }
        else {
          g[6].setText("O");
          tictactoe[2][0]=g[6].getText().toString();
          turn = true;
          i++;
           winner();
      }
    }
      if(ae.getSource()==g[7]) {
        if(turn) {
          g[7].setText("X");
          tictactoe[2][1]=g[7].getText().toString();
          turn = false;
          i++;
            winner();
        }
        else {
          g[7].setText("O");
          tictactoe[2][1]=g[7].getText().toString();
          turn = true;
          i++;
            winner();
        }
      }
      if(ae.getSource()==g[8]) {
        if(turn) {
          g[8].setText("X");
          tictactoe[2][2]=g[8].getText().toString();
          turn = false;
          i++;
            winner();
        }
        else {
          g[8].setText("O");
          tictactoe[2][2]=g[8].getText().toString();
          turn = true;
          i++;
            winner();
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
    if(i>=3) {
      if(horiz_upper.equals("OOO")||horiz_lower.equals("OOO")||ver_right.equals("OOO")||ver_left.equals("OOO")||diag.equals("OOO")||horiz_middle.equals("OOO")||ver_middle.equals("OOO")) {
        JOptionPane.showMessageDialog(null,"O WINS","TIC TAC TOE",JOptionPane.WARNING_MESSAGE);
                              for(i=0;i<9;i++)
                                g[i].setText("");
       }
       if(horiz_upper.equals("XXX")||horiz_lower.equals("XXX")||ver_right.equals("XXX")||ver_left.equals("XXX")||diag.equals("XXX")||horiz_middle.equals("XXX")||ver_middle.equals("XXX")) {
         JOptionPane.showMessageDialog(null,"X WINS","TIC TAC TOE",JOptionPane.WARNING_MESSAGE);
                               for(i=0;i<9;i++)
                                 g[i].setText("");
       }
       if(i>9)
          JOptionPane.showMessageDialog(null,"MATC TIED","TIC TAC TOE",JOptionPane.WARNING_MESSAGE);
    }
  }
}
