package br.com.thiago.certification_nlw.modules.students.useCases;

import br.com.thiago.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;
import org.springframework.stereotype.Service;

//Nossa camada de Serviço
@Service
public class VerifyHasCertificationUseCase {

    public boolean execute(VerifyHasCertificationDTO dto){
        if (dto.getEmail().equals("thiago@gmail.com") &&
        dto.getTechnology().equals("Java")) {
            return true;
        }
        return false;
    }
}
