package tests;

import clase.Student;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testConstructorCuUnParametru(){
        String nume="Amb";
        Student student=new Student(nume);

        assertEquals(nume,student.getNume());

        assertNotNull(student.getNote());
    }

    @Test
    public void testAlocareSpatiuNote(){
        Student student=new Student();
        assertNotEquals(null,student.getNote());
        assertNotEquals(null,student.getNume());


    }

    @Test
    public void testAdaugareNota(){
        Student student=new Student();
        int nota=5;
        student.adaugaNota(nota);

        assertEquals(nota,student.getNota(0));
    }

    @Test
    public void testDimensiuneAdaugareNota(){
        Student student=new Student();
        student.adaugaNota(5);

        student.adaugaNota(7);

        assertEquals(2,student.getNote().size());
    }

    @Test
    public void testCalculeazaMedie(){
        Student student=new Student();
        student.adaugaNota(5);
        student.adaugaNota(8);
        student.adaugaNota(7);

        assertEquals(6.6,student.calculeazaMedie(),0.1);
    }
    @Test
    public void testCalcMedieFaraNote(){
        Student student=new Student();
        assertEquals(0,student.calculeazaMedie(),0.1);
    }

    @Test
    public void testCalcMedieSinguraNota(){
        Student student=new Student();
        student.adaugaNota(6);
        assertEquals(6,student.calculeazaMedie(),0.1);
    }

    @Test
    public void testAreRestante(){
        Student student=new Student();
        student.adaugaNota(7);
        student.adaugaNota(3);
        student.adaugaNota(5);

        assertTrue(student.areRestante());
    }

    @Test
    public void testNuAreRestante(){
        Student student=new Student();
        student.adaugaNota(5);
        student.adaugaNota(6);
        assertFalse(student.areRestante());
    }
}