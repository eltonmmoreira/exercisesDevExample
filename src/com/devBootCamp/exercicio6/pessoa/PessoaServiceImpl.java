package com.devBootCamp.exercicio6.pessoa;

import com.devBootCamp.exercicio6.Email;
import com.devBootCamp.exercicio6.EmailService;
import com.devBootCamp.exercicio6.EmailServiceImpl;
import com.devBootCamp.exercicio6.crud.CrudServiceImpl;

public class PessoaServiceImpl extends CrudServiceImpl<Pessoa> implements PessoaService {

    private EmailService emailService = new EmailServiceImpl();

    @Override
    protected void preSave(Pessoa entity) {
        if (entity.getCpf() == null) {
            throw new RuntimeException("CPF Invalido: " + entity.getNome());
        }

        if (entity.getEmail() == null) {
            throw new RuntimeException("Email nao informado: " + entity.getNome());
        }
    }

    @Override
    protected void postSave(Pessoa entity) {
        Email email = new Email();
        email.setDe("emresa@fdasicjdsia.com");
        email.setPara(entity.getEmail());
        emailService.enviarEmail(email);
    }

    @Override
    public void atualizarEndereco(String rua, String numero) {

    }
}
