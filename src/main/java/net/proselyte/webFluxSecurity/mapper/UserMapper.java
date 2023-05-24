package net.proselyte.webFluxSecurity.mapper;

import net.proselyte.webFluxSecurity.dto.UserDto;
import net.proselyte.webFluxSecurity.entity.UserEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto map(UserEntity userEntity);

    @InheritInverseConfiguration
    UserEntity map(UserDto dto);
}
