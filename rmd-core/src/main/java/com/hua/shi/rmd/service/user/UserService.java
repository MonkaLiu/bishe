package com.hua.shi.rmd.service.user;

import com.hua.shi.rmd.dto.request.UserLogin;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/security")
public class UserService {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public Map userLogin(@RequestBody UserLogin userLogin) {
        Map map=new HashMap();

        return map;
    }


}
