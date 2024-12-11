package fpt.gymmanagement.dto;

import fpt.gymmanagement.common.CommonDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class CourseTypeDTO extends CommonDTO {
    @ApiModelProperty(hidden = true)
    private String id;

    @NotBlank(message = "Tên kiểu khóa học không được bỏ trống")
    private String name;
}
