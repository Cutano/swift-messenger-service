package team.cutano.swiftmessengerservice.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface ChatMapper {
    HashMap<String, Object> userInfo(Integer userID);
    List<HashMap<String, Object>> friendList(Integer userID);
}
