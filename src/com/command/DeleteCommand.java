package com.command;

import com.recive.Reciver;

/**
 * �����������
 * ��������ִ���߶��󣬵�������ִ����ִ�о�������
 *
 */
public class DeleteCommand implements Command {
	private Reciver reciver;
	public DeleteCommand(Reciver reciver){
		this.reciver = reciver;
	}
	
	@Override
	public void executeCommand() {
		System.out.println("����ɾ��������ҵ���ɾ������ִ����ִ��ɾ������");
		this.reciver.reciverAct();
	}

}
