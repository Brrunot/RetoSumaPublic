package es.frikitech.RetoSuma.infrastructure.api;

import es.frikitech.RetoSuma.application.api.RetoService;
import es.frikitech.RetoSuma.infrastructure.api.dto.ResultadoDto;
import es.frikitech.RetoSuma.infrastructure.api.mappers.ResultadoDtoMapper;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.server.ResponseStatusException;

@RestController

@RequestMapping("/reto")


public class RetoController {

    private final RetoService service;

    private final ResultadoDtoMapper mapper;

    private RetoController(RetoService service, ResultadoDtoMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }


    @GetMapping(value = "/suma", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResultadoDto> suma(
            @RequestParam int numero
    ){

        if (numero < 0){

            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);

        }else{

        try{
            ResultadoDto resultadoDto = service.suma(numero);
            return ResponseEntity.ok(resultadoDto);
        }catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage(), e);


        }

        }

    }
}
