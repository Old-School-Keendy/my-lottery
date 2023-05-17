package cn.keendy.lottery.infrastructure.dao;

import cn.keendy.lottery.infrastructure.po.Award;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author wangdezhao
 * @date 2023/4/25
 * @description
 */
@Mapper
public interface IAwardDao {

    Award selectOneById(Long id);

    Award selectOneByAwardId(Long awardId);
}
