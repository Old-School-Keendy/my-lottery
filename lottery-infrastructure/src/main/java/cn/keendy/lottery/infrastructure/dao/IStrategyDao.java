package cn.keendy.lottery.infrastructure.dao;

import java.util.List;

import cn.keendy.lottery.infrastructure.po.Strategy;
import org.apache.ibatis.annotations.Param;

/**
 * @author wangdezhao
 * @date 2023/4/25
 * @description
 */
public interface IStrategyDao {
    List<Strategy> selectOneByStrategyId(@Param("strategyId") Long strategyId);
}
