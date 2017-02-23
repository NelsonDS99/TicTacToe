public class GameInfo
{
private String GameBoard [][] = new String [3][3];
private int RealGameBoard [][] = new int [3][3];
private int broken = 0;
private String winner = " ";
private int check = 0;
private int compare[] = new int [9];
private int tie = 0;
private boolean t;

public void getInstructions()
{
System.out.println("This is the game board");
System.out.println("TL | TM | TR");
System.out.println("-------------");
System.out.println("ML | MM | MR");
System.out.println("-------------");
System.out.println("BL | BM | BR ");
System.out.println("Use the letters displayed on the board to put either an 'X' or 'O' \nPlayer 1 Places the ‘X’  \nPlayer 2 the ‘O’ ");

}
public void setCompare()
{
for(int count = 0;count< 9; count++)
{
 compare[count] = -1;
}
for(int count = 0; count < 3; count++)
{
   for(int count2 = 0; count2 < 3; count2++)
   {
      GameBoard[count][count2] = "";
   }
}
}
public void convertToNumberO(String input)
{
if(input.contains("TL") == true)
{
RealGameBoard[0][0] = 1;
}
else if(input.contains("TM") == true)
{
RealGameBoard[0][1] = 1;
}
else if (input.contains("TR") == true)
{
RealGameBoard[0][2] = 1;
}
else if (input.contains("ML") == true)
{
RealGameBoard[1][0] = 1;
}
else if ( input.contains("MM") == true)
{
RealGameBoard[1][1] = 1;
}
else if (input.contains("MR") == true)
{
RealGameBoard[1][2] = 1;
}
else if (input.contains("BL") == true)
{
RealGameBoard[2][0] = 1;
}
else if(input.contains("BM") == true)
{
RealGameBoard[2][1] = 1;
}
else if(input.contains("BR") == true)
{
RealGameBoard[2][2] = 1;
}
else
{
broken = -1;
}
}

public void convertToNumberX(String input)
{
if(input.contains("TL") == true)
{
RealGameBoard[0][0] = 2;
}
else if(input.contains("TM") == true)
{
RealGameBoard[0][1] = 2;
}
else if (input.contains("TR") == true)
{
RealGameBoard[0][2] = 2;
}
else if (input.contains("ML") == true)
{
RealGameBoard[1][0] = 2;
}
else if ( input.contains("MM") == true)
{
RealGameBoard[1][1] = 2;
}
else if (input.contains("MR") == true)
{
RealGameBoard[1][2] = 2;
}
else if (input.contains("BL") == true)
{
RealGameBoard[2][0] = 2;
}
else if(input.contains("BM") == true)
{
RealGameBoard[2][1] = 2;
}
else if(input.contains("BR") == true)
{
RealGameBoard[2][2] = 2;
}
else
{
broken = -1;
}
}
public int checkMove(String k)
{
broken = 0;
switch(k){
case "TL":
 check = 0;
 break;
case "TM" :
 check = 1;
 break;
case "TR" :
 check = 2;
 break;
case "ML" :
 check = 3;
 break;
case "MM" :
 check = 4;
 break;
case "MR" :
 check = 5;
 break;
case "BL" :
 check = 6;
 break;
case "BM" :
 check = 7;
 break;
case "BR" :
 check = 8;
break;
 default:
 broken = -1;
 break;
}
 for(int counter = 0; counter < 9; counter++)
{
 if(compare[counter] == check)
{
 broken = -1;
}
}
 if(broken != -1)
{
 compare[check] = check;
 broken = 0;
 }
return broken;
}
public void drawBoard()
{
for(int count = 0; count < 3; count++)
{
for (int count2 = 0; count2< 3; count2++)
{
if (RealGameBoard[count][count2] == 2)
{
GameBoard[count][count2] = "X";
}
if(RealGameBoard[count][count2] == 1)
{
GameBoard[count][count2] = "O";
}

}
}
System.out.println(GameBoard[0][0] + " | " + GameBoard[0][1] + " | " + GameBoard[0][2]);
System.out.println("--------");
System.out.println(GameBoard[1][0] + " | " + GameBoard[1][1] + " | " + GameBoard[1][2]);
System.out.println("--------");
System.out.println(GameBoard[2][0] + " | " + GameBoard[2][1] + " | " + GameBoard[2][2]);
System.out.println("\n");
}

public boolean winner()
{

if(RealGameBoard[0][0] == 2 && RealGameBoard[0][1] == 2 && RealGameBoard[0][2] == 2)
{
winner = "X";
return true;
}
else if (RealGameBoard[1][0] == 2 && RealGameBoard[1][1] == 2 && RealGameBoard[1][2] == 2)
{
winner = "X";
return true;
}
else if (RealGameBoard[2][0] == 2 && RealGameBoard[2][1] == 2 && RealGameBoard[2][2] == 2)
{
winner = "X";
return true;
}
else if (RealGameBoard[0][0] == 2 && RealGameBoard[1][1] == 2 && RealGameBoard[2][2] == 2 )
{
winner = "X";
return true;
}
else if (RealGameBoard[2][0] == 2 && RealGameBoard[1][1] == 2 && RealGameBoard[0][2] == 2 )
{
winner = "X";
return true;
}
else if(RealGameBoard[0][0] == 2 && RealGameBoard[1][0] == 2 && RealGameBoard[2][0] == 2){
winner = "X";
return true;
}
else if(RealGameBoard[0][1] == 2 && RealGameBoard[2][1] == 2 && RealGameBoard[1][1] == 2)
{
winner = "X";
return true;
}
else if(RealGameBoard[0][2] == 2 && RealGameBoard[1][2] == 2 && RealGameBoard[2][2] == 2)
{
winner = "X";
return true;
}
// Checks for O Winners
else if(RealGameBoard[0][0] == 1 && RealGameBoard[0][1] == 1 && RealGameBoard[0][2] == 1)
{
winner = "O";
return true;
}
else if (RealGameBoard[1][0] == 1 && RealGameBoard[1][1] == 1 && RealGameBoard[1][2] == 1)
{
winner = "O";
return true;
}
else if (RealGameBoard[2][0] == 1 && RealGameBoard[2][1] == 1 && RealGameBoard[2][2] == 1)
{
winner = "O";
return true;
}
else if (RealGameBoard[0][0] == 1 && RealGameBoard[1][1] == 1 && RealGameBoard[2][2] == 1 )
{
winner = "O";
return true;
}
else if (RealGameBoard[2][0] == 1 && RealGameBoard[1][1] == 1 && RealGameBoard[0][2] == 1 )
{
winner = "O";
return true;
}
else if(RealGameBoard[0][0] == 1 && RealGameBoard[1][0] == 1 && RealGameBoard[2][0] == 1){
winner = "O";
return true;
}
else if(RealGameBoard[0][1] == 1 && RealGameBoard[2][1] == 1 && RealGameBoard[1][1] == 1)
{
winner = "O";
return true;
}
else if(RealGameBoard[0][2] == 1 && RealGameBoard[1][2] == 1 && RealGameBoard[2][2] == 1)
{
winner = "O";
return true;
}
else
{
winner = "none";
}
return false;
}
public String determineWinner()
{
return winner;
}
public boolean tie()
{
   tie = 0;
   for(int count =0; count < 3 ; count ++)
   {
      for( int columns = 0; columns < 3; columns ++)
      {
         tie = tie + RealGameBoard[count][columns]; 
      }
   }
   if (tie >= 14)
   {
      t = true;
}
   else
   {
      t = false;
   }
   return t; 
}
}