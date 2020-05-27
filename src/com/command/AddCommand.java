package com.command;

import com.recive.Reciver;

/**
 * 具体命令对象
 * 接收命令执行者对象，调用执行者执行具体命令
 *
 */
public class AddCommand implements Command {
	private Reciver reciver;
	public AddCommand(Reciver reciver){
		this.reciver = reciver;
	}
	@Override
	public void executeCommand() {
		System.out.println("我是添加命令，由我调用添加命令执行者执行命令");
		this.reciver.reciverAct();
	}

}
