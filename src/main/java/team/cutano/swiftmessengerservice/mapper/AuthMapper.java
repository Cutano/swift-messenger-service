package team.cutano.swiftmessengerservice.mapper;

import org.apache.ibatis.annotations.Mapper;
import team.cutano.swiftmessengerservice.pojo.User;

import java.util.HashMap;

@Mapper
public interface AuthMapper {
    Integer userRegister(User user);
}
