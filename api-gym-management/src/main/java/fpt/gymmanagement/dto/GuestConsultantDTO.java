package fpt.gymmanagement.dto;

import fpt.gymmanagement.common.CommonDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;

@Data
@EqualsAndHashCode(callSuper = true)
public class GuestConsultantDTO extends CommonDTO {

    private String id;

    @NotBlank(message = "Tên của bạn không được bỏ trống")
    private String name;

    @NotBlank(message = "Số điện thoại không được bỏ trống")
    private String phoneNumber;

    @NotBlank(message = "Email Không được bỏ trống")
    private String email;

    private String note;

    private boolean status;

    private String branchId;

    private BranchDTO branch;
}
