package com.atguigu.task.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author yangchen
 * @version v1.0
 * @date 2020/4/22 23:54
 */

@Service
public class ScheduledService {

    /**
     * second(秒), minute(分), hour(时), day of month(日), month(月), and day of week(周几).
     * {@code "0 * * * * MON-FRI"}
     *
     * ,	枚举
     * -	区间
     * *	任意
     * /	步长
     * ?	日/星期冲突匹配
     * L	最后
     * W	工作日
     * C	和calendar联系后计算过的值
     * #	星期，4#2，第2个星期四
     *
     *  秒	0-59	, - * /
     *  分	0-59	, - * /
     * 小时	0-23	, - * /
     * 日期	1-31	, - * ? / L W C
     * 月份	1-12	, - * /
     * 星期	0-7或SUN-SAT 0,7是SUN	, - * ? / L C #
     *
     * 【0 0/5 14,18 * * ?】 每天14点整，和18点整，每隔5分钟执行一次
     * 【0 15 10 ? * 1-6】每个月的周一至周六10:15分执行一次
     * 【0 0 2 ? * 6L】每个月的最后一个周六凌晨2点执行一次
     * 【0 0 2 LW * ?】每个月的最后一个工作日凌晨2点执行一次
     * 【0 0 2-4 ？ * 1#1】每个月的第一个周一凌晨2点到4点期间，每个整点都执行一次；
     */
    //@Scheduled(cron = "0 * * * * MON-FRI")
    //@Scheduled(cron = "0,1,2,3,4 * * * * MON-FRI")
    //@Scheduled(cron = "0-4 * * * * MON-FRI")
    @Scheduled(cron = "0/4 * * * * MON-FRI") //每4秒执行一次
    public void hello(){
        System.out.println("hello ...");
    }

}
