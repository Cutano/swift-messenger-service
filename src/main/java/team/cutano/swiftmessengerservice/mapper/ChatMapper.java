package team.cutano.swiftmessengerservice.mapper;

import org.apache.ibatis.annotations.Mapper;
import team.cutano.swiftmessengerservice.pojo.Message;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface ChatMapper {
    HashMap<String, Object> userInfo(Integer userID);
    List<HashMap<String, Object>> friendList(Integer userID);
    List<Message> conversationHistoryMsg(Integer userID, Integer friendID);
    Integer addFriend(Integer userID, Integer friendID);
    Integer clearUnread(Integer userID, Integer friendID);
}
