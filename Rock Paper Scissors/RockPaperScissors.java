public class RockPaperScissors
{
    public static void main (String args[])
    {
	new RockPaperScissors ();
    }

    public RockPaperScissors ()
    {
	int cPoint = 0;
	int uPoint = 0;
	int game = 1;
	char playAgain = 'y';
	System.out.println ("-----Rock, Paper, Scissors------\n");
	while (playAgain == 'y' || playAgain == 'Y')
	{

	    char user = userChoice ();
	    System.out.println ("You have selected " + user);
	    char comp = compChoice ();
	    System.out.println ("The computer has selected " + comp);
	    char win = winner (user, comp);
	    if (win == 'c')
	    {
		cPoint++;
		System.out.println ("\nThe computer wins!");
	    }
	    else if (win == 'u')
	    {
		uPoint++;
		System.out.println ("\nYou win!");

	    }
	    else
		System.out.println ("\nThere is a tie!");
	    System.out.println ("Points: You: " + uPoint + " Computer: " + cPoint);
	    playAgain = IBIO.inputChar ("\nPlay again? (y/n) ");
	    System.out.println ("");
	}
	System.out.println ("Goodbye!");
    }


    public boolean isValid (String c)
    {
	/* All valid data:
	       Rock, ROCK, rock, r, R
	       Paper, PAPER, paper, p, P
	       Scissors, SCISSORS, scissors, s, S
	   return true if valid, false otherwise
	*/
	if (c.equals ("r") || c.equals ("s") || c.equals ("p") || c.equals ("Rock") || c.equals ("ROCK") || c.equals ("rock") || c.equals ("r") || c.equals ("R") || c.equals ("Paper") || c.equals ("PAPER") || c.equals ("paper") || c.equals ("p") || c.equals ("P") || c.equals ("Scissors") || c.equals ("SCISSORS") || c.equals ("scissors") || c.equals ("s") || c.equals ("S"))
	    return false;
	else
	    return true;
    }


    public char userChoice ()
    { //print options: rock, paper, scissors
	System.out.println ("Choices: Rock (r), paper (p), or scissors (s).");
	//ask for user's choice. will need to store in String
	boolean a = true;
	String x = "";
	while (a == true)
	{
	    x = IBIO.inputString ("Which would you like? ");
	    a = isValid (x);
	}
	//Loop: if invalid input, ask again
	//stopping condition is the isValid method!!

	//If: transfer values - Rock, ROCK, rock, r, R - to r, etc.

	//return r, p or s
	if (x.equals ("Rock") || x.equals ("ROCK") || x.equals ("rock") || x.equals ("r") || x.equals ("R"))
	    return 'r';
	else if (x.equals ("Paper") || x.equals ("PAPER") || x.equals ("paper") || x.equals ("p") || x.equals ("P"))
	    return 'p';
	else
	    return 's';
    }


    public char compChoice ()
    { //make a random number between 1 and 3
	int x = (int) (Math.random () * 3);
	//if the number is 1, return r; 2 return s; 3 return p
	if (x == 1)
	    return 'r';
	else if (x == 2)
	    return 's';
	else
	    return 'p';
    }


    public char winner (char comp, char user)
    { //comp and user both hold r, s, p
	//returns c for computer, u for user and b for both
	if (user == 'r' && comp == 'p')
	return 'u';
	else if (user == 'r' && comp == 's')
	return 'c';
	else if (user == 'p' && comp == 'r')
	return 'c';
	else if (user == 'p' && comp == 's')
	return 'u';
	else if (user == 's' && comp == 'r')
	return 'u';
	else if (user == 's' && comp == 'p')
	return 'c';
	else
	return 'b';
    }
}

