package com.esi.sic.tp2.services;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.logging.Logger;

public class EnregistrementDemandeDelegate implements JavaDelegate {

    private final static Logger LOGGER = Logger.getLogger("Etablissement-Demande-Paiement");

    public void execute(DelegateExecution execution) throws Exception {
        LOGGER.info("Fournisseur " + execution.getVariable("fournisseur") + " demandeId " + execution.getVariable("demandeId") + " a été sauvegardée");
    }
}
