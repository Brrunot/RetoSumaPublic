package es.frikitech.RetoSuma.infrastructure.api.mappers;


import es.frikitech.RetoSuma.domain.Resultado;
import es.frikitech.RetoSuma.infrastructure.api.dto.ResultadoDto;
import org.mapstruct.Mapper;

@Mapper(componentModel  = "spring")
public interface ResultadoDtoMapper {

    ResultadoDto toDto(Resultado domain);






}
