package com.hrmanagement.mapper;

import com.hrmanagement.dto.request.*;
import com.hrmanagement.dto.response.NewCreateManagerUserResponseDto;
import com.hrmanagement.dto.response.NewCreateVisitorUserResponseDto;
import com.hrmanagement.dto.response.PersonnelCompanyInformationResponseDto;
import com.hrmanagement.dto.response.PersonnelInformationResponseDto;
import com.hrmanagement.rabbitmq.model.PersonnelPasswordModel;
import com.hrmanagement.repository.entity.UserProfile;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IUserProfileMapper {

    IUserProfileMapper INSTANCE = Mappers.getMapper(IUserProfileMapper.class);


    UserProfile fromCreateUserProfileRequestDtoToUserProfile(final CreateUserProfileRequestDto dto);

    AuthCreatePersonnelProfileRequestDto fromUserProfileToAuthCreatePersonelProfileRequestDto(final UserProfile userProfile);

    PersonnelPasswordModel fromUserProfileToPersonnelPasswordModel(final UserProfile userProfile);

    UserProfile fromNewCreateVisitorUserResponseDtoToUserProfile(final NewCreateVisitorUserResponseDto dto);

    UserProfile fromNewCreateManagerUserResponseDtoToUserProfile(final NewCreateManagerUserResponseDto dto);

    SaveCompanyRequestDto fromNewCreateManagerUserResponseDtoToSaveCompanyRequestDto (final NewCreateManagerUserResponseDto dto);

    UpdateManagerStatusRequestDto fromUserProfileToUpdateManagerStatusRequestDto(final UserProfile userProfile);

    DeletePersonnelFromAuthRequestDto fromUserProfileToDeletePersonnelFromAuthRequestDto(final UserProfile userProfile);

    PersonnelInformationResponseDto fromUserProfileToPersonnelInformationResponseDto(final UserProfile userProfile);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    PersonnelInformationResponseDto fromPersonnelCompanyInformationResponseDtoToPersonnelInformationResponseDto(PersonnelCompanyInformationResponseDto dto,
                                                                                                                @MappingTarget PersonnelInformationResponseDto dtoMain);

}
