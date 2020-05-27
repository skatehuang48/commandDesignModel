package com.invoker;

import com.command.Command;

/**
 * ���������
 * ����������� ͨ�������������ʵ����������ִ���߷������
 */
public class Invoker {
	private Command command;
	public void setCommand(Command command){
		this.command = command;
	}
	
	public void sendRequesCommand(){
		System.out.println("������������ߣ����;���������������");
		this.command.executeCommand();
	}
}
