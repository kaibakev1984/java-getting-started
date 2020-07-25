package poo.coders;

public class VoFClasico implements Comportamiento {
    @Override
    public void correcto(Puntos puntos){
        puntos.uno();
    }

    @Override
    public void incorrecto(Puntos puntos){
        puntos.anular();
    }
}
