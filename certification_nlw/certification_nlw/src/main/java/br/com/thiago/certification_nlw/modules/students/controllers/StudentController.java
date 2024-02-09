package br.com.thiago.certification_nlw.modules.students.controllers;

import br.com.thiago.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;
import br.com.thiago.certification_nlw.modules.students.useCases.VerifyHasCertificationUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

    //Preciso usar meu USECASE
    @Autowired // anotação do spring que inicializa automaticamente a classe de serviço
    private VerifyHasCertificationUseCase verifyHasCertificationUseCase;

    @PostMapping("/verifyIfHasCertification")
    //RequestBody - de onde vamos captar as informações
    public String verifyIfHasCertification(@RequestBody VerifyHasCertificationDTO verifyHasCertificationDTO) {

        var result = this.verifyHasCertificationUseCase.execute(verifyHasCertificationDTO);
        if (result) {
            return "Usuário já fez a prova";
        }
        return "Usuário pode fazer a prova";
    }
}
