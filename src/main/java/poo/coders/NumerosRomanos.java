package poo.coders;

public class NumerosRomanos {
    public String convertirARomanos(int numeroNatural) {
        if(numeroNatural <= 3) {
            return sumarI(numeroNatural);
        }
        switch (numeroNatural) {
            case 4: return "IV";
            case 5: return "V";
        }
        return null;
    }

    private String sumarI(int numeroNatural) {
        String resultado = "";
        for (int i = 1; i <= numeroNatural; i++) {
            resultado += "I";
        }
        return resultado;
    }
}
