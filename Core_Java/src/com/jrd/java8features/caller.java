package com.jrd.java8features;

import java.util.concurrent.Executor;

class caller implements Executor
{

	@Override
	public void execute(Runnable runnable) 
	{
		runnable.run();
	}
	
}