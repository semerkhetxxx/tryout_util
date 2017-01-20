package idv.tryout.mapper;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import idv.tryout.model.UserVO;

public interface UserMapper {
    @Results({ 
        @Result(property = "userNo", column = "eu_id"),
        @Result(property = "userName", column = "eu_name"),
        @Result(property = "userPw", column = "eu_password"),
        @Result(property = "userPic", column = "eu_image")
    })
    @Select("select * from exe_users where eu_id = #{userNo}")
    UserVO getUserByNo(int no);

}
