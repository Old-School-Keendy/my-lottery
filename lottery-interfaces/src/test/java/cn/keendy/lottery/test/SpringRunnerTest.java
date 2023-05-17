package cn.keendy.lottery.test;

import java.util.List;

import javax.annotation.Resource;

import cn.keendy.lottery.infrastructure.dao.IStrategyDetailsDao;
import cn.keendy.lottery.infrastructure.po.StrategyDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author wangdezhao
 * @date 2023/5/17
 * @description
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration
public class SpringRunnerTest {
    private Logger logger = LoggerFactory.getLogger(SpringRunnerTest.class);

    @Resource
    private IStrategyDetailsDao strategyDetailDao;

    @Test
    public void test_select() {
        List<StrategyDetail> strategyDetails = strategyDetailDao.selectListByStrategyId(10001L);
        for (StrategyDetail detail : strategyDetails) {
            logger.info(detail.toString());
        }
    }
}
