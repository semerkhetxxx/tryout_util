package idv.tryout.service;

import idv.tryout.model.ArticleVO;
import idv.tryout.model.ReplyVO;
import idv.tryout.model.UserVO;

import java.util.List;
import java.util.Map;

public interface TryoutService {
    
    //Article
    public List<ArticleVO> getAllArticles();
    
    public List<Map<String,String>> getArticleWallInfoByUser(Integer atcAuther);
    
    public ArticleVO getArticleById(Integer atcId);
    
    public ArticleVO getArticleByTitle(String atcTitle);
    
    public List<ArticleVO> getArticleByUser(Integer userNo);
    
    public int insertArticle(ArticleVO articleVO);
    
    public int updateArticle(ArticleVO articleVO);
    
    public int deleteArticle(Integer atcId);
    
    //Reply
    public List<ReplyVO> getAllReplies();
    
    public List<ReplyVO> getReplyByAtc(Integer atcId);    
    
    public int insertReply(ReplyVO rpyVO);
    
    public int updateReply(ReplyVO rpyVO);
    
    public int deleteReply(Integer replyId);
    
    //User
    public List<UserVO> getAllUsers();
    
    public UserVO getUserByNO(int userNo);
    
    public UserVO getUserByName(String userName);
    
    public int insertUser(UserVO userVO);
    
    public int updateUser(UserVO userVO);
    
    public int deleteUser(Integer userNo);

}
