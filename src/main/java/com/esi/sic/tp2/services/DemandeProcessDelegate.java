package com.esi.sic.tp2.services;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.logging.Logger;

public class DemandeProcessDelegate implements JavaDelegate {

    private final static Logger LOGGER = Logger.getLogger("Etablissement-Demande-Paiement");

    public void execute(DelegateExecution execution) throws Exception {
        execution.setVariable("demandeId", "P-"+Math.round(Math.random()*1000));
        execution.setVariable("messageNumber", 0);
        LOGGER.info("Fournisseur " + execution.getVariable("fournisseur")
                + " Date " + execution.getVariable("date") + " demandeId " + execution.getVariable("demandeId") );
    }
}
