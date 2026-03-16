package com.sena;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        // 1. Crear hamburguesas
        Hamburguesa h1 = new Hamburguesa(
                "Clasica",
                "Pan artesanal",
                "Res",
                true,
                true,
                true,
                true,
                false,
                "Salsa de la casa",
                12000
        );

        Hamburguesa h2 = new Hamburguesa(
                "Doble BBQ",
                "Pan brioche",
                "Res doble",
                true,
                true,
                false,
                true,
                true,
                "BBQ",
                18000
        );

        // 2. Crear hamburguesa con constructor vacío
        Hamburguesa h3 = new Hamburguesa();
        h3.setNombre("Pollo Especial");
        h3.setPan("Pan integral");
        h3.setTipoCarne("Pollo");
        h3.setLechuga(true);
        h3.setTomate(true);
        h3.setCebolla(false);
        h3.setQueso(true);
        h3.setTocineta(false);
        h3.setSalsa("Mostaza y miel");
        h3.setPrecio(15000);

        // 3. Lista de hamburguesas
        ArrayList<Hamburguesa> hamburguesas = new ArrayList<>();

        hamburguesas.add(h1);
        hamburguesas.add(h2);
        hamburguesas.add(h3);

        // 4. Mostrar hamburguesas
        for (Hamburguesa h : hamburguesas) {

            System.out.println(h.describirHamburguesa());

            System.out.println("---------------------------");
        }
    }
}
