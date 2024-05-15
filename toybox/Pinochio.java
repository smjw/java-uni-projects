
/**
 * Write a description of class Pinochio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pinochio
{
	private int noseLength; 
	private int age;

	/**
	 * Constructor for objects of class Pinochio
	 */
	public Pinochio(int age)
	{
		this.age = age;
		noseLength = 2;
	}

	/**
	 * An example of a method - replace this comment with your own
	 * 
	 * @param  y   a sample parameter for a method
	 * @return     the sum of x and y 
	 */
	public void birthday()
	{
		age += 1;
	}
	
	public int getAge() {
	    if (age < 30) {
	        return age;
	    }
	    else { //lies about age, but nose grows
	        noseLength += 1;
	        return 29;
	    }
	}
	
	public int getNoseLength() {
	    return noseLength;
	}
}
