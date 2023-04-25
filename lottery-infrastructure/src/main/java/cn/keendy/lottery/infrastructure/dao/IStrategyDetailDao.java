package cn.keendy.lottery.infrastructure.dao;

import java.util.List;

import cn.keendy.lottery.infrastructure.po.StrategyDetail;
import org.apache.ibatis.annotations.Param;

/**
 * @author wangdezhao
 * @date 2023/4/25
 * @description
 */
public interface IStrategyDetailDao {
    List<StrategyDetail> selectListByStrategyId(@Param("strategyId") Long strategyId);
}
