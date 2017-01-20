package idv.tryout.service.test;

import idv.tryout.model.UserVO;
import idv.tryout.service.TryoutService;
import idv.tryout.service.TryoutServiceFactory;
import org.apache.commons.lang.RandomStringUtils;
import org.junit.Test;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class TutorTest1 {

    @Test
    public void test(){
        TryoutService tryoutService = TryoutServiceFactory.getService();

        UserVO user = new UserVO();
        user.setUserName(RandomStringUtils.randomAlphabetic(32));
        user.setUserPw(RandomStringUtils.randomAlphabetic(32));
        user.setUserPic(RandomStringUtils.randomAlphabetic(32));

        tryoutService.insertUser(user);

        System.out.println(tryoutService.getUserByNO(user.getUserNo()).getUserName());
    }

    @Test
    public void testSerno(){
        Random r = new Random();
        StringBuilder sb = null;
        String alphabet = "1234567890abcdefghijklmnopqurstuvwxyz";

        Set set = new HashSet<String>();

        for (int i = 0; i <20000; i++ ) {
            sb = new StringBuilder();
            for (int j = 0; j < 7; j++) {

                sb.append(alphabet.charAt(r.nextInt(alphabet.length())));
            }

            if (set.add(sb)) {
                System.out.println(sb.toString());
            } else {
                i--;
            }

        }


    }

}
