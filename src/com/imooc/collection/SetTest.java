package com.imooc.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {
	
	public List<Course> coursesToSelect;
	
	public SetTest() {
		this.coursesToSelect = new ArrayList<Course>();
	}

	public void testAdd() {
		Course cr1 = new Course("1", "���ݽṹ");
		coursesToSelect.add(cr1);
		Course cr2 = new Course("2", "C����");
		coursesToSelect.add(0, cr2);
		//addall����
		Course[] courses = {new Course("3", "��ɢ��ѧ"), new Course("4", "�������")};
		coursesToSelect.addAll(Arrays.asList(courses));
		Course[] courses2 = {new Course("5", "�ߵ���ѧ"), new Course("6", "��ѧӢ��")};
		coursesToSelect.addAll(2, Arrays.asList(courses2));
	}
	
	//ͨ��foreach ����
	public void testForEach() {
		System.out.println("�γ��б�����(foreach����)��");
		for(Course course : coursesToSelect) {
			System.out.println(course.getId()+":"+course.getName());
		}
	}
	
	public static void main(String[] args) {

		SetTest sTest = new SetTest();
		sTest.testAdd();
		sTest.testForEach();
		Student student = new Student("1", "С��");
		System.out.println("��ӭ"+student.getName()+"ѡ3�ſ�");
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("������γ�ID");
			String courseid = scanner.next();
			for (Course course : sTest.coursesToSelect) {
				if (courseid.equals(course.getId())) {
					/**
					 * set������Ԫ�ز��ظ�����ӵ�Ϊ��һ����ӵ�Ԫ��
					 */
					student.courses.add(course);
				}
			}
			
		}
		/**
		 * setֻ������foreach����iterator����
		 */
		System.out.println("ѡ�����£�");
		for (Course course : student.courses) {
			System.out.println(course.getId()+":"+course.getName());
		}
	}

}
