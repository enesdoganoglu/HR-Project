package com.hrmanagement.dto.request;

import com.hrmanagement.repository.entity.enums.EGender;
import com.hrmanagement.repository.entity.enums.ERole;
import com.hrmanagement.repository.entity.enums.EStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.index.Indexed;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserProfileRequestDto {
    private String password;
    @Indexed(unique = true)
    private String email;
    private String name;
    private String middleName;
    private String surname;
    private Long dateOfBirth;
    private String birthPlace;
    private String identificationNumber;
    private EGender gender;
    private String phone;
    private Double wage;
    private Long wageDate;
    private String avatar;
    private String neighbourhood;
    private String district;
    private String province;
    private String country;
    private Integer buildingNumber;
    private Integer apartmentNumber;
    private Integer postalCode;
    private String companyId;
    private List<Long> employeeLeaves;
    private String department;
    private Long jobStartingDate;

}
