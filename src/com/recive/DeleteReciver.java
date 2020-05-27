package com.recive;
/**
 * 具体的命令执行者对象
 * @author Administrator
 *
 */
public class DeleteReciver implements Reciver {

	@Override
	public void reciverAct() {
		System.out.println("我是删除命令执行者，执行删除命令");
	}

}
