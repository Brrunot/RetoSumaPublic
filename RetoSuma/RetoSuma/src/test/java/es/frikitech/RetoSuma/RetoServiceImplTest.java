package es.frikitech.RetoSuma;

import es.frikitech.RetoSuma.application.api.RetoServiceImpl;
import es.frikitech.RetoSuma.domain.Resultado;
import es.frikitech.RetoSuma.infrastructure.api.dto.ResultadoDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.reactive.function.client.WebClient;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
public class RetoServiceImplTest {

    @Autowired
    private  RetoServiceImpl service ;



    @Test
    public void testSuma() {
        ResultadoDto resultado = service.suma(123);
        assertEquals("1 + 2 + 3 = 6", resultado.getResultado());
    }

}
