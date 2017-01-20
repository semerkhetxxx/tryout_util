package idv.tryout.service.test;

import idv.tryout.model.UserVO;
import idv.tryout.service.TryoutService;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-hikari-ctx.xml")
public class TutorTest4 {


    private Logger logger = Logger.getLogger(TutorTest4.class);

    @Autowired
    TryoutService tryoutService;

    @Test
    public void test() {
        UserVO user = new UserVO();
        user.setUserName(RandomStringUtils.randomAlphabetic(32));
        user.setUserPw(RandomStringUtils.randomAlphabetic(32));
        user.setUserPic(RandomStringUtils.randomAlphabetic(32));
        tryoutService.insertUser(user);
        logger.debug("DEBUG");
        assertNotNull("FAILED",tryoutService.getUserByNO(user.getUserNo()));
        logger.info("COMPLETED");
    }

}
