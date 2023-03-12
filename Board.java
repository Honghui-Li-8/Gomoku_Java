import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math;
import java.util.ArrayList;


public class Board
{
  public boolean p1Turn;
  public boolean noWinner;
  public int path;
  private int winner;
  private int size;
  private int[][] board;
  public int[][] tBoard;

  public Board()
  {
    p1Turn = true;
    noWinner = true;
    size = 15;
    board = new int[size][size];
    for(int i= 0;i<size;i++)
      for(int j=0;j<size;j++)
        board[i][j] = 0;
    tBoard =  new int[size][size];
    for(int i=0;i<size;i++)
      for(int j=0;j<size;j++)
        tBoard[i][j] = 0;
  }

  public void choose(int x, int y, JFrame f)
  {
    if(noWinner && tBoard[x][y] == 3)
      confirm(x,y,f);

    copy(tBoard, board);

    if(noWinner && tBoard[x][y] == 0)
      tBoard[x][y]=3;
  }

  public void confirm(int x, int y, JFrame f)
  {
    if(p1Turn)
    {
      board[x][y]=1;
      tBoard[x][y]=1;
    }
    else
    {
      board[x][y]=2;
      tBoard[x][y]=2;
    }

    p1Turn = !p1Turn;
  }

  public boolean checkWin(int x, int y)
  {
    if(board[x][y] == 0)
      return false;

    if(checkPath1(x,y))
      path =1;
    else if(checkPath2(x,y))
      path = 2;
    else if(checkPath3(x,y))
      path = 3;
    else if(checkPath4(x,y))
      path = 4;
    else
      return false;

    winner = board[x][y];
    markResult(getResult(x,y));

    return true;
  }

  public boolean checkPath1(int x, int y)
  {
    int count = 0;
    int cX = x;
    int cY = y;
    int n = board[x][y];

    while(cX>0 && board[cX-1][cY] == n)
    {
      count++;
      cX--;
    }

    cX = x;
    cY = y;

    while(cX<size-1 && board[cX+1][cY] == n)
    {
      count++;
      cX++;
    }

    return count >=4;
  }

  public boolean checkPath2(int x, int y)
  {
    int count = 0;
    int cX = x;
    int cY = y;
    int n = board[x][y];

    while(cY>0 && board[cX][cY-1] == n)
    {
      count++;
      cY--;
    }

    cX = x;
    cY = y;

    while(cY<size-1 && board[cX][cY+1] == n)
    {
      count++;
      cY++;
    }

    return count >=4;
  }

  public boolean checkPath3(int x, int y)
  {
    int count = 0;
    int cX = x;
    int cY = y;
    int n = board[x][y];

    while(cX>0 && cY>0 && board[cX-1][cY-1] == n)
    {
      count++;
      cX--;
      cY--;
    }

    cX = x;
    cY = y;

    while(cX <size-1 && cY<size-1 && board[cX+1][cY+1] == n)
    {
      count++;
      cX++;
      cY++;
    }

    return count >=4;
  }

  public boolean checkPath4(int x, int y)
  {
    int count = 0;
    int cX = x;
    int cY = y;
    int n = board[x][y];

    while(cX<size-1 && cY>0 && board[cX+1][cY-1] == n)
    {
      count++;
      cX++;
      cY--;
    }

    cX = x;
    cY = y;

    while(cX>0 && cY<size-1 && board[cX-1][cY+1] == n)
    {
      count++;
      cX--;
      cY++;
    }

    return count >=4;
  }

  public ArrayList<int[]> getResult(int x, int y)
  {
    ArrayList<int[]> result = new ArrayList<int[]>();
    int cX =x;
    int cY =y;
    int n = board[x][y];

    int[] b = {cX,cY};
    result.add(0,b);

    if(path == 1)
    {
      while(cX>0 && board[cX-1][cY] == n)
      {
        cX--;
        int[] t = {cX,cY};
        result.add(0,t);
      }

      cX = x;
      cY = y;

      while(cX<size-1 && board[cX+1][cY] == n)
      {
        cX++;
        int[] t = {cX,cY};
        result.add(t);
      }
    }

    if(path == 2)
    {
      while(cY>0 && board[cX][cY-1] == n)
      {
        cY--;
        int[] t = {cX,cY};
        result.add(0,t);
      }

      cX = x;
      cY = y;

      while(cY<size-1 && board[cX][cY+1] == n)
      {
        cY++;
        int[] t = {cX,cY};
        result.add(t);
      }
    }

    if(path == 3)
    {
      while(cX>0 && cY>0 && board[cX-1][cY-1] == n)
      {
        cX--;
        cY--;
        int[] t = {cX,cY};
        result.add(0,t);
      }

      cX = x;
      cY = y;

      while(cX <size-1 && cY<size-1 && board[cX+1][cY+1] == n)
      {
        cX++;
        cY++;
        int[] t = {cX,cY};
        result.add(t);
      }
    }

    if(path == 4)
    {
      while(cX<size-1 && cY>0 && board[cX+1][cY-1] == n)
      {
        cX++;
        cY--;
        int[] t = {cX,cY};
        result.add(0,t);
      }

      cX = x;
      cY = y;

      while(cX>0 && cY<size-1 && board[cX-1][cY+1] == n)
      {
        cX--;
        cY++;
        int[] t = {cX,cY};
        result.add(t);
      }
    }

    return result;

  }

  public void markResult(ArrayList<int[]> result)
  {
    int icon = winner*10+path;

    for(int i=0;i<result.size();i++)
      board[result.get(i)[0]][result.get(i)[1]] = icon;
  }

  public void copy(int[][] copy, int[][] beenCopy)
  {
    for(int i=0;i<size;i++)
      for(int j=0;j<size;j++)
        copy[i][j] = beenCopy[i][j];
  }


}
