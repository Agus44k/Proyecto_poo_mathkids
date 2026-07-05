package proyecto_poo_mathkids;

public class Pregunta {

    private String operacion;
    private int respuestaCorrecta;

    public Pregunta(String operacion, int respuestaCorrecta) {
        this.operacion = operacion;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public String getOperacion() {
        return operacion;
    }

    public int getRespuestaCorrecta() {
        return respuestaCorrecta;
    }
}
