package cn.keendy.lottery.infrastructure.dao;

import cn.keendy.lottery.infrastructure.po.Activity;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface IActivityDao {

   void insert(Activity activity);

   Activity selectOneByActivityId(Long activityId);

}
