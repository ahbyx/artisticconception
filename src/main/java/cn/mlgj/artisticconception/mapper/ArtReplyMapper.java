package cn.mlgj.artisticconception.mapper;

import cn.mlgj.artisticconception.entity.ArtReply;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zjh
 * @since 2019-08-07
 */
public interface ArtReplyMapper extends BaseMapper<ArtReply> {
    List<ArtReply> getAllReplyByCommentId();

    int reply(@Param("replyUserid") Integer replyUserid,@Param("replyContent") String replyContent,@Param("commentid") Integer commentid);
}
