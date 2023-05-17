package cn.keendy.lottery.infrastructure.po;

import java.math.BigDecimal;

import lombok.Data;
import lombok.ToString;

/**
 * @author wangdezhao
 * @date 2023/4/25
 * @description
 */
@Data
@ToString
public class StrategyDetail {
    // 自增ID
    private String id;

    // 策略ID
    private Long strategyId;

    // 奖品ID
    private Long awardId;

    // 奖品数量
    private String awardCount;

    // 中奖概率
    private BigDecimal awardRate;

    // 创建时间
    private String createTime;

    // 修改时间
    private String updateTime;
}
