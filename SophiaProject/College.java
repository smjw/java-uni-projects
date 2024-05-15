import java.util.*;

/**
 * This class represents a college that runs the students use of 
 * the library and the textbooks.
 *
 * @author Sophia Williams
 * @version 1.0
 */
public class College
{
    private Student[] listStudents;
    private Library collegeLib;
    private Random randomiser;
    
    /**
     * Constructor for objects of class College
     */
    public College()
    {
        collegeLib = new Library(10,book);
        listStudents = new Student[5];
        for (int i = 0; i < listStudents.length; i++ ) {
            String name = "student" + i;
            listStudents[i] = new Student(name, collegeLib);
        }
        randomiser = new Random();
    }

    /**
     * Prints a description of the state of the College
     *
     * @return    printed message
     */
    public void describe()
    {
        System.out.println("The college has "+listStudents.length+"hardworking students");
        Library.describe();
    }
    
    /**
     * Method for internal use that either declares no one is 
     * at the college or makes a student present study
     * 
     * @return prints message
     */
    private void nextStep()
    {
       if (listStudents.length==0){
           System.out.println("Everything has gone quiet");
       } else {
           String randStudent = listStudents.get(randomiser.nextInt(listStudents.length));
           TextBook.study();
       }
    }
    
    /**
     * method that makes the nextStep method happen a determined
     * number of times and invokes the describe() method
     * 
     * @param nSteps is the number of times the run actions
     * @return printed message
     */
    public void runCollege(int nSteps)
    {
        for (int n =1; n<=nSteps; n++){
            System.out.println("Step "+ n);
            describe();
            nextStep();
        }        
    }
    
    /**
     * method to make the project stand-alone 
     * 
     * @param takes a string to use for the parameters of the class
     * @return makes class
     */
    public static void main(String[] args)
    {
        College c1 = new College(10,15,50);
    }
}
