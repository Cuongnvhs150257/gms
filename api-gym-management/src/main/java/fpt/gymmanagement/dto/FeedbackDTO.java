package fpt.gymmanagement.dto;

import fpt.gymmanagement.common.CommonDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FeedbackDTO extends CommonDTO {
    @NotBlank(message = "ID khóa học người dùng không được bỏ trống")
    String userCourseId;
    @NotBlank(message = "Lời đánh giá không được bỏ trống")
    String content;

    @NotNull(message = "Đánh giá sao không được bỏ trống")
    @Min(1)
    @Max(5)
    Double star;

    @ApiModelProperty(hidden = true)
    String id;
    @ApiModelProperty(hidden = true)
    UserDTO sender;
    @ApiModelProperty(hidden = true)
    UserCourseDTO userCourse;
    @ApiModelProperty(hidden = true)
    String senderId;
    @ApiModelProperty(hidden = true)
    Boolean isEnable = true;
}
