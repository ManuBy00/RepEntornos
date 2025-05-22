package FX;

public class Pila {
    int numPila;

    public boolean estaVacia(){
        return numPila==0;
    }

    public void apilar(int numero){
        numPila += numero;
    }

    public void desapilar(int numero){
        if (numero>numPila) {
            throw new Subdesbordamiento("Pila desbordada");
        }
        numPila -= numero;
    }
}

