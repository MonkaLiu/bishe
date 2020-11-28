package com.hua.shi.rmd.service.user;

import com.hua.shi.rmd.domain.entity.user.UserInfo;
import com.hua.shi.rmd.dto.request.UserLogin;
import com.hua.shi.rmd.mapper.user.UserInfoMapper;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Api(value = "执行计划模块", tags = {"执行计划模块"} )
@RestController
@RequestMapping("/security")
public class UserService {

    @Resource
    private UserInfoMapper userInfoMapper;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Map userLogin(@RequestBody UserLogin userLogin) {
        log.info("请求进来了没 param：{}", userLogin.toString());
        Map map = new HashMap();
        String userName = userLogin.getUserName();
        String passWd = userLogin.getPassWd();
        UserInfo userInfo = new UserInfo();
        userInfo.setUserCode(userName);
        userInfo.setUserPwd(passWd);
        UserInfo u = userInfoMapper.verifyPassword(userInfo);
        if (u == null) {
            map.put("status", "failed");
            map.put("message", "密码错误");
            return map;
        }
        map.put("status", "succeed");
        map.put("message", "登录成功");
        return map;
    }


}
