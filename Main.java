import clase.Decorator.*;
import clase.adapter.Medicament;
import clase.adapter.MedicamentAdapter;
import clase.adapter.RetetaMedicament;
import clase.command.*;
import clase.composite.Departament;
import clase.composite.Sectie;
import clase.composite.Spital;
import clase.composite.SubDepartament;
import clase.facade.Facade;
import clase.facade.Pat;
import clase.factoryMethod.FactoryAsistent;
import clase.factoryMethod.FactoryInfirmier;
import clase.factoryMethod.PersonalSpital;
import clase.adapter.iMedicamentFaraReteta;
import clase.flyweight.Flyweight;
import clase.flyweight.FlyweightFactory;
import clase.flyweight.Internare;
import clase.prototype.Reteta;
import clase.proxy.ProxyInternare;
import clase.simpleFactory.SimpleFactory;
import clase.simpleFactory.TipPersonal;
import clase.Pacient;
import clase.builder.PacientBuilder;
import clase.strategy.PlataCard;

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

        RetetaMedicament retetaMedicament=new RetetaMedicament(10,true);
        RetetaMedicament retetaMedicament1=new RetetaMedicament(7,false);

        Medicament medicament=new Medicament("Heroina");

        medicament.achizitioneazaMedicament(retetaMedicament);
        medicament.achizitioneazaMedicament(retetaMedicament1);

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


        //8---- gresit!!

        Sectie sectie=new Sectie("Sectie1");
        SubDepartament sb1=new SubDepartament("Sb1");

        Departament dep=new Departament("Dep1");
        Departament dep2=new Departament("Dep2");

        SubDepartament sb2=new SubDepartament("sb2");

        Spital spital=new Spital();
        spital.addNod(dep);
        dep.addNod(sb2);
        spital.addNod(dep2);
        dep2.addNod(sb1);
        dep2.addNod(sectie);



        spital.descrie();

        //9
        pacient.setAreAsigurare(true);
        ProxyInternare proxyInternare=new ProxyInternare(pacient);
        proxyInternare.internareCuAsigurare(pacient);
        proxyInternare.internareCuAsigurare(pacient1);

        //10
        Internare internare=new Internare("22",1,10);
        FlyweightFactory flyweightFactory=new FlyweightFactory();
        Pacient pacient2=new Pacient("vecinu","2222","ltilie");

        Flyweight pacientInternat=flyweightFactory.getFlyweight("0000");
        Flyweight pacientInternat2=flyweightFactory.getFlyweight("11111");
        Flyweight pacientInternat3=flyweightFactory.getFlyweight("2222");
        pacientInternat.afisareInternare(internare);
        pacientInternat.afisareInternare(internare);
        pacientInternat3.afisareInternare(internare);

        //11
        pacient.platesteInternare();
        pacient.setTipDePlata(new PlataCard());
        pacient.platesteInternare();


        //12 memento?

        //13 State
        pacient.setStareInternat();
        pacient.setStareSubObsv();
        pacient.setStareExternat();

        //14 template ??


        //15
        Medic medic1=new Medic("Ambrozie");
        Comanda cInternare=new ComandaInternare(medic1);
        Comanda cTratare=new ComandTratare((Medic) medic);
        Comanda cInternare2=new ComandaInternare(medic1);

        Operator operator=new Operator(); //manageriaza comenzile trimise

        operator.addComanda(cTratare);
        operator.addComanda(cInternare);
        operator.addComanda(cInternare2);

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
    }
}
