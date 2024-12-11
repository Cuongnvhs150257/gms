package fpt.gymmanagement.dto;

import fpt.gymmanagement.common.CommonDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Builder
@Getter
@Setter
//@Data
//@EqualsAndHashCode(callSuper = true)
public class BlogTypeDTO extends CommonDTO {
    @ApiModelProperty(hidden = true)
    private String id;
    @NotBlank(message = "Tên kiểu blog không được bỏ trống")
    private String name;
}
