package com.invoker;

import com.command.Command;

/**
 * 命令调用者
 * 调用命令对象 通过接受命令对象实现请求者与执行者分离解耦
 */
public class Invoker {
	private Command command;
	public void setCommand(Command command){
		this.command = command;
	}
	
	public void sendRequesCommand(){
		System.out.println("我是命令调用者，发送具体的命令调用请求");
		this.command.executeCommand();
	}
}
