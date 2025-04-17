package org.openmrs.module.csaudecore.api;

import org.openmrs.module.csaudecore.camel.payload.DispensationPayload;

public interface DispensationProcessorService {
	
	void process(DispensationPayload payload);
}
