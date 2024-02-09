package com.esi.sic.tp2.services;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.logging.Logger;

public class OrdrePaiementDelegate implements JavaDelegate {

    private final static Logger LOGGER = Logger.getLogger("Etablissement-Demande-Paiement");

    public void execute(DelegateExecution execution) throws Exception {
        execution.setVariable("ordreId", "O-"+Math.round(Math.random()*1000));
        LOGGER.info("Fournisseur " + execution.getVariable("fournisseur") + " ordreId " + execution.getVariable("ordreId") + " a été générée");
    }
}
