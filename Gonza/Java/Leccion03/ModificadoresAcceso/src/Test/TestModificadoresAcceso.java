
package Test;

import paquete1.Clase1;

public class TestModificadoresAcceso {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1();
        System.out.println("clase1 = " + clase1.atributoPublic);
        clase1.metodoPublico();
        clase3 claseHija = new clase3();
        System.out.println("claseHija = " + claseHija);
    }
}
