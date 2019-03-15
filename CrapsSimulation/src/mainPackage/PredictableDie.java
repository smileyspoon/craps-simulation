package mainPackage;

public class PredictableDie extends Die
{
	
	private int [] predictableNumber;
	private int count=0;
	
	public PredictableDie (int [] predictableNumber) {
		
		this.predictableNumber = predictableNumber;
		
	}
	
	public void roll() // note how this changes Die's state, but doesn't return anything
	{
		
		super.setLastRoll(this.predictableNumber[count]);
		count++;

	}
	

}
