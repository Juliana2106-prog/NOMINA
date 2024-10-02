package org.example;

import org.example.Modelos.*;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //EMPLEADO
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado(1l,"pepito","perez", LocalDate.of(2001,6,21),"1001237552",
                "3217271075", "julianaospina2106@gmail.com","medellin","crr66#16b05","secretaria",
                LocalDate.of(2025,4,11),"3127287931","00109336602","soltera" );

        //BENEFICIARIO
        Beneficiario beneficiario1 = new Beneficiario();
        Beneficiario beneficiario2 = new Beneficiario(1l,"juliana", "ospina", LocalDate.of(2024,10,8,"1001236554",
                "3217876534",LocalDate.of(2000,7,24,"casado","pepito.perez21@hotmail.com","ips") )

//SUCURSAL
Sucursal sucursal1 = new Sucursal();
Sucursal sucursal2 = new Sucursal(1l,"nomina","carrera 56 b 54", "3211526787", "sucursal@hotmail.com","marta", LocalDate.of(1999,8,11));

 //AREA
        Area area1 = new Area();
        Area area2 = new Area(1l,"produccion", "guillermo", "32", "area de produccion", "carrea 45 a 56", "12 horas")

 //NOMINA
        Nomina nomina1 = new Nomina();
        Nomina nomina2 = new Nomina(1l, "gerente", "antioquia", 20000000, "12 horas",)







    }
}