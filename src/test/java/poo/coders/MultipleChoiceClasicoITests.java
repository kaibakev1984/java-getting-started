package poo.coders;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class MultipleChoiceClasicoITests {
    @Test
    public void test01JugadorConRespuestasCorrectasRecibeUnPunto(){
        Jugador jugador = new Jugador();
        Pregunta pregunta = new Pregunta(new MultipleChoiceClasico());
        ArrayList<Respuesta> respuestas = new ArrayList<>();

        respuestas.add(new RespuestaCorrecta());
        respuestas.add(new RespuestaCorrecta());
        respuestas.add(new RespuestaCorrecta());

        jugador.procesarPregunta(pregunta, respuestas);

        Assertions.assertEquals(1, jugador.getPuntos());
    }

    @Test
    public void test01JugadorRespondeUnaIncorrectaYNoSumaPuntos(){
        Jugador jugador = new Jugador();
        Pregunta pregunta = new Pregunta(new MultipleChoiceClasico());
        ArrayList<Respuesta> respuestas = new ArrayList<>();

        respuestas.add(new RespuestaCorrecta());
        respuestas.add(new RespuestaIncorrecta());
        respuestas.add(new RespuestaCorrecta());

        jugador.procesarPregunta(pregunta, respuestas);

        Assertions.assertEquals(0, jugador.getPuntos());
    }
}
