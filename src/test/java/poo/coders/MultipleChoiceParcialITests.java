package poo.coders;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class MultipleChoiceParcialITests {
    @Test
    public void test01JugadorContesta3Con3PreguntasCorrectasDevuelve3Puntos(){
        Pregunta pregunta = new Pregunta(new MultipleChoiceParcial());
        Jugador jugador = new Jugador();

        ArrayList<Respuesta> respuestas = new ArrayList<>();
        respuestas.add(new RespuestaCorrecta());
        respuestas.add(new RespuestaCorrecta());
        respuestas.add(new RespuestaCorrecta());

        jugador.procesarPregunta(pregunta, respuestas);
        Assertions.assertEquals(3, jugador.getPuntos());

    }

    @Test
    public void test02JugadorContestaConUnaIncorrectaYaNoPuedeAcumularPuntosSiEligeOtraCorrecta(){
        Pregunta pregunta = new Pregunta(new MultipleChoiceParcial());
        Jugador jugador = new Jugador();

        ArrayList<Respuesta> respuestas = new ArrayList<>();
        respuestas.add(new RespuestaCorrecta());
        respuestas.add(new RespuestaIncorrecta());
        respuestas.add(new RespuestaCorrecta());

        jugador.procesarPregunta(pregunta, respuestas);
        Assertions.assertEquals(0, jugador.getPuntos());
    }

    @Test
    public void test03PuntosNoSeAcumulanCuandoRespondeIncorrectamente(){
        Pregunta pregunta = new Pregunta(new MultipleChoiceParcial());
        Jugador jugador = new Jugador();

        ArrayList<Respuesta> respuestas = new ArrayList<>();
        respuestas.add(new RespuestaCorrecta());
        respuestas.add(new RespuestaIncorrecta());
        respuestas.add(new RespuestaCorrecta());

        jugador.procesarPregunta(pregunta, respuestas);

        Assertions.assertEquals(0, jugador.getPuntos());
    }

    @Test
    public void test04ConcursoEntreJugadoresDe3Preguntas() {
        Pregunta pregunta = new Pregunta(new MultipleChoiceParcial());
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();

        ArrayList<Respuesta> respuestasDeJugador1 = new ArrayList<>();
        ArrayList<Respuesta> respuestasDeJugador2 = new ArrayList<>();

        //  Multiple Choice de 2 preguntas: Jugador 1 responde 2 correctas, jugador 2 responde una incorrecta
        respuestasDeJugador1.add(new RespuestaCorrecta());
        respuestasDeJugador1.add(new RespuestaCorrecta());

        respuestasDeJugador2.add(new RespuestaCorrecta());
        respuestasDeJugador2.add(new RespuestaIncorrecta());

        jugador1.procesarPregunta(pregunta, respuestasDeJugador1);
        jugador2.procesarPregunta(pregunta, respuestasDeJugador2);

        Assertions.assertEquals(2, jugador1.getPuntos());
        Assertions.assertEquals(0, jugador2.getPuntos());

        respuestasDeJugador1.clear();
        respuestasDeJugador2.clear();

        //  Un multiple choice de 3 preguntas: jugador solo responde 1 bien; jugador 2 las 3
        respuestasDeJugador1.add(new RespuestaCorrecta());

        respuestasDeJugador2.add(new RespuestaCorrecta());
        respuestasDeJugador2.add(new RespuestaCorrecta());
        respuestasDeJugador2.add(new RespuestaCorrecta());

        jugador1.procesarPregunta(pregunta, respuestasDeJugador1);
        jugador2.procesarPregunta(pregunta, respuestasDeJugador2);

        Assertions.assertEquals(3, jugador1.getPuntos());
        Assertions.assertEquals(3, jugador2.getPuntos());

        respuestasDeJugador1.clear();
        respuestasDeJugador2.clear();

        // Multiple Choice de 2 preguntas: Jugador 1 responde las 2 bien, jugador responde 1 incorrecta
        respuestasDeJugador1.add(new RespuestaCorrecta());
        respuestasDeJugador1.add(new RespuestaCorrecta());

        respuestasDeJugador2.add(new RespuestaIncorrecta());
        respuestasDeJugador2.add(new RespuestaCorrecta());

        jugador1.procesarPregunta(pregunta, respuestasDeJugador1);
        jugador2.procesarPregunta(pregunta, respuestasDeJugador2);

        Assertions.assertEquals(5, jugador1.getPuntos());
        Assertions.assertEquals(3, jugador2.getPuntos());
    }
}
