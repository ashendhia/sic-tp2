package com.esi.sic.tp2.services;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.io.FileOutputStream;
import java.util.logging.Logger;

public class ArchiverDelegate implements JavaDelegate {

    private final static Logger LOGGER = Logger.getLogger("Etablissement-Demande-Paiement");

    public void execute(DelegateExecution execution) throws Exception {
        //FileValue invoiceDocumentVar = (FileValue)execution.getVariableTyped("
        LOGGER.info("Fournisseur " + execution.getVariable("fournisseur") + " virementId " + execution.getVariable("virementId") + " a été archivé");
    }
}
