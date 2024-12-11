package fpt.gymmanagement.dto;

import fpt.gymmanagement.common.CommonDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BranchDTO extends CommonDTO {
    @ApiModelProperty(hidden = true)
    private String id;
    private String name;
    private String address;
    private String logoUrl;
    private String backgroundUrl;
    private String description;
}