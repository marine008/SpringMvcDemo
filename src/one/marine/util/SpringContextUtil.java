package one.marine.util;
import org.springframework.beans.BeansException;
import org.springframework.beans.propertyeditors.StringArrayPropertyEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Created by mygod on 2017/2/10.
 */
@Component
public class SpringContextUtil implements ApplicationContextAware{
    private static ApplicationContext context = null;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }

    /**
     * 根据传入的beanName,从Spring的上下文环境中获取Bean对象
     * @param beanName bean的名称，与Spring中注解的一致。
     * @param <T> 对应的Bean对象，该对象为一个泛型
     * @return
     */
    public static<T> T getBean(String beanName){
        if(null == beanName || beanName.isEmpty())
            return null;
        return (T) context.getBean(beanName);
    }
}
