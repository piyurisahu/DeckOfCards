package DeckOfCard;

public abstract class Card 
{
	private boolean available=true;
	
	protected int faceValue;
	protected Suit suit;
	public Card(int faceValue, Suit suit) {
		super();
		this.faceValue = faceValue;
		this.suit = suit;
	}
	
	//value will be calculated according role
	public abstract int value();

	public boolean isAvailable() {
		return available;
	}

	public void markUnavailable()
	{
		this.available=false;
	}
	
	public void markAvailable()
	{
		this.available=true;
	}

	public Suit getSuit() {
		return suit;
	}

	
	
	
	
	
	
	
	
	

}
