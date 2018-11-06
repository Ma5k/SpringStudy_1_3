package com.wisely.highlight_spring4.ch3.taskscheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 从Spring3.1开始，计划任务在Spring中的实现变得异常的简单。
 * 首先通过在配置类注解@EnableScheduling来开启对计划任务的支持，
 * 然后在要执行计划任务的方法上注解@Scheduled，声明这是一个计划任务。
 * Spring通过@Scheduled支持多种类型的计划任务，包括cron、fixDelay、fixRate等。
 * @author Mask
 *
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
	}
}
