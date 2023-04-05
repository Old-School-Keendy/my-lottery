package cn.keendy.lottery.rpc;

import cn.keendy.lottery.rpc.req.ActivityReq;
import cn.keendy.lottery.rpc.res.ActivityRes;


public interface IActivityBooth {

    ActivityRes queryActivityById(ActivityReq req);

}
