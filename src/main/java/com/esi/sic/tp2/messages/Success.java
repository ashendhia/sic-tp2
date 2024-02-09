package com.esi.sic.tp2.messages;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.logging.Logger;

public class Success implements JavaDelegate {
    private final static Logger LOGGER = Logger.getLogger("Paiement Effectué");
    public void execute(DelegateExecution execution) throws Exception {
        // execution.getProcessEngineServices().getRuntimeService().createMessageCorrelation("message_bar").correlateWithResult();
        LOGGER.info("Paiement Effectué avec succès");
    }
}
