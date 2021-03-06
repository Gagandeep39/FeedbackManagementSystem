
package com.cg.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Uma Shankar
 *
 * 06-May-2020 9:08:23 pm
 */
@Entity
@Table(name = "PARTICIPANT_ENROLLED")
public class ParticipantEnrolled {

	@Id
	@Column(name = "PARTICIPANT_ID")
	private Integer partEnrollNo;
	
	@Column(name="PARTICIPANT_NAME")
	private String participantName ;

	@ManyToOne
	@JoinColumn(name = "TRAINING_CODE")
	private TrainingProgram trainingprogram;

	public Integer getPartEnrollNo() {
		return partEnrollNo;
	}

	public void setPartEnrollNo(Integer partEnrollNo) {
		this.partEnrollNo = partEnrollNo;
	}

	public String getParticipantName() {
		return participantName;
	}

	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}

	public TrainingProgram getTrainingprogram() {
		return trainingprogram;
	}

	public void setTrainingprogram(TrainingProgram trainingprogram) {
		this.trainingprogram = trainingprogram;
	}
	
	
		

}
