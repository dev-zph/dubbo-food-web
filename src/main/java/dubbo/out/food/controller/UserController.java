package dubbo.out.food.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhangph
 * @version 2017-07-04 14:51
 **/
@Controller
@RequestMapping("/admin")
@Api(value = "admin") //写在contrller的@api注释是swagger用于将api分组，切记不要用中文，否则无法生成出文档
public class UserController {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ApiOperation(value = "登陆", httpMethod = "POST") //value可以写中文
    public String login(@ApiIgnore ModelMap modelMap //@apiignore表示忽略这个参数的输入，当然我们不需要客户端提交这个值
            , HttpServletRequest request
            , @ApiParam(required = true, value = "用户名") @RequestParam String username
            , @ApiParam(required = true, value = "密码") @RequestParam String pwd) {
        return null;
    }

}
