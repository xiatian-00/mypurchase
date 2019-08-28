package com.shop.purchase.quartz;
/**
 * @author summer
 * @date 2019/8/23 9:20
 */

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * 一个任务，由quartz定时的执行
 */
public class MySampleJob extends QuartzJobBean {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("redis定时任务执行了....."+name);
    }
}
