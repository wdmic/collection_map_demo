package com.imooc.collection;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {
	/**
	 * 带有泛型course 的list
	 */
	public List<Course> courses;
	
	public TestGeneric() {
		this.courses = new ArrayList<Course>();
	}
	
	public void testAdd() {
		Course course1 = new Course("1", "大学语文");
		courses.add(course1);
		//泛型集合中不能添加泛型规定类型及其子类型以外的对象
//		courses.add("添加其他奇怪的东西");
		Course course2 = new Course("2", "计算机网络");
		courses.add(course2);
	}
	
	public void testForEach() {
		System.out.println("课程如下：");
		for(Course course : courses) {
			System.out.println(course.getId()+":"+course.getName());
		}
	}
	
	/**
	 *泛型集合可以添加泛型的子类型的对象实例
	 * @param args
	 */
	public void testChild() {
		ChildCourse childCourse = new ChildCourse();
		childCourse.setId("1");
		childCourse.setName("测试一下");
		courses.add(childCourse);
	}
	
	/**
	 * 泛型不能使用基本类型，需要使用包装类
	 * @param args
	 */
	public void testBasicType() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
	}

	public static void main(String[] args) {

		TestGeneric tGeneric = new TestGeneric();
		tGeneric.testAdd();
		tGeneric.testForEach();
	}

}
