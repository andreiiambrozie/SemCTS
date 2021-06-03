package teste;

import clase.Grupa;
import clase.IStudent;
import clase.Student;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import teste.mocks.DummyStudent;
import teste.mocks.FakeStudent;
import teste.mocks.StubStudent;

import static org.junit.Assert.assertEquals;

public class GrupaMockTest {
    @Test
    public void testAdaugaStudent(){
        IStudent student=new DummyStudent();
        Grupa grupa = new Grupa(1081);
        grupa.adaugaStudent(student);
        assertEquals("Adaugare student",1, grupa.getStudenti().size());
    }

    @Test
    public void testGetPromovareStub(){
        IStudent student=new StubStudent();
        Grupa grupa=new Grupa(1081);
        grupa.adaugaStudent(student);

        assertEquals(1,grupa.getPromovabilitate(),0.001);
    }

    @Test
    public void testGetPromovabilitateFakeStud()
    {
        Grupa grupa=new Grupa(1081);
        for(int i=0;i<8;i++){
            FakeStudent student=new FakeStudent();
            student.setAreRestante(false);
            grupa.adaugaStudent(student);
        }

        for(int i=0;i<2;i++){
            FakeStudent student=new FakeStudent();
            student.setAreRestante(true);
            grupa.adaugaStudent(student);
        }

        assertEquals(0.8f,grupa.getPromovabilitate(),0.01);
    }
}
