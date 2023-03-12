import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math;


public class WZQGUI
{
  private JFrame f;
  private JPanel panel;
  private JLabel l;
  private JComboBox<String> comboBox;
  private JButton[][] buttons;
  private int round, currentX, currentY;
  private Board board;
  private String picture;

  public WZQGUI()
  {
    f = new JFrame();
    panel = new JPanel();
    board = new Board();
    l = new JLabel("                                                                                                                  Can't believe I get it work!   \\（￣︶￣）/                                                                             ");
    comboBox = new JComboBox<String>();
    buttons = new JButton[15][15];
    round = 0;
    currentX = -1;
    currentY = -1;

    panel.setLayout(new GridLayout(15,15));

    for(int i=0;i<15;i++)
      for(int j=0;j<15;j++)
      {
        buttons[i][j] = new JButton(new ImageIcon("0.png"));
        panel.add(buttons[i][j]);
      }

    panel.setLayout(new GridLayout(15,15));
    panel.setSize(600,600);
    f.setSize(600,600);
    f.add(panel, BorderLayout.CENTER);
    f.setTitle("TEST15");
    f.setVisible(true);
    f.add(comboBox, BorderLayout.PAGE_START);
    f.add(l, BorderLayout.PAGE_END);

    addListener();
    comboBox.addItem("                                                                  --------Click check mark to start a new game-------                                           ");
  }

  public void chooseButton(int x, int y)
  {
    board.choose(x,y,f);
    update();
    if(board.checkWin(x,y))
    {
      JOptionPane.showMessageDialog(f,"Game over");
      if(!board.p1Turn)
        JOptionPane.showMessageDialog(f,"Black Win ^_^");
      else
        JOptionPane.showMessageDialog(f,"White Win *_*");
      board.noWinner = false;
      board.choose(x,y,f);
      update();
    }
  }

  public void update()
  {
    for(int i=0;i<15;i++)
      for(int j=0;j<15;j++)
        buttons[i][j].setIcon(new ImageIcon(board.tBoard[i][j]+".png"));
  }

