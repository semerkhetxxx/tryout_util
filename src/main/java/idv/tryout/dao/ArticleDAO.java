package idv.tryout.dao;

import java.util.List;
import java.util.Map;

import idv.tryout.model.ArticleVO;





import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Component;


@Component("atcDao")
public class ArticleDAO extends SqlSessionDaoSupport {
    
    public ArticleVO getArticleById(Integer atcId) {
//        Map paraMap = new HashMap();
//        paraMap.put("eventId", eventId);
//        paraMap.put("serno", serno);
        return (ArticleVO) getSqlSessionTemplate().selectOne("getArticleById", atcId);
    }
    
    public List<ArticleVO> getArticleByUser(Integer atcAuther) {
        return getSqlSessionTemplate().selectList("getArticleByUser", atcAuther);
    }
    
    public List<Map<String,String>> getArticleWallInfoByUser(Integer atcAuther) {
        return getSqlSessionTemplate().selectList("getArticleWallInfoByUser", atcAuther);
    }
    
    public ArticleVO getArticleByTitle(String atcTitle) {
        return (ArticleVO) getSqlSessionTemplate().selectOne("getArticleByTitle", atcTitle);
    }
    
    public List<ArticleVO> getAllArticles() {
        return getSqlSessionTemplate().selectList("getAllArticles");
    }
    
    public int insertArticle(ArticleVO articleVO) {
        return getSqlSessionTemplate().insert("insertArticle",articleVO);
    }
    
    public int updateArticle(ArticleVO articleVO) {
        return getSqlSessionTemplate().update("insertArticle",articleVO);
    }
    
    public int deleteArticle(int atcId) {
        return getSqlSessionTemplate().delete("deleteArticle",atcId);
    }
}
