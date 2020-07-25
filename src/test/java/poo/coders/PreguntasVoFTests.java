package poo.coders;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class PreguntasVoFTests {
    @Test
    void test01AcoplamientoCorrectoPreguntaCorrectaAumentaUnPunto(){
        Pregunta pregunta = new Pregunta(new VoFClasico());
        Puntos puntosJugador = new Puntos();

        ArrayList<Respuesta>respuestasJugador = new ArrayList<>();
        respuestasJugador.add(new RespuestaCorrecta());

        pregunta.obtenerPuntajeTotal(respuestasJugador, puntosJugador);

        Assertions.assertEquals(1, puntosJugador.getPuntos());
    }

    @Test
    void test02JugadorConRespuestaCorrectaSumaUnPunto(){
        Pregunta pregunta = new Pregunta(new VoFClasico());
        Jugador jugador = new Jugador();

        ArrayList<Respuesta>respuestaJugador = new ArrayList<>();
        respuestaJugador.add(new RespuestaCorrecta());

        jugador.procesarPregunta(pregunta, respuestaJugador);
        Assertions.assertEquals(1, jugador.getPuntos());
    }
/*
    @Test
    void test01RespuestaCorrectaOtorga1PuntoAJugador(){
        Jugador jugador = new Jugador("Tomas");
        Pregunta pregunta = new Pregunta("Este enunciado es verdadero", new VoFClasico());

        RespuestaCorrecta correcta = new RespuestaCorrecta();

        ArrayList<Respuesta>respuestaJugador = new ArrayList<>();
        respuestaJugador.add(correcta);

        jugador.procesarPregunta(pregunta, respuestaJugador);
        Assertions.assertEquals(1, jugador.getPuntos);

    }

    @Test
    void test02JugadorContestaConRespuestaIncorrectaNoRecibePuntos(){
        Jugador jugador = new Jugador("Kevin");
        Pregunta pregunta = new Pregunta("Este enunciado es verdadero", new VoFClasico());

        RespuestaIncorrecta incorrecta = new RespuestaIncorrecta();

        ArrayList<Respuesta> respuestaJugador = new ArrayList<>;
        respuestaJugador.add(incorrecta);

        jugador.procesarPregunta(pregunta, respuestaJugador);
        Assertions.assertEquals(0, jugador.getPuntos);

    }*/
}
