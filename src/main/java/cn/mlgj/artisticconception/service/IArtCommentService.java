package cn.mlgj.artisticconception.service;

import cn.mlgj.artisticconception.entity.ArtComment;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zjh
 * @since 2019-08-07
 */
public interface IArtCommentService extends IService<ArtComment> {

    Integer getCommentCount( Integer articleid);

    List<ArtComment> getCommentByArticleId(Integer articleid);

    Integer commentArticle(Integer userId,String content,Integer articleid);

    ArtComment getLastCommentByArticleId( Integer articleid);
}
