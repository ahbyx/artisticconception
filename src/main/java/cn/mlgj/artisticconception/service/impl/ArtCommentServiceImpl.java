package cn.mlgj.artisticconception.service.impl;

import cn.mlgj.artisticconception.entity.ArtComment;
import cn.mlgj.artisticconception.mapper.ArtCommentMapper;
import cn.mlgj.artisticconception.service.IArtCommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zjh
 * @since 2019-08-07
 */
@Service
public class ArtCommentServiceImpl extends ServiceImpl<ArtCommentMapper, ArtComment> implements IArtCommentService {

    @Resource
    ArtCommentMapper artCommentMapper;

    @Override
    public Integer getCommentCount(Integer articleid) {
        return artCommentMapper.getCommentCount(articleid);
    }

    @Override
    public List<ArtComment> getCommentByArticleId(Integer articleid) {
        return artCommentMapper.getCommentByArticleId(articleid);
    }

    @Override
    public Integer commentArticle(Integer userId, String content, Integer articleid) {
        return artCommentMapper.commentArticle(userId,content,articleid);
    }

    @Override
    public ArtComment getLastCommentByArticleId(Integer articleid) {
        return artCommentMapper.getLastCommentByArticleId(articleid);
    }
}
