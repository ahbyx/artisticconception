package cn.mlgj.artisticconception.service;

import cn.mlgj.artisticconception.entity.ArtReply;
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
public interface IArtReplyService extends IService<ArtReply> {
    List<ArtReply> getAllReplyByCommentId();
    int reply(@Param("replyUserid") Integer replyUserid,@Param("replyContent") String replyContent,@Param("commentid") Integer commentid);
}
