package cn.mlgj.artisticconception.service.impl;

import cn.mlgj.artisticconception.entity.ArtArticle;
import cn.mlgj.artisticconception.entity.ArtUserinfo;
import cn.mlgj.artisticconception.mapper.ArtArticleMapper;
import cn.mlgj.artisticconception.service.IArtArticleService;
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
public class ArtArticleServiceImpl extends ServiceImpl<ArtArticleMapper, ArtArticle> implements IArtArticleService  {

    @Resource
    ArtArticleMapper artArticleMapper;

    @Override
    public int publishArticle(Integer userId, String title, String articleContent, String cover) {
        return artArticleMapper.publishArticle(userId,title,articleContent,cover);
    }

    @Override
    public List<ArtArticle> getNewestArticle() {
        return artArticleMapper.getNewestArticle();
    }

    @Override
    public List<ArtArticle> getHottesttArticle() {
        return artArticleMapper.getHottesttArticle();
    }

    @Override
    public List<ArtArticle> getBrowseArticle() {
        return artArticleMapper.getBrowseArticle();
    }

    @Override
    public int fabulousArtcle(Integer id) {
        return artArticleMapper.fabulousArtcle(id);
    }

    @Override
    public int browseArtcle(Integer id) {
        return artArticleMapper.browseArtcle(id);
    }

    @Override
    public ArtArticle findById(Integer id) {
        return artArticleMapper.findById(id);
    }

    @Override
    public ArtUserinfo findByUserId(Integer userId) {
        return artArticleMapper.findByUserId(userId);
    }

    @Override
    public List<ArtArticle> findList(Integer currPageNo, Integer pageSize) {
        return artArticleMapper.findList(currPageNo,pageSize);
    }

    @Override
    public int getTotalCount() {
        return artArticleMapper.getTotalCount();
    }

    @Override
    public ArtArticle getPrevArticle(Integer id) {
        return artArticleMapper.getPrevArticle(id);
    }

    @Override
    public ArtArticle getNextArticle(Integer id) {
        return artArticleMapper.getNextArticle(id);
    }

    @Override
    public Integer getMinArtcleId() {
        return artArticleMapper.getMinArtcleId();
    }

    @Override
    public Integer getMaxArtcleId() {
        return artArticleMapper.getMaxArtcleId();
    }

    @Override
    public ArtArticle getFirstArticle() {
        return artArticleMapper.getFirstArticle();
    }

    @Override
    public ArtArticle getLastArticle() {
        return artArticleMapper.getLastArticle();
    }
}
