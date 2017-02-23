import java.util.*;
public class RunGame
{
public static void main(String []args){
Scanner scnr = new Scanner(System.in);
GameInfo tictactoe = new GameInfo();
String input ="";
int count = 0;
tictactoe.setCompare();

while(tictactoe.winner() == false  || tictactoe.tie() == false)
{
   
if(count % 2 == 0)
{
   if(tictactoe.winner() == true)
   {
      break;
   }
   tictactoe.getInstructions();
System.out.println("Player 1 Enter a move");
input = scnr.next();

while(tictactoe.checkMove(input) == -1)
{
System.out.println("Wrong Move, Please Reenter Another Move Player 1" );
input = scnr.next();
}
tictactoe.convertToNumberX(input);
tictactoe.drawBoard();
tictactoe.winner();
count++;
}
else
{
   if(tictactoe.tie() == true)
   {
      break;
   }
   if(tictactoe.winner() == true)
   {
      break;
   }
   tictactoe.getInstructions();
System.out.println("Player 2 Enter a Move");
input = scnr.next();

while(tictactoe.checkMove(input) == -1)
{
System.out.println("Wrong Move, Please Reenter Try Again Player 2" );
input = scnr.next();
}
tictactoe.convertToNumberO(input);
tictactoe.drawBoard();
tictactoe.winner();
count++;
}
}
if(tictactoe.determineWinner() == "X")
{
System.out.println("The Winner of the Game Is Player 1" );
}
else if (tictactoe.determineWinner() == "O")
{
System.out.println("The Winner of the Game is Player 2");
}
else
{
   System.out.println("It's a Tie!");
}
System.out.println("Thank you for Playing");
}
}

