package cn.mlgj.artisticconception.mapper;

import cn.mlgj.artisticconception.entity.ArtUserinfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zjh
 * @since 2019-08-07
 */
public interface ArtUserinfoMapper extends BaseMapper<ArtUserinfo> {

    int addUserInfo(@Param("userId") Integer userId, @Param("name") String name);

}
