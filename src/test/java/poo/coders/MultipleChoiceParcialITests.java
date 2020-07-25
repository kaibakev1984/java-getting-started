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
        jugador.procesarPregunta(pregunta, respuestas);
        Assertions.assertEquals(1, jugador.getPuntos());

        respuestas.add(new RespuestaIncorrecta());
        jugador.procesarPregunta(pregunta, respuestas);
        Assertions.assertEquals(0, jugador.getPuntos());

        respuestas.add(new RespuestaCorrecta());
        jugador.procesarPregunta(pregunta, respuestas);
        Assertions.assertEquals(0, jugador.getPuntos());
    }
}
