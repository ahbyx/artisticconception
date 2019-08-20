package cn.mlgj.artisticconception.service.impl;

import cn.mlgj.artisticconception.entity.ArtReply;
import cn.mlgj.artisticconception.mapper.ArtReplyMapper;
import cn.mlgj.artisticconception.service.IArtReplyService;
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
public class ArtReplyServiceImpl extends ServiceImpl<ArtReplyMapper, ArtReply> implements IArtReplyService {

    @Resource
    ArtReplyMapper artReplyMapper;

    @Override
    public List<ArtReply> getAllReplyByCommentId() {
        return artReplyMapper.getAllReplyByCommentId();
    }

    @Override
    public int reply(Integer replyUserid, String replyContent, Integer commentid) {
        return artReplyMapper.reply(replyUserid,replyContent,commentid);
    }
}
