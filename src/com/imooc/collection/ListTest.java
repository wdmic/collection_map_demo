package com.imooc.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {
	
	public List coursesToSelect;
	//用于存放课程的list
	public ListTest() {
		this.coursesToSelect = new ArrayList<>();
	}
	
	public void testAdd() {
		Course cr1 = new Course("1", "数据结构");
		coursesToSelect.add(cr1);
		Course temp = (Course) coursesToSelect.get(0);
		System.out.println("添加了课程"+temp.getId()+":"+temp.getName());
		Course cr2 = new Course("2", "C语言");
		coursesToSelect.add(0, cr2);
		Course temp1 = (Course) coursesToSelect.get(0);
		System.out.println("添加了课程"+temp1.getId()+":"+temp1.getName());
		//addall方法
		Course[] courses = {new Course("3", "离散数学"), new Course("4", "汇编语言")};
		coursesToSelect.addAll(Arrays.asList(courses));
		Course temp3 = (Course) coursesToSelect.get(2);
		Course temp4 = (Course) coursesToSelect.get(3);
		System.out.println("添加了两门课程"+temp3.getId()+":"+temp3.getName()+temp4.getId()+":"+temp4.getName());
		Course[] courses2 = {new Course("5", "高等数学"), new Course("6", "大学英语")};
		coursesToSelect.addAll(2, Arrays.asList(courses2));
		Course temp5 = (Course) coursesToSelect.get(2);
		Course temp6 = (Course) coursesToSelect.get(3);
		System.out.println("添加了两门课程"+temp5.getId()+":"+temp5.getName()+temp6.getId()+":"+temp6.getName());


	}
	
	public void testGet() {
		int size = coursesToSelect.size();
		System.out.println("课程列表如下：");
		for(int i=0; i<size; i++) {
			Course course = (Course) coursesToSelect.get(i);
			System.out.println(course.getId()+":"+course.getName());
		}
	}
	
	//通过迭代器遍历list
	public void testIterator() {
		Iterator iterator = coursesToSelect.iterator();
		System.out.println("课程列表如下(iterrator遍历)：");
		while (iterator.hasNext()) {
			Course course = (Course) iterator.next();
			System.out.println(course.getId()+":"+course.getName());
		}
	}
	
	//通过foreach 遍历
	public void testForEach() {
		System.out.println("课程列表如下(foreach遍历)：");
		for(Object object : coursesToSelect) {
			Course course = (Course) object;
			System.out.println(course.getId()+":"+course.getName());
		}
	}
	
	//修改list元素
	public void testModify() {
		coursesToSelect.set(3, new Course("6", "数据库"));
	}
	
	//删除list元素
	public void testRemove() {
		System.out.println("索引2位置将被删除");
		//指定索引删除
		coursesToSelect.remove(2);
		System.out.println("删除成功");
		testForEach();
		Course[] courses = {(Course) coursesToSelect.get(2),(Course) coursesToSelect.get(3)};
		System.out.println("索引2和3将被删除");
		//removeAll使用
		coursesToSelect.removeAll(Arrays.asList(courses));
		System.out.println("删除成功");
		testForEach();
	}

	public static void main(String[] args) {

		ListTest lt = new ListTest();
		lt.testAdd();
		lt.testGet();
		lt.testIterator();
		lt.testForEach();
		lt.testModify();
		lt.testForEach();
		lt.testRemove();
	}

}
