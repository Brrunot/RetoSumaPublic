package es.frikitech.RetoSuma.application.api;

import es.frikitech.RetoSuma.infrastructure.api.dto.ResultadoDto;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service

public class RetoServiceImpl  implements RetoService{

    private final WebClient webClient;

    public RetoServiceImpl(WebClient.Builder webClientBuilcer) {
        this.webClient = webClientBuilcer.baseUrl("http://localhost:8080/calculadora").build();
    }

    @Override
    public ResultadoDto suma(int numero) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/suma")
                        .queryParam("numero", numero)
                        .build())
                .retrieve()
                .bodyToMono(ResultadoDto.class)
                .block();
    }
}
