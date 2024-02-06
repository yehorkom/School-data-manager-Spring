package com.foxminded.spring.schooldatamanager.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GroupDto {
	@NotEmpty(message = "Group name cannot be empty")
	private String groupName;
}
