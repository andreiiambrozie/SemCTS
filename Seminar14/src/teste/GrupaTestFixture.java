package teste;

import clase.Grupa;
import clase.IStudent;
import clase.Student;
import org.junit.Before;
import org.junit.Test;

public class GrupaTestFixture {
    private Grupa grupa;

    @Before
    public void setup(){
        grupa=new Grupa(1005);
        for(int i=0;i<35;i++){
            IStudent student1=new Student("ION");
            student1.adaugaNota(5);
            student1.adaugaNota(7);
            grupa.adaugaStudent(student1);
        }

        for(int i=0;i<15;i++){
            IStudent student= new Student();
            student.adaugaNota(4);
            student.adaugaNota(5);
            grupa.adaugaStudent(student);
        }
    }

    @Test(timeout = 500)
    public void testGetPromovabilitatePerformance(){

        grupa.getPromovabilitate();
    }
}
