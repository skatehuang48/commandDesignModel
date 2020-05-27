package com.command;

import com.recive.Reciver;

/**
 * 具体命令对象
 * 接收命令执行者对象，调用命令执行者执行具体命令
 *
 */
public class DeleteCommand implements Command {
	private Reciver reciver;
	public DeleteCommand(Reciver reciver){
		this.reciver = reciver;
	}
	
	@Override
	public void executeCommand() {
		System.out.println("我是删除命令，由我调用删除命令执行者执行删除命令");
		this.reciver.reciverAct();
	}

}
