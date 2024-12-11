package fpt.gymmanagement.dto.request.user;

import lombok.Data;

@Data
public class ChangePasswordRequest {
    private String currentPassword;
    private String newPassword;
    private String reNewPassword;
}
