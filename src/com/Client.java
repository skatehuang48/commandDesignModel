package com;

import com.command.AddCommand;
import com.command.Command;
import com.command.DeleteCommand;
import com.invoker.Invoker;
import com.recive.AddReciver;
import com.recive.DeleteReciver;

public class Client {
	public static void main(String[] args) {
		//删除命令对象
		Command deleteCommand = new DeleteCommand(new DeleteReciver());
		//添加命令对象
		Command addCommand = new AddCommand(new AddReciver());
		//调用者
		Invoker invoke = new Invoker();
		//调用添加命令
		invoke.setCommand(addCommand);
		invoke.sendRequesCommand();
		//调用删除命令
		invoke.setCommand(deleteCommand);
		invoke.sendRequesCommand();
	}
}
