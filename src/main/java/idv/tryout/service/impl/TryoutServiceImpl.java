package idv.tryout.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import idv.tryout.dao.ArticleDAO;
import idv.tryout.dao.ReplyDAO;
import idv.tryout.dao.UserDAO;
import idv.tryout.model.ArticleVO;
import idv.tryout.model.ReplyVO;
import idv.tryout.model.UserVO;
import idv.tryout.service.TryoutService;

public class TryoutServiceImpl implements TryoutService {
    @Autowired
    public UserDAO userDao;

    @Autowired
    public ArticleDAO atcDao;

    @Autowired
    public ReplyDAO replyDao;
//    private UserDAO userDao;
//
//
//    private ArticleDAO atcDao;
//
//
//    private ReplyDAO replyDao;

    //DAO getter setter
//    public UserDAO getUserDao() {
//        return userDao;
//    }
//    public void setUserDao(UserDAO userDao) {
//        this.userDao = userDao;
//    }
//    public ArticleDAO getAtcDao() {
//        return atcDao;
//    }
//    public void setAtcDao(ArticleDAO atcDao) {
//        this.atcDao = atcDao;
//    }
//    public ReplyDAO getReplyDao() {
//        return replyDao;
//    }
//    public void setReplyDao(ReplyDAO replyDao) {
//        this.replyDao = replyDao;
//    }
    //DAO getter setter

    //Article
    @Override
    public List<ArticleVO> getAllArticles() {        
        return atcDao.getAllArticles();
    }
    
    @Override
    public List<Map<String, String>> getArticleWallInfoByUser(Integer atcAuther) {
        return atcDao.getArticleWallInfoByUser(atcAuther);
    }
    
    @Override
    public ArticleVO getArticleById(Integer atcId) {
        return atcDao.getArticleById(atcId);
    }

    @Override
    public ArticleVO getArticleByTitle(String atcTitle) {
        return atcDao.getArticleByTitle(atcTitle);
    }

    @Override
    public List<ArticleVO> getArticleByUser(Integer userNo) {
        return atcDao.getArticleByUser(userNo);
    }

    @Override
    public int insertArticle(ArticleVO articleVO) {
        return atcDao.insertArticle(articleVO);
    }

    @Override
    public int updateArticle(ArticleVO articleVO) {
        return atcDao.updateArticle(articleVO);
    }

    @Override
    public int deleteArticle(Integer atcId) {
        return atcDao.deleteArticle(atcId);
    }
    
    //replyDao
    @Override
    public List<ReplyVO> getAllReplies() {
        return replyDao.getAllReplies();
    }

    @Override
    public List<ReplyVO> getReplyByAtc(Integer atcId) {
        return replyDao.getReplyByAtc(atcId);
    }

    @Override
    public int insertReply(ReplyVO rpyVO) {
        return replyDao.insertReply(rpyVO);
    }

    @Override
    public int updateReply(ReplyVO rpyVO) {
        return replyDao.updateReply(rpyVO);
    }

    @Override
    public int deleteReply(Integer replyId) {
        return replyDao.deleteReply(replyId);
    }
    
    //User
    @Override
    public List<UserVO> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public UserVO getUserByNO(int userNo) {
        return userDao.getUserByNo(userNo);
    }

    @Override
    public UserVO getUserByName(String userName) {
        return userDao.getUserByName(userName);
    }

    @Override
    public int insertUser(UserVO userVO) {
        return userDao.insertUser(userVO);
    }

    @Override
    public int updateUser(UserVO userVO) {
        return userDao.updateUser(userVO);
    }

    @Override
    public int deleteUser(Integer userNo) {
        return userDao.deleteUser(userNo);
    }

}
