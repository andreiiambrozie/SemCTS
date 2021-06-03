package teste;

import clase.Grupa;
import clase.IStudent;
import clase.Student;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import teste.categorii.ConstructorGrupaCategory;
import teste.categorii.GetPromovabilitateCategory;
import teste.categorii.TesteUrgente;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GrupaTest {
    @Test
    @Category(ConstructorGrupaCategory.class)
    public void testConstructorGrupaCorrect(){
        Grupa grupa=new Grupa(1081);
        assertEquals(1081,grupa.getNrGrupa());
    }


    @Test
    @Category(ConstructorGrupaCategory.class)
    public void testExistaListaConstructor(){
        Grupa grupa=new Grupa(1081);
        assertNotNull(grupa.getStudenti());
    }

    @Test
    @Category(ConstructorGrupaCategory.class)

    public void constructorLimitaStanga(){
        Grupa grupa=new Grupa(1000);
        assertEquals(1000,grupa.getNrGrupa());
    }

    @Test
    @Category(ConstructorGrupaCategory.class)

    public void constructorLimitaDreapta(){
        Grupa grupa=new Grupa(1100);
        assertEquals(1100,grupa.getNrGrupa());
    }

    @Test(expected = IllegalArgumentException.class)
    @Category(ConstructorGrupaCategory.class)
    public void testExceptieConstructorInferior(){
        Grupa grupa=new Grupa(900);
    }


    @Test(expected = IllegalArgumentException.class)
    @Category(ConstructorGrupaCategory.class)

    public void testExceptieConstructorSuperior(){
        Grupa grupa=new Grupa(1200);
    }

    @Test(timeout = 500)
    @Category(ConstructorGrupaCategory.class)
    public void testPerformanceConstructor(){
        Grupa grupa=new Grupa(1005);
    }

    @Test
    @Category(GetPromovabilitateCategory.class)
    public void testGetPromovabilitateRight(){
        Grupa grupa=new Grupa(1005);
        for(int i=0;i<4;i++){
            IStudent student1=new Student("ION");
            student1.adaugaNota(5);
            student1.adaugaNota(7);
            grupa.adaugaStudent(student1);
        }
        for(int i=0;i<6;i++){
            IStudent student1=new Student("ION");
            student1.adaugaNota(4);
            student1.adaugaNota(7);
            grupa.adaugaStudent(student1);
        }

        assertEquals(0.4,grupa.getPromovabilitate(),0.01);
    }

    @Test
    @Category(GetPromovabilitateCategory.class)

    public void testGetPromovabilitateLimitaInferioara(){
        Grupa grupa=new Grupa(1005);
        for(int i=0;i<4;i++){
            IStudent student1=new Student("ION");
            student1.adaugaNota(3);
            student1.adaugaNota(7);
            grupa.adaugaStudent(student1);
        }
        assertEquals(0,grupa.getPromovabilitate(),0.01);
    }

    @Test
    @Category({GetPromovabilitateCategory.class, TesteUrgente.class})

    public void testGetPromovabilitateLimitaSuperioara(){
        Grupa grupa=new Grupa(1005);
        for(int i=0;i<4;i++){
            IStudent student1=new Student("ION");
            student1.adaugaNota(5);
            student1.adaugaNota(7);
            grupa.adaugaStudent(student1);
        }
        assertEquals(1,grupa.getPromovabilitate(),0.01);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    @Category(GetPromovabilitateCategory.class)
    public  void testGetPromovabiliateErrorCondition(){
        Grupa grupa=new Grupa(1061);
        grupa.getPromovabilitate();
    }

    @Test
    @Category(GetPromovabilitateCategory.class)

    public void testCardinality1Student(){
        Grupa grupa=new Grupa(1050);

        IStudent student=new Student();
        student.adaugaNota(9);
        student.adaugaNota(10);

        grupa.adaugaStudent(student);

        assertEquals(1,grupa.getPromovabilitate(),0.01);
    }
}
