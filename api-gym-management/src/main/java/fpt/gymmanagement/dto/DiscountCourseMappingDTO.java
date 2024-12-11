package fpt.gymmanagement.dto;

import fpt.gymmanagement.common.CommonDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class DiscountCourseMappingDTO extends CommonDTO {

    private String id;

    private String name;

    private String description;

    private Boolean status;

    private Long startDate;

    private Long endDate;

    private Integer discountPercentAmount;

    private String branchId;

    private String courseId;

    private BranchDTO branch;

    private CourseDTO course;
}
