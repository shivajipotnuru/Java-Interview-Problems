public class Item {

	private int key ;

	public Item ( int key ) {
		this . key = key ;
	}

	public int compare ( Item it ) {

		Item item = it ;

		if ( this . key < item . key )
			return -1;

		else if ( this . key > item . key )
			return 1;

		return 0;
	}

	public int getKey () {
		return key ;
	}
}