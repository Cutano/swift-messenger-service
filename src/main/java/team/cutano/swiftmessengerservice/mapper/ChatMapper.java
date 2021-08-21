package team.cutano.swiftmessengerservice.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface ChatMapper {
    HashMap<String, Object> userInfo(Integer userID);
}
