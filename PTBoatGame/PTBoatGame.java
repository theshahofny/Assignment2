package com.tiy.PTBoatGame;


public class PTBoatGame {

private PTBoat[] ptBoats = new PTBoat[6];
private int numberOfBoats = 0;

public PTBoatGame() {}

public void addBoat(String row, int column)
{
   ptBoats[numberOfBoats] = new PTBoat(row, column);
   numberOfBoats++;
}

public void guess(String row, int column)
{
	int x = 0;
	for(int i = 0; i < ptBoats.length; i++)
		if (ptBoats[i].isHit(row, column))
			x = 1;
	
	if( x == 1)
		System.out.println("Hit");
	else System.out.println("Miss");
		

}


public static void main(String[] args)
{
   PTBoatGame ptBG = new PTBoatGame();
   ptBG.addBoat("0", 3);
   ptBG.addBoat("1", 2);
   ptBG.addBoat("3", 6);
   ptBG.addBoat("2", 1);
   ptBG.addBoat("7",7);
   ptBG.addBoat("6", 5);

    ptBG.guess("1", 2);
    ptBG.guess("4",6);
    ptBG.guess("8", 9);
    // If the guess missed all boats
    // Guess number # missed

}

}
