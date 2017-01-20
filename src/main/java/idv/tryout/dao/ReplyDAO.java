package idv.tryout.dao;



import idv.tryout.model.ReplyVO;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Component;

@Component("replyDao")
public class ReplyDAO extends SqlSessionDaoSupport {
    
    public List<ReplyVO> getReplyByAtc(Integer replyAtc) {
        return getSqlSessionTemplate().selectList("getReplyByAtc", replyAtc);
    }
  
    public List<ReplyVO> getAllReplies() {
        return getSqlSessionTemplate().selectList("getAllReplies");
    }
  
    public int insertReply(ReplyVO replyVO) {
        return getSqlSessionTemplate().insert("insertReply",replyVO);
    }
    
    public int updateReply(ReplyVO replyVO) {
        return getSqlSessionTemplate().update("updateReply",replyVO);
    }
    
    public int deleteReply(int atcId) {
        return getSqlSessionTemplate().delete("deleteReply",atcId);
    }  

}
