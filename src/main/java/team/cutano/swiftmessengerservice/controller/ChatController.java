package team.cutano.swiftmessengerservice.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.*;
import team.cutano.swiftmessengerservice.json.*;
import team.cutano.swiftmessengerservice.mapper.ChatMapper;

import javax.annotation.Resource;
import java.util.*;

@RestController
@RequestMapping("/v1.0/chat")
public class ChatController {
    @Resource
    private ChatMapper chatMapper;

    @PostMapping("/user-info")
    public String userInfo(@RequestBody Map<String, Object> body) {
        Integer userID = (Integer) body.get("userID");
        HashMap<String, Object> map = chatMapper.userInfo(userID);

        UserInfo userInfo = new UserInfo();
        UserInfoData userInfoData = new UserInfoData();
        userInfoData.setUserID(((Integer) map.get("userID")).longValue());
        userInfoData.setUserAvatar((String) map.get("userAvatar"));
        userInfoData.setUsername((String) map.get("username"));
        userInfo.setResult("success");
        userInfo.setData(userInfoData);
        try {
            return Converter.UserInfoToJsonString(userInfo);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "{\"result\": \"error\"}";
        }
    }

    @PostMapping("/friend-list")
    public String friendList(@RequestBody Map<String, Object> body) {
        Integer userID = (Integer) body.get("userID");
        List<HashMap<String, Object>> maps = chatMapper.friendList(userID);
        List<Friend> friends = new ArrayList<>();

        for (HashMap<String, Object> map : maps) {
            Friend friend = new Friend();
            friend.setFriendID(((Integer) map.get("friendID")).longValue());
            friend.setFriendName((String) map.get("friendName"));
            friend.setFriendAvatar((String) map.get("friendAvatar"));
            friend.setRecentMsg((String) map.get("recentMsg"));
            friend.setRecentMsgTime(Long.valueOf((String) map.get("recentMsgTimeStamp")));
            friend.setUnreadMsgCount((Long) map.get("unreadMsgCount"));
            friends.add(friend);
        }

        FriendList friendList = new FriendList();
        FriendListData friendListData = new FriendListData();
        friendListData.setFriends(friends);
        friendListData.setTime(System.currentTimeMillis());
        friendList.setResult("success");
        friendList.setData(friendListData);
        try {
            return Converter.FriendListToJsonString(friendList);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "{\"result\": \"error\"}";
        }
    }

}
