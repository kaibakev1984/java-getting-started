package poo.coders;

import java.util.List;

public class Jugador {
    Puntos puntos;
    public Jugador(){
        puntos = new Puntos();
    }

    void procesarPregunta(Pregunta pregunta, List<Respuesta> respuestas){
        pregunta.obtenerPuntajeTotal(respuestas, puntos);
    }

    int getPuntos(){
        return puntos.getPuntos();
    }
}
