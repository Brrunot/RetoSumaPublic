package es.frikitech.RetoSuma.infrastructure.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultadoDto {

    @JsonProperty( "respuesta")
    private String resultado;



    public String getResultado() {
        return resultado;
    }


    public void setResultado(String resultado) {
        this.resultado = resultado;
    }


}
