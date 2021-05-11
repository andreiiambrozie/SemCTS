import clase.Decorator.*;
import clase.adapter.Medicament;
import clase.adapter.MedicamentAdapter;
import clase.facade.Facade;
import clase.facade.Pat;
import clase.factoryMethod.FactoryAsistent;
import clase.factoryMethod.FactoryInfirmier;
import clase.factoryMethod.PersonalSpital;
import clase.adapter.iMedicamentFaraReteta;
import clase.prototype.Reteta;
import clase.simpleFactory.SimpleFactory;
import clase.simpleFactory.TipPersonal;
import clase.builder.Pacient;
import clase.builder.PacientBuilder;

public class Main {

    public static void main(String[] args) {
//1
        Pacient pacient;
        PacientBuilder pacientBuilder=new PacientBuilder("Amb");

        pacientBuilder.addMicDejunInclus(true);
        pacientBuilder.addPatRabatabil(true);

        pacient=pacientBuilder.build();

        pacientBuilder.addPapuci(true).addHalat(true).addPatRabatabil(false);

        Pacient pacient1=pacientBuilder.build();

        System.out.println(pacient);
        System.out.println(pacient1);
        //////2

        SimpleFactory simpleFactory=new SimpleFactory();

        PersonalSpital asistent=simpleFactory.crearePersonal(TipPersonal.Asistent,"kota");
        PersonalSpital medic=simpleFactory.crearePersonal(TipPersonal.Medic,"Amb");

        System.out.println(asistent);
        System.out.println(medic);

        //3

        FactoryAsistent factoryAsistent=new FactoryAsistent();
        PersonalSpital n=factoryAsistent.getPersonal("nutu");
        PersonalSpital m=factoryAsistent.getPersonal("bbb");
        PersonalSpital q=new FactoryInfirmier().getPersonal("aaa");
        System.out.println(n);
        System.out.println(m);
        System.out.println(q);


        //4

        Reteta reteta=new Reteta("Nurofen",20);

        Reteta retetaNoua= (Reteta) reteta.copiaza();

        System.out.println(reteta);
        System.out.println(retetaNoua);

        //5

        Medicament medicament=new Medicament("Heroina");

        medicament.achizitioneazaMedicament();

        iMedicamentFaraReteta adaptor=new MedicamentAdapter(medicament);

        adaptor.cumparaMedicament();

        //6
        //ne cream paturi

        Pat pat1=new Pat(true);
        Pat pat2=new Pat(false);

        if(Facade.internarePacient(pacient)){
            System.out.println("Pacientul a fost internat");
        }else
            System.out.println("Pacientul nu a fost internat");

        //7

        Rezultat rezultat=new Rezultat("Ambrozie",10);

        DecoratorAbstract decoratorOnline=new DecoratorOnline(rezultat);
        decoratorOnline.afisareRezultatDiferit();

        DecoratorAbstract decoratorPrintatFizic=new DecoratorPrintatFizic(new Rezultat("Ion",7));
        decoratorPrintatFizic.afisareRezultatDiferit();
    }
}
