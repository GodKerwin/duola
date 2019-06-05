package com.xul.duola.quartz.task;

import org.springframework.stereotype.Component;

/**
 * 定时任务调度测试
 * 
 * Created by lxu on 2019/06/03.
 */
@Component("duoLaTask")
public class DuoLaTask
{
    public void duoLaParams(String params)
    {
        System.out.println("执行有参方法：" + params);
    }

    public void duoLaNoParams()
    {
        System.out.println("执行无参方法");
    }
}
