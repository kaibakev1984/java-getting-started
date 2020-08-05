package poo.coders;

public class NumerosRomanos {
    public String convertirARomanos(int numeroNatural) {
        switch (numeroNatural) {
            case 4: return "IV";
            case 9: return "IX";
        }
        return sumarUnificado(numeroNatural);
    }

    private String sumarUnificado(int numeroNatural ) {
        String resultado = "";
        int inicio = 0;
        int fin = numeroNatural;
        if (numeroNatural > 4) {
            inicio = 5;
            resultado += "V";
        }
        for (int i = inicio; i < numeroNatural; i++) {
            resultado += "I";
        }
        return resultado;
    }
}
