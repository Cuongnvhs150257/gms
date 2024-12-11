package fpt.gymmanagement.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import fpt.gymmanagement.common.CommonDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class DeviceTypeDTO extends CommonDTO {
    @ApiModelProperty(hidden = true)
    private String id;
    @NotBlank(message = "Tên kiểu thiết bị không được bỏ trống")
    private String name;
}
