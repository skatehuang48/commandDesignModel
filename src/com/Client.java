package com;

import com.command.AddCommand;
import com.command.Command;
import com.command.DeleteCommand;
import com.invoker.Invoker;
import com.recive.AddReciver;
import com.recive.DeleteReciver;

public class Client {
	public static void main(String[] args) {
		//ɾ���������
		Command deleteCommand = new DeleteCommand(new DeleteReciver());
		//����������
		Command addCommand = new AddCommand(new AddReciver());
		//������
		Invoker invoke = new Invoker();
		//�����������
		invoke.setCommand(addCommand);
		invoke.sendRequesCommand();
		//����ɾ������
		invoke.setCommand(deleteCommand);
		invoke.sendRequesCommand();
	}
}
