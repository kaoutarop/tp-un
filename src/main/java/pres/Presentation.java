package pres;


import dao.DaoImpl;
import ext.DaoImpl2;
import metier.metierImpl;


public class Presentation {
    public static void main(String[] args) {
        DaoImpl2 dao=new DaoImpl2();
        metierImpl metier=new metierImpl(dao);
        metier.setDao(dao);
        System.out.println("Resulatst="+metier.calcul());

    }
}
