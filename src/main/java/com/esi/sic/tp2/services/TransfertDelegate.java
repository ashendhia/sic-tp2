package com.esi.sic.tp2.services;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.variable.value.FileValue;

import java.io.FileOutputStream;
import java.util.logging.Logger;

public class TransfertDelegate implements JavaDelegate {

    private final static Logger LOGGER = Logger.getLogger("Etablissement-Demande-Paiement");

    public void execute(DelegateExecution execution) throws Exception {
        StringBuilder pdfContent = new StringBuilder();
        pdfContent.append("Fournisseur "+execution.getVariable("fournisseur")+"\n");
        pdfContent.append("Numéro de virement "+execution.getVariable("virementId")+"\n");
        pdfContent.append("Date "+execution.getVariable("date")+"\n");

        try (FileOutputStream out = new FileOutputStream("reçu.pdf")) {
            out.write(pdfContent.toString().getBytes());
            System.out.println("Reçu created successfully!");
        }

        //FileValue invoiceDocumentVar = (FileValue)execution.getVariableTyped("invoiceDocument");
        execution.setVariable("recu", pdfContent );
        LOGGER.info("Fournisseur " + execution.getVariable("fournisseur") + " virementId " + execution.getVariable("virementId") + " a été envoyé");
    }
}