  public void addListener()
  {
    buttons[0][0].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(0,0);
      }
    });

    buttons[0][1].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(0,1);
      }
    });

    buttons[0][2].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(0,2);
      }
    });

    buttons[0][3].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(0,3);
      }
    });

    buttons[0][4].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(0,4);
      }
    });

    buttons[0][5].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(0,5);
      }
    });

    buttons[0][6].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(0,6);
      }
    });

    buttons[0][7].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(0,7);
      }
    });

    buttons[0][8].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(0,8);
      }
    });

    buttons[0][9].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(0,9);
      }
    });

    buttons[0][10].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(0,10);
      }
    });

    buttons[0][11].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(0,11);
      }
    });

    buttons[0][12].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(0,12);
      }
    });

    buttons[0][13].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(0,13);
      }
    });

    buttons[0][14].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(0,14);
      }
    });

    buttons[1][0].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(1,0);
      }
    });

    buttons[1][1].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(1,1);
      }
    });

    buttons[1][2].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(1,2);
      }
    });

    buttons[1][3].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(1,3);
      }
    });

    buttons[1][4].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(1,4);
      }
    });

    buttons[1][5].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(1,5);
      }
    });

    buttons[1][6].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(1,6);
      }
    });

    buttons[1][7].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(1,7);
      }
    });

    buttons[1][8].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(1,8);
      }
    });

    buttons[1][9].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(1,9);
      }
    });

    buttons[1][10].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(1,10);
      }
    });

    buttons[1][11].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(1,11);
      }
    });

    buttons[1][12].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(1,12);
      }
    });

    buttons[1][13].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(1,13);
      }
    });

    buttons[1][14].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(1,14);
      }
    });

    buttons[2][0].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(2,0);
      }
    });

    buttons[2][1].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(2,1);
      }
    });

    buttons[2][2].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(2,2);
      }
    });

    buttons[2][3].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(2,3);
      }
    });

    buttons[2][4].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(2,4);
      }
    });

    buttons[2][5].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(2,5);
      }
    });

    buttons[2][6].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(2,6);
      }
    });

    buttons[2][7].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(2,7);
      }
    });

    buttons[2][8].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(2,8);
      }
    });

    buttons[2][9].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(2,9);
      }
    });

    buttons[2][10].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(2,10);
      }
    });

    buttons[2][11].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(2,11);
      }
    });

    buttons[2][12].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(2,12);
      }
    });

    buttons[2][13].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(2,13);
      }
    });

    buttons[2][14].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(2,14);
      }
    });

    buttons[3][0].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(3,0);
      }
    });

    buttons[3][1].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(3,1);
      }
    });

    buttons[3][2].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(3,2);
      }
    });

    buttons[3][3].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(3,3);
      }
    });

    buttons[3][4].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(3,4);
      }
    });

    buttons[3][5].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(3,5);
      }
    });

    buttons[3][6].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(3,6);
      }
    });

    buttons[3][7].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(3,7);
      }
    });

    buttons[3][8].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(3,8);
      }
    });

    buttons[3][9].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(3,9);
      }
    });

    buttons[3][10].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(3,10);
      }
    });

    buttons[3][11].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(3,11);
      }
    });

    buttons[3][12].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(3,12);
      }
    });

    buttons[3][13].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(3,13);
      }
    });

    buttons[3][14].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(3,14);
      }
    });

    buttons[4][0].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(4,0);
      }
    });

    buttons[4][1].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(4,1);
      }
    });

    buttons[4][2].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(4,2);
      }
    });

    buttons[4][3].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(4,3);
      }
    });

    buttons[4][4].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(4,4);
      }
    });

    buttons[4][5].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(4,5);
      }
    });

    buttons[4][6].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(4,6);
      }
    });

    buttons[4][7].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(4,7);
      }
    });

    buttons[4][8].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(4,8);
      }
    });

    buttons[4][9].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(4,9);
      }
    });

    buttons[4][10].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(4,10);
      }
    });

    buttons[4][11].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(4,11);
      }
    });

    buttons[4][12].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(4,12);
      }
    });

    buttons[4][13].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(4,13);
      }
    });

    buttons[4][14].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(4,14);
      }
    });

    buttons[5][0].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(5,0);
      }
    });

    buttons[5][1].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(5,1);
      }
    });

    buttons[5][2].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(5,2);
      }
    });

    buttons[5][3].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(5,3);
      }
    });

    buttons[5][4].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(5,4);
      }
    });

    buttons[5][5].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(5,5);
      }
    });

    buttons[5][6].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(5,6);
      }
    });

    buttons[5][7].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(5,7);
      }
    });

    buttons[5][8].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(5,8);
      }
    });

    buttons[5][9].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(5,9);
      }
    });

    buttons[5][10].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(5,10);
      }
    });

    buttons[5][11].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(5,11);
      }
    });

    buttons[5][12].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(5,12);
      }
    });

    buttons[5][13].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(5,13);
      }
    });

    buttons[5][14].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(5,14);
      }
    });

    buttons[6][0].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(6,0);
      }
    });

    buttons[6][1].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(6,1);
      }
    });

    buttons[6][2].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(6,2);
      }
    });

    buttons[6][3].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(6,3);
      }
    });

    buttons[6][4].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(6,4);
      }
    });

    buttons[6][5].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(6,5);
      }
    });

    buttons[6][6].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(6,6);
      }
    });

    buttons[6][7].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(6,7);
      }
    });

    buttons[6][8].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(6,8);
      }
    });

    buttons[6][9].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(6,9);
      }
    });

    buttons[6][10].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(6,10);
      }
    });

    buttons[6][11].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(6,11);
      }
    });

    buttons[6][12].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(6,12);
      }
    });

    buttons[6][13].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(6,13);
      }
    });

    buttons[6][14].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(6,14);
      }
    });

    buttons[7][0].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(7,0);
      }
    });

    buttons[7][1].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(7,1);
      }
    });

    buttons[7][2].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(7,2);
      }
    });

    buttons[7][3].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(7,3);
      }
    });

    buttons[7][4].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(7,4);
      }
    });

    buttons[7][5].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(7,5);
      }
    });

    buttons[7][6].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(7,6);
      }
    });

    buttons[7][7].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(7,7);
      }
    });

    buttons[7][8].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(7,8);
      }
    });

    buttons[7][9].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(7,9);
      }
    });

    buttons[7][10].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(7,10);
      }
    });

    buttons[7][11].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(7,11);
      }
    });

    buttons[7][12].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(7,12);
      }
    });

    buttons[7][13].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(7,13);
      }
    });

    buttons[7][14].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(7,14);
      }
    });

    buttons[8][0].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(8,0);
      }
    });

    buttons[8][1].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(8,1);
      }
    });

    buttons[8][2].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(8,2);
      }
    });

    buttons[8][3].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(8,3);
      }
    });

    buttons[8][4].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(8,4);
      }
    });

    buttons[8][5].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(8,5);
      }
    });

    buttons[8][6].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(8,6);
      }
    });

    buttons[8][7].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(8,7);
      }
    });

    buttons[8][8].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(8,8);
      }
    });

    buttons[8][9].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(8,9);
      }
    });

    buttons[8][10].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(8,10);
      }
    });

    buttons[8][11].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(8,11);
      }
    });

    buttons[8][12].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(8,12);
      }
    });

    buttons[8][13].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(8,13);
      }
    });

    buttons[8][14].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(8,14);
      }
    });

    buttons[9][0].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(9,0);
      }
    });

    buttons[9][1].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(9,1);
      }
    });

    buttons[9][2].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(9,2);
      }
    });

    buttons[9][3].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(9,3);
      }
    });

    buttons[9][4].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(9,4);
      }
    });

    buttons[9][5].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(9,5);
      }
    });

    buttons[9][6].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(9,6);
      }
    });

    buttons[9][7].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(9,7);
      }
    });

    buttons[9][8].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(9,8);
      }
    });

    buttons[9][9].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(9,9);
      }
    });

    buttons[9][10].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(9,10);
      }
    });

    buttons[9][11].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(9,11);
      }
    });

    buttons[9][12].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(9,12);
      }
    });

    buttons[9][13].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(9,13);
      }
    });

    buttons[9][14].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(9,14);
      }
    });

    buttons[10][0].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(10,0);
      }
    });

    buttons[10][1].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(10,1);
      }
    });

    buttons[10][2].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(10,2);
      }
    });

    buttons[10][3].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(10,3);
      }
    });

    buttons[10][4].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(10,4);
      }
    });

    buttons[10][5].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(10,5);
      }
    });

    buttons[10][6].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(10,6);
      }
    });

    buttons[10][7].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(10,7);
      }
    });

    buttons[10][8].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(10,8);
      }
    });

    buttons[10][9].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(10,9);
      }
    });

    buttons[10][10].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(10,10);
      }
    });

    buttons[10][11].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(10,11);
      }
    });

    buttons[10][12].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(10,12);
      }
    });

    buttons[10][13].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(10,13);
      }
    });

    buttons[10][14].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(10,14);
      }
    });

    buttons[11][0].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(11,0);
      }
    });

    buttons[11][1].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(11,1);
      }
    });

    buttons[11][2].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(11,2);
      }
    });

    buttons[11][3].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(11,3);
      }
    });

    buttons[11][4].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(11,4);
      }
    });

    buttons[11][5].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(11,5);
      }
    });

    buttons[11][6].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(11,6);
      }
    });

    buttons[11][7].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(11,7);
      }
    });

    buttons[11][8].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(11,8);
      }
    });

    buttons[11][9].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(11,9);
      }
    });

    buttons[11][10].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(11,10);
      }
    });

    buttons[11][11].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(11,11);
      }
    });

    buttons[11][12].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(11,12);
      }
    });

    buttons[11][13].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(11,13);
      }
    });

    buttons[11][14].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(11,14);
      }
    });

    buttons[12][0].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(12,0);
      }
    });

    buttons[12][1].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(12,1);
      }
    });

    buttons[12][2].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(12,2);
      }
    });

    buttons[12][3].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(12,3);
      }
    });

    buttons[12][4].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(12,4);
      }
    });

    buttons[12][5].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(12,5);
      }
    });

    buttons[12][6].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(12,6);
      }
    });

    buttons[12][7].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(12,7);
      }
    });

    buttons[12][8].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(12,8);
      }
    });

    buttons[12][9].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(12,9);
      }
    });

    buttons[12][10].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(12,10);
      }
    });

    buttons[12][11].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(12,11);
      }
    });

    buttons[12][12].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(12,12);
      }
    });

    buttons[12][13].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(12,13);
      }
    });

    buttons[12][14].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(12,14);
      }
    });

    buttons[13][0].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(13,0);
      }
    });

    buttons[13][1].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(13,1);
      }
    });

    buttons[13][2].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(13,2);
      }
    });

    buttons[13][3].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(13,3);
      }
    });

    buttons[13][4].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(13,4);
      }
    });

    buttons[13][5].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(13,5);
      }
    });

    buttons[13][6].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(13,6);
      }
    });

    buttons[13][7].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(13,7);
      }
    });

    buttons[13][8].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(13,8);
      }
    });

    buttons[13][9].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(13,9);
      }
    });

    buttons[13][10].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(13,10);
      }
    });

    buttons[13][11].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(13,11);
      }
    });

    buttons[13][12].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(13,12);
      }
    });

    buttons[13][13].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(13,13);
      }
    });

    buttons[13][14].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(13,14);
      }
    });

    buttons[14][0].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(14,0);
      }
    });

    buttons[14][1].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(14,1);
      }
    });

    buttons[14][2].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(14,2);
      }
    });

    buttons[14][3].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(14,3);
      }
    });

    buttons[14][4].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(14,4);
      }
    });

    buttons[14][5].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(14,5);
      }
    });

    buttons[14][6].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(14,6);
      }
    });

    buttons[14][7].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(14,7);
      }
    });

    buttons[14][8].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(14,8);
      }
    });

    buttons[14][9].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(14,9);
      }
    });

    buttons[14][10].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(14,10);
      }
    });

    buttons[14][11].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(14,11);
      }
    });

    buttons[14][12].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(14,12);
      }
    });

    buttons[14][13].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(14,13);
      }
    });

    buttons[14][14].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event)
      {
        chooseButton(14,14);
      }
    });
  }
}
