package com.hua.shi.rmd.dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;


@ApiModel(value = "userLogin对象信息")
@Data
public class UserLogin {

    @ApiParam(value = "账号", name = "userName")
    private String userName;

    @ApiParam(value = "密码", name = "passWd")
    private String passWd;
}
