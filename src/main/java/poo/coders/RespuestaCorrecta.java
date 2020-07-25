package poo.coders;

public class RespuestaCorrecta implements Respuesta {
    public void aplicarComportamiento(Comportamiento comportamiento, Puntos puntos){
        comportamiento.correcto(puntos);
    }
}
