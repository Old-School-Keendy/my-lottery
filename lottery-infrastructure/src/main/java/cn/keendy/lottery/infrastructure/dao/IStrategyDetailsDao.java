package cn.keendy.lottery.infrastructure.dao;

import java.util.List;

import cn.keendy.lottery.infrastructure.po.StrategyDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author wangdezhao
 * @date 2023/4/25
 * @description
 */
@Mapper
public interface IStrategyDetailsDao {
    List<StrategyDetail> selectListByStrategyId(@Param("strategyId") Long strategyId);
}
