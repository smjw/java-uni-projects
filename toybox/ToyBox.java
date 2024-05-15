
/**
 * Write a description of class ToyBox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ToyBox
{
    private Pinochio[] box;
    private int howMany;

    /**
     * Constructor for objects of class ToyBox
     */
    public ToyBox(int capacity)
    {
        box = new Pinochio[capacity]; //actually construct the array
        howMany = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void addToy(Pinochio doll)
    {
        if (howMany < box.length) {
            box[howMany] = doll;
            howMany++;
        }
        else {
            System.out.println("No more room");
        }
    }
    
    public double averageNoseLength() {
        if (howMany == 0) {
            return 0;
        }
        else {
            int total = 0;
            for (int i = 0; i < howMany; i++) {
                total += box[i].getNoseLength();
            }
            return ((double)total)/howMany; //note the cast
        }
    }
}
