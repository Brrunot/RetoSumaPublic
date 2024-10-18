package es.frikitech.RetoSuma.infrastructure.api.mappers;

import es.frikitech.RetoSuma.domain.Resultado;
import es.frikitech.RetoSuma.infrastructure.api.dto.ResultadoDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-06T14:54:56+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21 (Oracle Corporation)"
)
@Component
public class ResultadoDtoMapperImpl implements ResultadoDtoMapper {

    @Override
    public ResultadoDto toDto(Resultado domain) {
        if ( domain == null ) {
            return null;
        }

        ResultadoDto resultadoDto = new ResultadoDto();

        resultadoDto.setResultado( domain.getResultado() );

        return resultadoDto;
    }
}
