package one.marine.Test.Actions;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.ContextLoader;

import one.marine.Test.Services.ITestService;

/**
 * Created by mygod on 2016/12/8.
 */
@Controller
@RequestMapping("/html/Test/testAction.do")
public class TestAction {

    @RequestMapping(params = "action=init")
    @ResponseBody
    public String HelloWorld(){

        ApplicationContext applicationContext = ContextLoader.getCurrentWebApplicationContext();

        ITestService testService = (ITestService)applicationContext.getBean("Test.TestService");

        return testService.ReturnUser();
    }
}
