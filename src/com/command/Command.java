package com.command;
/**
 * 抽象命令类 定义命令执行接口
 * 将命令请求者与命令执行者分离 解耦合
 *
 */
public interface Command {
	public void executeCommand();
}
