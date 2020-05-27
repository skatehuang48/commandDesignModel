package com.recive;
/**
 * 具体的命令执行者对象
 * @author Administrator
 *
 */
public class AddReciver implements Reciver {

	@Override
	public void reciverAct() {
		System.out.println("我是添加命令执行者，执行添加命令");
	}

}
