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
		Course cr1 = new Course("1", "数据结构");
		coursesToSelect.add(cr1);
		Course cr2 = new Course("2", "C语言");
		coursesToSelect.add(0, cr2);
		//addall方法
		Course[] courses = {new Course("3", "离散数学"), new Course("4", "汇编语言")};
		coursesToSelect.addAll(Arrays.asList(courses));
		Course[] courses2 = {new Course("5", "高等数学"), new Course("6", "大学英语")};
		coursesToSelect.addAll(2, Arrays.asList(courses2));
	}
	
	//通过foreach 遍历
	public void testForEach() {
		System.out.println("课程列表如下(foreach遍历)：");
		for(Course course : coursesToSelect) {
			System.out.println(course.getId()+":"+course.getName());
		}
	}
	
	public static void main(String[] args) {

		SetTest sTest = new SetTest();
		sTest.testAdd();
		sTest.testForEach();
		Student student = new Student("1", "小明");
		System.out.println("欢迎"+student.getName()+"选3门课");
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("请输入课程ID");
			String courseid = scanner.next();
			for (Course course : sTest.coursesToSelect) {
				if (courseid.equals(course.getId())) {
					/**
					 * set集合中元素不重复，添加的为第一个添加的元素
					 */
					student.courses.add(course);
				}
			}
			
		}
		/**
		 * set只可以用foreach或者iterator遍历
		 */
		System.out.println("选课如下：");
		for (Course course : student.courses) {
			System.out.println(course.getId()+":"+course.getName());
		}
	}

}
