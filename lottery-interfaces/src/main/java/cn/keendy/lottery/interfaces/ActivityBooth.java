package cn.keendy.lottery.interfaces;

import javax.annotation.Resource;

import cn.itedus.lottery.common.Constants;
import cn.itedus.lottery.common.Result;
import cn.itedus.lottery.infrastructure.dao.IActivityDao;
import cn.itedus.lottery.infrastructure.po.Activity;
import cn.itedus.lottery.rpc.IActivityBooth;
import cn.itedus.lottery.rpc.dto.ActivityDto;
import cn.itedus.lottery.rpc.req.ActivityReq;
import cn.itedus.lottery.rpc.res.ActivityRes;
import org.springframework.stereotype.Service;

/**
 * @author wangdezhao
 * @date 2023/4/5
 * @description 活动展台
 */
@Service
public class ActivityBooth implements IActivityBooth {
    @Resource
    private IActivityDao activityDao;

    @Override
    public ActivityRes queryActivityById(ActivityReq req) {
        Activity activity = activityDao.queryActivityById(req.getActivityId());

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