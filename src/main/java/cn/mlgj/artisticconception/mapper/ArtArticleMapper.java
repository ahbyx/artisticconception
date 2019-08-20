package cn.mlgj.artisticconception.mapper;

import cn.mlgj.artisticconception.entity.ArtArticle;
import cn.mlgj.artisticconception.entity.ArtUserinfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 *  文章
 * </p>
 *
 * @author zjh
 * @since 2019-08-07
 */
public interface ArtArticleMapper extends BaseMapper<ArtArticle> {
    /**
     * 发布文章
     * @param userId
     * @param title
     * @param articleContent
     * @param cover
     * @return
     */
    int publishArticle(@Param("userId") Integer userId,@Param("title") String title,@Param("articleContent")  String articleContent, @Param("cover") String cover);


    List<ArtArticle> findList(@Param("currPageNo") Integer currPageNo,@Param("pageSize") Integer pageSize);

    int getTotalCount();
    /**
     * 获取最新的文章
     * @return
     */
    List<ArtArticle> getNewestArticle();

    /**
     * 获取最热的文章
     * @return
     */
    List<ArtArticle> getHottesttArticle();

    /**
     * 获取浏览次数最多的文章
     * @return
     */
    List<ArtArticle> getBrowseArticle();

    /**
     * 赞文章
     * @param id
     * @return
     */
    int fabulousArtcle(@Param("id") Integer id);

    /**
     * 浏览文章
     * @param id
     * @return
     */
    int browseArtcle(@Param("id") Integer id);


    /**
     * 根据id获取文章
     * @param id
     * @return
     */
    ArtArticle findById(@Param("id") Integer id);

    /**
     * 根据userId获取用户信息
     * @param userId
     * @return
     */
    ArtUserinfo findByUserId(@Param("userId") Integer userId);

    /**
     * 根据id获取上一篇文章
     * @param id
     * @return
     */
    ArtArticle getPrevArticle(@Param("id") Integer id);

    /**
     * 根据id获取下一篇文章
     * @param id
     * @return
     */
    ArtArticle getNextArticle(@Param("id") Integer id);

    /**
     * 获取最小文章id
     * @return
     */
    Integer getMinArtcleId();

    /**
     * 获取最大文章id
     * @return
     */
    Integer getMaxArtcleId();

    /**
     * 获取第一篇文章
     * @return
     */
    ArtArticle getFirstArticle();

    /**
     * 获取最后一篇文章
     * @return
     */
    ArtArticle getLastArticle();
}
