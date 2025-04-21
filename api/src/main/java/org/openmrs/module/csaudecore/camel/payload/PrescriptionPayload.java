package org.openmrs.module.csaudecore.camel.payload;

import java.util.List;

public class PrescriptionPayload {
	
	private String patientUuid;
	
	private String encounterUuid;
	
	private String therapeuticRegimen;
	
	private String regimenLine;
	
	private List<Formulation> formulations;
	
	public String getPatientUuid() {
		return patientUuid;
	}
	
	public void setPatientUuid(String patientUuid) {
		this.patientUuid = patientUuid;
	}
	
	public String getTherapeuticRegimen() {
		return therapeuticRegimen;
	}
	
	public void setTherapeuticRegimen(String therapeuticRegimen) {
		this.therapeuticRegimen = therapeuticRegimen;
	}
	
	public String getEncounterUuid() {
		return encounterUuid;
	}
	
	public void setEncounterUuid(String encounterUuid) {
		this.encounterUuid = encounterUuid;
	}
	
	public List<Formulation> getFormulations() {
		return formulations;
	}
	
	public void setFormulations(List<Formulation> formulations) {
		this.formulations = formulations;
	}
	
	public String getRegimenLine() {
		return regimenLine;
	}
	
	public void setRegimenLine(String regimenLine) {
		this.regimenLine = regimenLine;
	}
}
