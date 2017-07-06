package dubbo.out.food.configuration;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义消息序列化转换器 基于alibaba的fastjson技术。
 *
 * @author zhangph
 * @version 2017-07-06 9:40
 **/
@Configuration
public class MyHttpMessageConverter extends WebMvcConfigurerAdapter {

    /**
     * httpmessagejson转换器
     *
     * @return
     */
    public FastJsonHttpMessageConverter defaultHttpMessageConverter() {
        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(new SerializerFeature[0]);
        fastConverter.setFastJsonConfig(fastJsonConfig);
        List<MediaType> list = new ArrayList<>();
        list.add(MediaType.APPLICATION_JSON);
        fastConverter.setSupportedMediaTypes(list);
        return fastConverter;
    }

    /**
     * 重写extendMessageConverters,只使用fastJson转换器
     *
     * @param converters
     */
    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.clear();
        converters.add(this.defaultHttpMessageConverter());
    }
}
