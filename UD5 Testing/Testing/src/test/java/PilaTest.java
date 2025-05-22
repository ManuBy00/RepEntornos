import FX.Pila;
import FX.Subdesbordamiento;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PilaTest {
Pila pila;

    @BeforeEach
    void iniciarPila(){
         pila = new Pila();
    }

    @Test
    void pilavacia() {
        assertTrue(pila.estaVacia());
    }

    @Test
    void alDesapilarLaPilaVacia_devuelveExcepcionSubdesbordamiento(){
        assertThrows(Subdesbordamiento.class, () -> {
            pila.desapilar(5);
        });
    }


    @Test
    void alApilarYDesaapilar_LapilaEstaVacia(){
        pila.apilar(9);
        pila.desapilar(9);
        assertTrue(pila.estaVacia());
    }

    @Test
    void alApilarDosVecesYDesapilarLaPilaNoEstaVacia(){
        pila.apilar(1);
        pila.apilar(1);
        pila.desapilar(1);
        assertFalse(pila.estaVacia());
    }






}