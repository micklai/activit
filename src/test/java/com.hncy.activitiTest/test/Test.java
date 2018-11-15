package com.hncy.activitiTest.test;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.junit.Before;

public class Test {

	public static void main(String[] args) {
		ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();

	}

	private ProcessEngine processEngine;

	@Before
	public void before(){
		processEngine = ProcessEngines.getDefaultProcessEngine();
	}

	@org.junit.Test
	public void test1(){
		System.out.println(processEngine);
	}

}
