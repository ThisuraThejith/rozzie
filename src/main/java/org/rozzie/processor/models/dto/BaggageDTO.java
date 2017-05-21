package org.rozzie.processor.models.dto;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.UUID;

@XmlRootElement
@XmlType
public class BaggageDTO implements BaseDTO {
	private UUID baggageId;
	private String baggageType;
	private float weight;
	private PassengerDTO owner;

	public BaggageDTO() {
	}

	public BaggageDTO(UUID baggageId) {
		this.baggageId = baggageId;
	}

	public BaggageDTO(UUID baggageId, String baggageType, float weight) {
		this.baggageId = baggageId;
		this.baggageType = baggageType;
		this.weight = weight;
	}

	public UUID getBaggageId() {
		return baggageId;
	}

	public void setBaggageId(UUID baggageId) {
		this.baggageId = baggageId;
	}

	public String getBaggageType() {
		return baggageType;
	}

	public void setBaggageType(String baggageType) {
		this.baggageType = baggageType;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public PassengerDTO getOwner() {
		if(owner == null) {
			owner = new PassengerDTO();
		}
		return owner;
	}

	public void setOwner(PassengerDTO owner) {
		this.owner = owner;
	}

	@Override
	public BaseDTO completeObject(Object... objects) {
		return null;
	}
}
