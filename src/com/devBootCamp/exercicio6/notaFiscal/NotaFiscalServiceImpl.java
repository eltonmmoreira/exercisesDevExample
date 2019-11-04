package com.devBootCamp.exercicio6.notaFiscal;

import com.devBootCamp.exercicio6.Email;
import com.devBootCamp.exercicio6.EmailService;
import com.devBootCamp.exercicio6.EmailServiceImpl;
import com.devBootCamp.exercicio6.crud.CrudServiceImpl;

public class NotaFiscalServiceImpl extends CrudServiceImpl<NotaFiscal>
        implements NotaFiscalService {

    private EmailService emailService = new EmailServiceImpl();

    @Override
    protected void preSave(NotaFiscal entity) {
        for (NotaFiscalItem notaFiscalItem : entity.getNotaFiscalItemList()) {
            if (notaFiscalItem.getQuantidade().compareTo(notaFiscalItem.getItem().getQuantidade()) > 0) {
                throw new RuntimeException("Quantidade maior que o disponivel: " + "solicitado: "
                        + notaFiscalItem.getQuantidade() + ". Disponivel: "
                        + notaFiscalItem.getItem().getQuantidade());
            }
        }
    }

    @Override
    protected void postSave(NotaFiscal entity) {
        Email email = new Email();
        email.setDe("fasdfdsa@fdsafd.com");
        email.setPara("32443ewrewfdsfds@fdsafda.com");
        emailService.enviarEmail(email);
    }
}
