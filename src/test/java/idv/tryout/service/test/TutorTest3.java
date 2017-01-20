package idv.tryout.service.test;

import idv.tryout.model.UserVO;
import idv.tryout.service.TryoutService;
import idv.tryout.service.TryoutServiceFactory;
import org.apache.commons.lang.RandomStringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;


public class TutorTest3 {

    TryoutService tryoutService;

    @Before
    public void before() {
        tryoutService = TryoutServiceFactory.getService();
    }

    @Test
    public void test(){

        UserVO user = new UserVO();
        user.setUserName(RandomStringUtils.randomAlphabetic(32));
        user.setUserPw(RandomStringUtils.randomAlphabetic(32));
        user.setUserPic(RandomStringUtils.randomAlphabetic(32));
        tryoutService.insertUser(user);

        assertNotNull("FAILED",tryoutService.getUserByNO(user.getUserNo()));
        assertEquals("FAILED",user.getUserName(),
                tryoutService.getUserByNO(user.getUserNo()).getUserName());
    }



    @After
    public void after() {
        tryoutService = null;
    }

}
