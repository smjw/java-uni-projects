import java.util.*;

/**
 * Objects in Student class represent students. The students can
 * then interact with the Library or the TextBook objects
 *
 * @author Sophia Williams
 * @version 1.0
 */
public class Student
{
    private String studentName;
    private Library studentLibrary;
    private LibraryCard studentLibCard;
    private TextBook currentTextbook;

    /**
     * Constructor for objects of class Student
     */
    public Student(String name, Library library)
    {
        studentName = name;
        studentLibrary = library;
        LibraryCard studentLibCard = new LibraryCard(5, 5);
        currentTextbook = null;
    }

    /**
     * Boolean to check if the student has finished their studies
     *
     * @return    true or false
     */
    public boolean finishedStudies()
    {
        return currentTextbook==null; //& LibraryCard.expired();
    }

    /**
     * Method that causes the student to study. It has different
     * affects depending on what the student needs to do.
     *
     */
    public void study()
    {
        if (currentTextbook == null){
            currentTextbook = Library.nextAvailable;
        } else if (currentTextbook.isFinished()==false){
            TextBook.readNextChapter();
        }   else if (currentTextbook.isFinished()==true){
            TextBook.closeBook();
            currentTextbook = null;
        }
    }

    /**
     * Method to print messages about the student like where
     * they are up to in their book eg
     *
     * @return  printed message about student
     */
    public void describe()
    {
        System.out.println("Student has book" + currentTextbook);
        System.out.println(TextBook.describe());
        System.out.println(LibraryCard.describe());
    }
}
