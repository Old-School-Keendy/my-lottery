package cn.keendy.lottery.interfaces;

import javax.annotation.Resource;

import cn.keendy.lottery.infrastructure.po.Activity;
import cn.keendy.lottery.rpc.IActivityBooth;
import cn.keendy.lottery.rpc.req.ActivityReq;
import cn.keendy.lottery.rpc.res.ActivityRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangdezhao
 * @date 2023/4/6
 * @description
 */
@RestController
public class Test {

    @Autowired
    private IActivityBooth activityBooth;

    @PostMapping(value = "/xxx")
    public void xxx(){
        ActivityReq req = new ActivityReq();
        req.setActivityId(100001L);
        ActivityRes activityRes = activityBooth.queryActivityById(req);
        System.out.println(activityRes);
    }
}
