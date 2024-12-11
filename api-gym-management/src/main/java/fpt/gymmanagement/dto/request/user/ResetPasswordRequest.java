package fpt.gymmanagement.dto.request.user;

import lombok.Data;

@Data
public class ResetPasswordRequest {
    private String username;
    private String code;
    private String newPassword;
}
