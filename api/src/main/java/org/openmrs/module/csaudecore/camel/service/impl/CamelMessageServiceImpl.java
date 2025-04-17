package org.openmrs.module.csaudecore.camel.service.impl;

import org.apache.camel.ProducerTemplate;
import org.openmrs.api.context.Context;
import org.openmrs.module.csaudecore.api.DispensationProcessorService;
import org.openmrs.module.csaudecore.camel.payload.DispensationPayload;
import org.openmrs.module.csaudecore.camel.payload.PrescriptionPayload;
import org.openmrs.module.csaudecore.camel.payload.PrescriptionResponsePayload;
import org.openmrs.module.csaudecore.camel.service.CamelMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class CamelMessageServiceImpl implements CamelMessageService {
	
	@Autowired
	private ProducerTemplate producerTemplate;
	
	@Autowired
	private DispensationProcessorService dispensationProcessorService;
	
	@Override
	public void publishPrescription(PrescriptionPayload payload) {
		this.producerTemplate.sendBody("direct:sendPrescription", payload);
	}
	
	@Override
	public void processPrescriptionResponse(PrescriptionResponsePayload payload) {
		Context.openSession();
		try {
			Context.authenticate("admin", "eSaude123");
			
			// TODO: implementar logica de confirmacao da Prescricao
			
		}
		finally {
			Context.closeSession();
		}
	}
	
	@Override
	public void consumeAndPersistDispensation(DispensationPayload payload) {
		Context.openSession();
		try {
			Context.authenticate("admin", "eSaude123");
			dispensationProcessorService.process(payload);
		}
		finally {
			Context.closeSession();
		}
	}
}
