package idv.tryout.dao;


import idv.tryout.model.UserVO;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Component;

@Component("userDao")
public class UserDAO extends SqlSessionDaoSupport{
	
    public UserVO getUserByNo(int userNo) {
        return (UserVO) getSqlSessionTemplate().selectOne("getUserByNo", userNo);
    }
    
    public UserVO getUserByName(String userName) {
        return (UserVO) getSqlSessionTemplate().selectOne("getUserByName", userName);
    }
  
    public List<UserVO> getAllUsers() {
        return getSqlSessionTemplate().selectList("getAllUsers");
    }
  
    public int insertUser(UserVO userVO) {
        return getSqlSessionTemplate().insert("insertUser",userVO);
    }
    
    public int updateUser(UserVO userVO) {
        return getSqlSessionTemplate().update("updateUser",userVO);
    }
    
    public int deleteUser(int atcId) {
        return getSqlSessionTemplate().delete("deleteUser",atcId);
    }  

}
