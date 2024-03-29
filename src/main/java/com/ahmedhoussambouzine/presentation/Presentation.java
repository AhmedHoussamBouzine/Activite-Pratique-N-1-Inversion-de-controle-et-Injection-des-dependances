package com.ahmedhoussambouzine.presentation;

import com.ahmedhoussambouzine.dao.DaoImpl;
import com.ahmedhoussambouzine.metier.MetierImpl;

public class Presentation {
    public static void main(String[] args) {
        /*
        * Injection de Dependances par instanciation static => new => couplage fort
        *  */
         DaoImpl dao = new DaoImpl();
         MetierImpl metier = new MetierImpl(dao);
         metier.setDao(dao);
         System.out.println("Result : " + metier.calcul());

    }
}
