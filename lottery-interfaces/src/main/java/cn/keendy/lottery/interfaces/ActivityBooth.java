package cn.keendy.lottery.interfaces;

import javax.annotation.Resource;

import cn.keendy.lottery.common.Constants;
import cn.keendy.lottery.common.Result;
import cn.keendy.lottery.infrastructure.dao.IActivityDao;
import cn.keendy.lottery.infrastructure.po.Activity;
import cn.keendy.lottery.rpc.IActivityBooth;
import cn.keendy.lottery.rpc.dto.ActivityDto;
import cn.keendy.lottery.rpc.req.ActivityReq;
import cn.keendy.lottery.rpc.res.ActivityRes;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

/**
 * @author wangdezhao
 * @date 2023/4/5
 * @description 活动展台
 */
@DubboService
@Component
public class ActivityBooth implements IActivityBooth {
    @Resource
    private IActivityDao activityDao;

    @Override
    public ActivityRes queryActivityById(ActivityReq req) {
        Activity activity = activityDao.selectOneByActivityId(req.getActivityId());

        ActivityDto activityDto = new ActivityDto();
        activityDto.setActivityId(activity.getActivityId());
        activityDto.setActivityName(activity.getActivityName());
        activityDto.setActivityDesc(activity.getActivityDesc());
        activityDto.setBeginDateTime(activity.getBeginDateTime());
        activityDto.setEndDateTime(activity.getEndDateTime());
        activityDto.setStockCount(activity.getStockCount());
        activityDto.setTakeCount(activity.getTakeCount());

        return new ActivityRes(new Result(Constants.ResponseCode.SUCCESS.getCode(), Constants.ResponseCode.SUCCESS.getInfo()), activityDto);

    }
}
