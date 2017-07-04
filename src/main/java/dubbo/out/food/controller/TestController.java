/**
 * 
 */
package dubbo.out.food.controller;

import dubbo.out.food.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * @author 陈佳
 * @createTime 2017年6月9日 下午3:23:45
 * 
 */
@Controller
@RequestMapping("test")
public class TestController {
	
	@RequestMapping("/testVlaue")
	public void test(HttpServletRequest request,
			HttpServletResponse response) {
		JsonUtils.renderJSON(response, "测试=======================");
	}
}
