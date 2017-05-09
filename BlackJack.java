package DeckOfCard;

public class BlackJack extends Card{

	public BlackJack(int faceValue, Suit suit) {
		super(faceValue, suit);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int value() {
		// TODO Auto-generated method stub
		if(isAce())
		{
			return 1;
		}
		
		else if (faceValue >= 11 && faceValue <= 13) { // Face card
            return 10;
		}
            else
		{
			return faceValue;
		}
		
	
	}

	private boolean isAce() {
		// TODO Auto-generated method stub
		return faceValue==1;
	}

}
