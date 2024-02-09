package com.esi.sic.tp2.messages;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.logging.Logger;

public class Echec implements JavaDelegate {
    private final static Logger LOGGER = Logger.getLogger("Echéc");
    public void execute(DelegateExecution execution) throws Exception {
        // execution.getProcessEngineServices().getRuntimeService().createMessageCorrelation("message_bar").correlateWithResult();
        LOGGER.info("Echec de paiement");
    }
}
