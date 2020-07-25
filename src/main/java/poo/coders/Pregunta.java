package poo.coders;

import java.util.List;

public class Pregunta {
    Comportamiento comportamiento;
    public Pregunta(Comportamiento comportamiento){
        this.comportamiento = comportamiento;
    }

    void obtenerPuntajeTotal(List<Respuesta> respuestas, Puntos puntosJugador){
        Puntos puntos = new Puntos();
        for(Respuesta unaRespuesta: respuestas){
            unaRespuesta.aplicarComportamiento(this.comportamiento, puntos);
        }
        puntos.modificarPuntosDe(puntosJugador);
    }
}
