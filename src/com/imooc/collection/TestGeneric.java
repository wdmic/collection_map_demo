package com.imooc.collection;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {
	/**
	 * ���з���course ��list
	 */
	public List<Course> courses;
	
	public TestGeneric() {
		this.courses = new ArrayList<Course>();
	}
	
	public void testAdd() {
		Course course1 = new Course("1", "��ѧ����");
		courses.add(course1);
		//���ͼ����в�����ӷ��͹涨���ͼ�������������Ķ���
//		courses.add("���������ֵĶ���");
		Course course2 = new Course("2", "���������");
		courses.add(course2);
	}
	
	public void testForEach() {
		System.out.println("�γ����£�");
		for(Course course : courses) {
			System.out.println(course.getId()+":"+course.getName());
		}
	}
	
	/**
	 *���ͼ��Ͽ�����ӷ��͵������͵Ķ���ʵ��
	 * @param args
	 */
	public void testChild() {
		ChildCourse childCourse = new ChildCourse();
		childCourse.setId("1");
		childCourse.setName("����һ��");
		courses.add(childCourse);
	}
	
	/**
	 * ���Ͳ���ʹ�û������ͣ���Ҫʹ�ð�װ��
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
