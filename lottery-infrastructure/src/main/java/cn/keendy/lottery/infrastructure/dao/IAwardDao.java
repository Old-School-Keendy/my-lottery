package cn.keendy.lottery.infrastructure.dao;

import cn.keendy.lottery.infrastructure.po.Award;

/**
 * @author wangdezhao
 * @date 2023/4/25
 * @description
 */
public interface IAwardDao {

    Award selectOneById(Long id);

    Award selectOneByAwardId(Long awardId);
}
