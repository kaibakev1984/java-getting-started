package poo.coders;

public class RespuestaIncorrecta implements Respuesta {
    @Override
    public void aplicarComportamiento(Comportamiento comportamiento, Puntos puntos){
        comportamiento.incorrecto(puntos);
    }
}
