package cn.mlgj.artisticconception.service.impl;

import cn.mlgj.artisticconception.entity.Comment;
import cn.mlgj.artisticconception.mapper.CommentMapper;
import cn.mlgj.artisticconception.service.ICommentService;
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
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {

}
