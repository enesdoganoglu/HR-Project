package com.hrmanagement.mapper;

import com.hrmanagement.dto.request.*;
import com.hrmanagement.dto.response.AuthCreatePersonnelProfileResponseDto;
import com.hrmanagement.dto.response.RegisterResponseDto;
import com.hrmanagement.rabbitmq.model.RegisterMailModel;
import com.hrmanagement.repository.entity.Auth;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IAuthMapper {
    IAuthMapper INSTANCE = Mappers.getMapper(IAuthMapper.class);

    Auth fromVisitorsRequestDtoToAuth(final RegisterVisitorRequestDto dto);

    NewCreateVisitorUserRequestDto fromAuthToNewCreateUserDto(final RegisterManagerRequestDto dto);

    RegisterResponseDto fromAuthToResponseDto(final Auth auth);

    Auth fromManagerRequestDtoToAuth(final RegisterManagerRequestDto dto);

    ForgotPasswordUserRequestDto fromAuthToForgotPasswordUserRequestDto(final Auth auth);

    Auth fromCreatePersonelProfileDtotoAuth(final AuthCreatePersonnelProfileResponseDto dto);


    RegisterMailModel fromAuthToRegisterMailModel(final Auth auth);

    NewCreateVisitorUserRequestDto fromAuthNewCreateVisitorUserRequestDto(final Auth auth);

    NewCreateManagerUserRequestDto fromRegisterManagerRequestDtoToNewCreateManagerUserRequestDto(final RegisterManagerRequestDto dto);

}
