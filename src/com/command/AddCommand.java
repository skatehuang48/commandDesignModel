package com.command;

import com.recive.Reciver;

/**
 * �����������
 * ��������ִ���߶��󣬵���ִ����ִ�о�������
 *
 */
public class AddCommand implements Command {
	private Reciver reciver;
	public AddCommand(Reciver reciver){
		this.reciver = reciver;
	}
	@Override
	public void executeCommand() {
		System.out.println("�������������ҵ����������ִ����ִ������");
		this.reciver.reciverAct();
	}

}
