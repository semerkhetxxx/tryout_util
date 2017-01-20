package idv.tryout.service.test;

import idv.tryout.model.UserVO;
import idv.tryout.service.TryoutService;
import idv.tryout.service.TryoutServiceFactory;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class TutorTest5 {


    private Logger logger = Logger.getLogger(TutorTest5.class);

    @Autowired
    TryoutService tryoutService;

    @Parameterized.Parameters
    public static Collection<String[]> getParameters() {
        return Arrays.asList(
                new String[][] {
                        {"Luke", "Luke"}, //expected, param
                        {"Matthew", "Matthew"}, //expected, param
                        {"Jack", "Jack"}  //expected, param
                }
        );
    }


    private String expected;
    private String param;

    public TutorTest5(String expected, String param) {
        this.expected = expected;
        this.param = param;
    }

    @Before
    public void before() {
        tryoutService = TryoutServiceFactory.getService();
    }

    @Test
    public void test() {
        UserVO user = new UserVO();
        user.setUserName(param);
        user.setUserPw(RandomStringUtils.randomAlphabetic(32));
        user.setUserPic(RandomStringUtils.randomAlphabetic(32));
        tryoutService.insertUser(user);

        logger.debug("DEBUG");
        assertEquals(expected, tryoutService.getUserByNO(user.getUserNo()).getUserName());

        logger.info("COMPLETED");
    }

}
