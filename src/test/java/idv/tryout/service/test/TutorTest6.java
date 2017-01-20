package idv.tryout.service.test;

import idv.tryout.model.UserVO;
import idv.tryout.service.TryoutService;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-hikari-ctx.xml")
public class TutorTest6 {


    private Logger logger = Logger.getLogger(TutorTest6.class);

    @Autowired
    TryoutService tryoutService;


    public void insert() {


        UserVO user = new UserVO();
        user.setUserName(RandomStringUtils.randomAlphabetic(32));
        user.setUserPw(RandomStringUtils.randomAlphabetic(32));
        user.setUserPic(RandomStringUtils.randomAlphabetic(32));
        tryoutService.insertUser(user);
        logger.debug("finish!");
        //Random ran = new Random();
        //tryoutService.getUserByNO(ran.nextInt(100000)+1);
    }

    //@Ignore
    @Test
    public void test(){

        List<String> list = new ArrayList<String>();

        for(int i=0;i<100;i++){
            list.add("");
        }

        list.parallelStream().forEach(x->insert());


    }

}
