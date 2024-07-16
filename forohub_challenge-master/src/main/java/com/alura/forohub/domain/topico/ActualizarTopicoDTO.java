package com.alura.forohub.domain.topico;

import java.time.LocalDateTime;

public record ActualizarTopicoDTO(
        String titulo,
        String mensaje,
        String status,
        String curso
) {

}
