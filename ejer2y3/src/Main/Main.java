package Main;

import Entidades.Lavadora;
import Entidades.Televisor;

public class Main {

    public static void main(String[] args) {
        Lavadora l1 = new Lavadora();

        Televisor t1 =new Televisor();
        
        l1.crearLavadora();
        t1.crearTelevisor();
    }

}
