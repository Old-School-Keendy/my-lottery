package cn.keendy.lottery.infrastructure.po;

import java.util.Date;

import lombok.Data;

/**
 * @author wangdezhao
 * @date 2023/4/25
 * @description
 */
@Data
public class Award {
    // 自增ID
    private Long id;

    // 奖品ID
    private Long awardId;

    // 奖品类型（文字描述、兑换码、优惠券、实物奖品暂无）
    private Integer awardType;

    // 奖品数量
    private Integer awardCount;

    // 奖品名称
    private String awardName;

    // 奖品内容「文字描述、Key、码」
    private String awardContent;

    // 创建时间
    private Date createTime;

    // 修改时间
    private Date updateTime;
}
