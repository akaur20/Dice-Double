/*
 * Avleen Kaur Period 7
 */
public class DiceMain 
{

	public static void main(String[] args) 
	{
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		
		int diceOne = dice1.roll();
		int diceTwo = dice2.roll();
		int sum = diceOne + diceTwo;
		System.out.println("Dice One's Roll: " + diceOne);
		System.out.println("Dice Two's Roll: " + diceTwo);
		System.out.println("Sum of Two Die: " + sum);
		
		while (diceOne != diceTwo)
		{
			diceOne = dice1.roll();
			diceTwo = dice2.roll();
			sum = diceOne + diceTwo;
			System.out.println("Dice One's Roll: " + diceOne);
			System.out.println("Dice Two's Roll: " + diceTwo);
			System.out.println("Sum of Two Die: " + sum);
		}
		
		System.out.print("It took " + dice1.getRoll() + " rolls to get doubles.");
	} 

}
