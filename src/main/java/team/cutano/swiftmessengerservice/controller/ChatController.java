package team.cutano.swiftmessengerservice.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import team.cutano.swiftmessengerservice.json.Converter;
import team.cutano.swiftmessengerservice.json.UserInfo;
import team.cutano.swiftmessengerservice.json.UserInfoData;
import team.cutano.swiftmessengerservice.mapper.ChatMapper;

import javax.annotation.Resource;
import java.util.HashMap;

@RestController
@RequestMapping("/v1.0/chat")
public class ChatController {
    @Resource
    private ChatMapper chatMapper;

    @RequestMapping("/user-info")
    public String userInfo(@RequestParam(value = "userID") Integer userID) {
        HashMap<String, Object> map = chatMapper.userInfo(userID);

        UserInfo userInfo = new UserInfo();
        UserInfoData userInfoData = new UserInfoData();
        userInfoData.setUserID(((Integer) map.get("userID")).longValue());
        userInfoData.setUserAvatar((String) map.get("avatar"));
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

}
