package poo.coders;

public class Puntos {
    int puntos = 0;
    int incremental = 1;

    void uno(){
        puntos = incremental;
    }
    void cero(){
        puntos = 0;
        incremental = 0;
    }

    int getPuntos(){
        return puntos;
    }

    void setPuntos(int puntos){
        this.puntos = puntos;
    }

    void modificarPuntosDe(Puntos puntos){
        puntos.setPuntos(this.puntos);
    }

    void incrementar(){
        this.puntos += incremental;
    }
}
