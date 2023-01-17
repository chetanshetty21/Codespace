package com.xworkz.industry.DTO;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;

public @Data class AbstractAuditDTO implements Serializable {

	private String createdBy;
	private LocalDateTime createdDate;
	private String updatedBy;
	private LocalDateTime updatedDate;

}
