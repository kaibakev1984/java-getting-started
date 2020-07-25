package poo.coders;

public class MultipleChoiceParcial implements Comportamiento{
    @Override
    public void correcto(Puntos puntos){
        puntos.incrementar();
    }

    @Override
    public void incorrecto(Puntos puntos){
        puntos.cero();
    }
}
