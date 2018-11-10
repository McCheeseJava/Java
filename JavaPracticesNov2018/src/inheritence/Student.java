
package inheritence;
public class Student extends Person{
    private int[] testScores;

    Student(String firstName, String lastName, int id, int[] testScores) {
        super(firstName, lastName, id);
        this.testScores = testScores;
    }
    
    public char calculate()
    {
        for (int i = 0; i<testScores.length; i++)
            System.out.println(testScores[i]);
        return 'F';
    }
}