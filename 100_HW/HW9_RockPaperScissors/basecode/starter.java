/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    public starter() {

    }
    public int getObject() {
        int randomChoice = (int)(Math.random()*3)+1;
        return randomChoice;
    } 
    public int compare2(int Player1compvalue, int Player2compvalue){
        if(Player1compvalue == Player2compvalue){
        return 0;

    }else if(Player1compvalue==1){
        if(Player2compvalue == 1){
           return 0;
        }else if(Player2compvalue == 2){
            return 2;
        }else{
            return 1;
        }
    }
   


    else if(Player1compvalue==2){
        if(Player2compvalue == 1){
            return 1;
        }else if(Player2compvalue == 2){
            return 0;
        }else{
            return 2;
        }
    }
   

  else if(Player1compvalue==3){
        if(Player2compvalue == 2){
            return 1;
        }else if(Player2compvalue == 3){
            return 0;
        }else{
            return 2;
        }
    }
return -1;
    }
    public static void main(String[] args) {

       starter st = new starter();
       Scanner sc = new Scanner(System.in);
System.out.println("Would you like to play the computer? (yes/no/done)");
String play = sc.nextLine();
String choice = null;

 int counter = 0;
   int Player1wins = 0;
   int Player2wins = 0;
   int bothties = 0;
   int Player1compvalue=0;
   int Player2compvalue = 0;

int compvalue = (int)(Math.random()*3)+1; // 1 is rock 2 is paper 3 is scissors
   if(play.equals("yes")){

    System.out.println("Please enter rock/paper/scissors: ");
 choice = sc.nextLine();
 System.out.println("computer says (is rock 2 is paper 3 is scissors)  " + compvalue);

    if(choice.equals("rock")){
        if(compvalue == 1){
            System.out.println("You tied!");
        }else if(compvalue == 2){
            System.out.println("You lost! :(");
        }else{
            System.out.println("You won!!!");
        }
    }
   


    else if(choice.equals("paper")){
        if(compvalue == 1){
            System.out.println("You won!!!");
        }else if(compvalue == 2){
            System.out.println("You tied!");
        }else{
            System.out.println("You lost :(");
        }
    }
   

  else if(choice.equals("scissors")){
        if(compvalue == 2){
            System.out.println("You won!!!");
        }else if(compvalue == 3){
            System.out.println("You tied!");
        }else{
            System.out.println("You lost :(");
        }
    }
   }
else if(play.equals("no")){
    System.out.println("How many times would you like the computer to play itself?");
   int times = sc.nextInt();
  
   while (counter < times){
    Player1compvalue = st.getObject(); //(int)(Math.random()*3)+1; 
    Player2compvalue = st.getObject(); //(int)(Math.random()*3)+1;
    int output = st.compare2(Player1compvalue,Player2compvalue);
    if(output == 0)  {
        bothties++;
    }
    else if(output == 1){
        Player1wins++;
    }
    else if(output == 2) {
        Player2wins++;
    }

        counter++;
   }
    System.out.println("times"+times);
   System.out.println("Player 1 wins: " + Player1wins);
   System.out.println("Player 2 wins: " + Player2wins);
   System.out.println("Ties " + bothties);
    }else if(play.equals("done")){
        System.out.println("Thanks for playing!");
    }
    
    }
   }





