package fpt.gymmanagement.dto;

import fpt.gymmanagement.common.CommonDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class GymInformationDTO extends CommonDTO {

    private String id;

    private String userId;

    private String userCourseId;

    private Double height; // chiều cao

    private Double weight; // nặng

    private Double ecw_tbw; //tỷ lệ nước ngoại bào (ECW/TBW)

    private Double ecw_tbwNormalTo; //tỷ lệ nước ngoại bào (ECW/TBW)

    private Double ecw_tbwNormal; //tỷ lệ nước ngoại bào (ECW/TBW)

    private Double protein;

    private Double proteinNormal;

    private Double proteinNormalTo;

    private Double pbf;

    private Double pbfNormal;

    private Double pbfNormalTo;

    private Double whr;

    private Double whrNormal;

    private Double whrNormalTo;

    private Double bustMeasurement;

    private Double waistMeasurement;

    private Double hipMeasurement;

    private String note;

    private UserDTO user;

    private UserDTO mentor;

    private CourseDTO course;

}
