/**
 *
 */
package dubbo.out.food.controller;

import dubbo.out.food.utils.JsonUtils;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @author 陈佳
 * @createTime 2017年6月9日 下午3:23:45
 */
@Controller
@RequestMapping("test")
public class TestController {

    @ApiOperation(value = "A001买家全部订单列表", notes = "买家全部订单列表", httpMethod = "GET")
    @ApiImplicitParam(required = true, name = "test", value = "test", dataType = "string")
    @RequestMapping(value = "get", method = RequestMethod.GET)
    public void test(HttpServletRequest request,
                     HttpServletResponse response) {
        JsonUtils.renderJSON(response, "测试=======================");
    }
}
