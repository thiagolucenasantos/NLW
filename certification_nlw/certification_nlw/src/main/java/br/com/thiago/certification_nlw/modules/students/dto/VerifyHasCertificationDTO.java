package br.com.thiago.certification_nlw.modules.students.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

//DTO utilizamos para incluirmos dados que será trafegado pelo banco de dados
@Data
@NoArgsConstructor
public class VerifyHasCertificationDTO {
    private String email;
    private String technology;
}
