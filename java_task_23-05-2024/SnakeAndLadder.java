import java.util.Scanner;

public class SnakeAndLadder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of players : ");
        int playercount = scanner.nextInt();
        scanner.nextLine();
        String playername[] = new String[playercount];
        int playerscore[] = new int[playercount];
        int dice = 0;
        for(int i = 0; i < playercount; i++){
            System.out.print("Enter the Player Number "+(i+1)+" Name : ");
            playername[i] = scanner.nextLine();
        }
       



        int currentplayer = 0;

        while (true) {
            System.out.print("\nPlayer "+(currentplayer+1)+" Turn ("+playername[currentplayer]+") \nPress Enter to roll the dice");
            scanner.nextLine();
            dice = (int)(Math.random()*10)%7;
            playerscore[currentplayer]+=dice;
            System.out.println("Dice Score : "+dice);


            if(playerscore[currentplayer]>100){
                playerscore[currentplayer]-=dice;
                System.out.println("Move is not allowed");
                System.out.println("Player "+(currentplayer+1)+" Score : "+playerscore[currentplayer]);
                continue;
            }



            System.out.println("Player "+(currentplayer+1)+" Score : "+playerscore[currentplayer]);

           
            if(playerscore[currentplayer]==15){
                playerscore[currentplayer]+=10;
                System.out.println(playername[currentplayer]+" got a ladder");
                System.out.println("Updated Player "+(currentplayer+1)+" Score : "+playerscore[currentplayer]+"\n");
            }else if(playerscore[currentplayer]==26){
                playerscore[currentplayer]+=18;
                System.out.println(playername[currentplayer]+" got a ladder");
                System.out.println("Updated Player "+(currentplayer+1)+" Score : "+playerscore[currentplayer]+"\n");
            }else if(playerscore[currentplayer]==34){
                playerscore[currentplayer]+=40;
                System.out.println(playername[currentplayer]+" got a ladder");
                System.out.println("Updated Player "+(currentplayer+1)+" Score : "+playerscore[currentplayer]+"\n");
            }else if(playerscore[currentplayer]==58){
                playerscore[currentplayer]+=30;
                System.out.println(playername[currentplayer]+" got a ladder");
                System.out.println("Updated Player "+(currentplayer+1)+" Score : "+playerscore[currentplayer]+"\n");
            }else if(playerscore[currentplayer]==71){
                playerscore[currentplayer]+=15;
                System.out.println(playername[currentplayer]+" got a ladder");
                System.out.println("Updated Player "+(currentplayer+1)+" Score : "+playerscore[currentplayer]+"\n");
            }else if(playerscore[currentplayer]==85){
                playerscore[currentplayer]+=10;
                System.out.println(playername[currentplayer]+" got a ladder");
                System.out.println("Updated Player "+(currentplayer+1)+" Score : "+playerscore[currentplayer]+"\n");
            }else if(playerscore[currentplayer]==22){
                playerscore[currentplayer]-=10;
                System.out.println(playername[currentplayer]+" got a snake");
                System.out.println("Updated Player "+(currentplayer+1)+" Score : "+playerscore[currentplayer]+"\n");
            }else if(playerscore[currentplayer]==21){
                playerscore[currentplayer]-=9;
                System.out.println(playername[currentplayer]+" got a snake");
                System.out.println("Updated Player "+(currentplayer+1)+" Score : "+playerscore[currentplayer]+"\n");
            }else if(playerscore[currentplayer]==45){
                playerscore[currentplayer]-=21;
                System.out.println(playername[currentplayer]+" got a snake");
                System.out.println("Updated Player "+(currentplayer+1)+" Score : "+playerscore[currentplayer]+"\n");
            }else if(playerscore[currentplayer]==98){
                playerscore[currentplayer]-=90;
                System.out.println(playername[currentplayer]+" got a snake");
                System.out.println("Updated Player "+(currentplayer+1)+" Score : "+playerscore[currentplayer]+"\n");
            }else if(playerscore[currentplayer]==80){
                playerscore[currentplayer]-=40;
                System.out.println(playername[currentplayer]+" got a snake");
                System.out.println("Updated Player "+(currentplayer+1)+" Score : "+playerscore[currentplayer]+"\n");
            }else if(playerscore[currentplayer]==60){
                playerscore[currentplayer]-=21;
                System.out.println(playername[currentplayer]+" got a snake");
                System.out.println("Updated Player "+(currentplayer+1)+" Score : "+playerscore[currentplayer]+"\n");
            }


            if(playerscore[currentplayer]==100){
                System.out.println(playername[currentplayer]+" Won the game");
                break;
            }


            currentplayer++;
            if(currentplayer == playercount){
                currentplayer = 0;
            }
     
            
        }

        scanner.close();
    }

}
