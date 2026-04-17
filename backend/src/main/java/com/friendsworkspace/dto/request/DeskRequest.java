package com.friendsworkspace.dto.request;

import com.friendsworkspace.model.DeskStatus;
import com.friendsworkspace.model.DeskType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class DeskRequest {
    @NotBlank
    private String deskNumber;

    @NotNull
    private DeskType deskType;

    private DeskStatus availabilityStatus;
}
