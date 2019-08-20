package cn.mlgj.artisticconception.mapper;

import cn.mlgj.artisticconception.entity.ArtComment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 *  评论
 * </p>
 *
 * @author zjh
 * @since 2019-08-07
 */
public interface ArtCommentMapper extends BaseMapper<ArtComment> {
    /**
     * 根据文章获取所有评论
     * @return
     */
    Integer getCommentCount(@Param("articleid") Integer articleid);

    List<ArtComment> getCommentByArticleId(@Param("articleid") Integer articleid);

    Integer commentArticle(@Param("userId")Integer userId,@Param("content")String content,@Param("articleid")Integer articleid);

    ArtComment getLastCommentByArticleId(@Param("articleid") Integer articleid);
}
