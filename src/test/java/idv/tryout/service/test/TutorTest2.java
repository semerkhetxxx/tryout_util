package idv.tryout.service.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import idv.tryout.model.UserVO;
import idv.tryout.service.TryoutService;
import idv.tryout.service.TryoutServiceFactory;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-hikari-ctx.xml")
public class TutorTest2 extends SqlSessionDaoSupport {

    TryoutService tryoutService;



    @Before
    public void before() {
        tryoutService = TryoutServiceFactory.getService();

    }

    @Test
    public void test(){
        UserVO uv = (UserVO) getSqlSessionTemplate().selectOne("getUserByNo", 1);
        System.out.println(uv.getUserName());
//        UserVO user = new UserVO();
//        user.setUserName(RandomStringUtils.randomAlphabetic(32));
//        user.setUserPw(RandomStringUtils.randomAlphabetic(32));
//        user.setUserPic(RandomStringUtils.randomAlphabetic(32));
//        tryoutService.insertUser(user);

    }






    @After
    public void after() {
        tryoutService = null;
    }

}
