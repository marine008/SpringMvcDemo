package one.marine.Test.Services;

import org.springframework.stereotype.Service;

/**
 * Created by mygod on 2016/12/25.
 */
@Service("Test.TestService")
public class TestService implements ITestService{
    public String ReturnUser(){
        return "Hello";
    }

    public  int AddUser(){
        return  1;
    }
}
