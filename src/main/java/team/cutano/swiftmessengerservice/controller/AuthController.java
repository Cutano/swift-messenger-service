package team.cutano.swiftmessengerservice.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import team.cutano.swiftmessengerservice.json.Converter;
import team.cutano.swiftmessengerservice.json.Register;
import team.cutano.swiftmessengerservice.json.RegisterData;
import team.cutano.swiftmessengerservice.mapper.AuthMapper;
import team.cutano.swiftmessengerservice.pojo.User;

import javax.annotation.Resource;
import java.util.HashMap;

@RestController
@RequestMapping("/v1.0/auth")
public class AuthController {
    @Resource
    private AuthMapper authMapper;

    @RequestMapping("/register")
    public String userRegister(@RequestParam(value = "username") String username,
                               @RequestParam(value = "password") String password,
                               @RequestParam(value = "userAvatar") String userAvatar) {
        User user = new User(null, username, userAvatar, password);
        Integer res = authMapper.userRegister(user);
        Integer userID = user.getUserID();
        if (res == 0 || userID == null) return "{\"result\": \"error\"}";

        Register register = new Register();
        RegisterData registerData = new RegisterData();
        registerData.setUserID((long) userID);
        register.setResult("success");
        register.setData(registerData);
        try {
            return Converter.RegisterToJsonString(register);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "{\"result\": \"error\"}";
        }
    }

}
