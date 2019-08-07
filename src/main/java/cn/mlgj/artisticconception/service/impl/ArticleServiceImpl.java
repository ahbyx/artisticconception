package cn.mlgj.artisticconception.service.impl;

import cn.mlgj.artisticconception.entity.Article;
import cn.mlgj.artisticconception.mapper.ArticleMapper;
import cn.mlgj.artisticconception.service.IArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zjh
 * @since 2019-08-07
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {

}
