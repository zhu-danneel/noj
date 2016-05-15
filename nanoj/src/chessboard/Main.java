package chessboard;

import java.util.*;
  
public class Main {
	public static void main(String[] args) {
		//传入一系列的参数
		Scanner in = new Scanner(System.in);
	    int tr=0,tc=0;
	    System.out.println("please input the size of the board:");
	    int size = in.nextInt();
	    System.out.println("please input the  lacation of the special one:");
	    int dr = in.nextInt();
	    int dc = in.nextInt();
	    in.close();
	    int[][] board1= new int[size][size];
	    //调用函数处理并输出相应的结果
	    ChessBoard a = new ChessBoard(board1);
	    a.chessBoard(tr,tc,dr,dc,size);
	    a.show(size);
	}
 }
	  
	
class ChessBoard {
	int[][] board; 
	public  ChessBoard(int board1[][])
	{
		board = board1;
	}
	public  int number = 1;
	public  void chessBoard (int tr,int tc,int dr,int dc,int size) {
	 if(size == 1) return;
	 int t = number++ ;
	 int s = size/2;
	 if(dr<tr+s && dc<tc+s){
		  chessBoard(tr,tc,dr,dc,s);
	  }
	  else {
		  board[tr+s-1][tc+s-1] = t;
	      chessBoard(tr,tc,tr+s-1,tc+s-1,s);
	  }
	  if(dr<tr+s && dc>=tc+s){
		  chessBoard(tr,tc+s,dr,dc,s);
	   }else {
		   board[tr+s-1][tc+s] = t;
		   chessBoard(tr,tc+s,tr+s-1,tc+s,s);
	   }
	   if(dr>=tr+s && dc<tc+s) {
		   chessBoard(tr+s,tc,dr,dc,s);
	   }
	   else {
		   board[tr+s][tc+s-1] = t;
		   chessBoard(tr+s,tc,tr+s,tc+s-1,s);
	   }
	   if(dr>=tr+s && dc>=tc+s) {
		   chessBoard(tr+s,tc+s,dr,dc,s);
	   }
	   else {
		   board[tr+s][tc+s] = t;
		   chessBoard(tr+s,tc+s,tr+s,tc+s,s);
	  }
   }
	  
	  public  void show(int size) {
		  for(int i=0;i<size;i++){
			  for(int j=0;j<size;j++) {
				  System.out.print(" "+board[i][j]);
			  }
			  System.out.println();
		  }
	  	}
	}




