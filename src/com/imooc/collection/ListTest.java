package com.imooc.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {
	
	public List coursesToSelect;
	//���ڴ�ſγ̵�list
	public ListTest() {
		this.coursesToSelect = new ArrayList<>();
	}
	
	public void testAdd() {
		Course cr1 = new Course("1", "���ݽṹ");
		coursesToSelect.add(cr1);
		Course temp = (Course) coursesToSelect.get(0);
		System.out.println("����˿γ�"+temp.getId()+":"+temp.getName());
		Course cr2 = new Course("2", "C����");
		coursesToSelect.add(0, cr2);
		Course temp1 = (Course) coursesToSelect.get(0);
		System.out.println("����˿γ�"+temp1.getId()+":"+temp1.getName());
		//addall����
		Course[] courses = {new Course("3", "��ɢ��ѧ"), new Course("4", "�������")};
		coursesToSelect.addAll(Arrays.asList(courses));
		Course temp3 = (Course) coursesToSelect.get(2);
		Course temp4 = (Course) coursesToSelect.get(3);
		System.out.println("��������ſγ�"+temp3.getId()+":"+temp3.getName()+temp4.getId()+":"+temp4.getName());
		Course[] courses2 = {new Course("5", "�ߵ���ѧ"), new Course("6", "��ѧӢ��")};
		coursesToSelect.addAll(2, Arrays.asList(courses2));
		Course temp5 = (Course) coursesToSelect.get(2);
		Course temp6 = (Course) coursesToSelect.get(3);
		System.out.println("��������ſγ�"+temp5.getId()+":"+temp5.getName()+temp6.getId()+":"+temp6.getName());


	}
	
	public void testGet() {
		int size = coursesToSelect.size();
		System.out.println("�γ��б����£�");
		for(int i=0; i<size; i++) {
			Course course = (Course) coursesToSelect.get(i);
			System.out.println(course.getId()+":"+course.getName());
		}
	}
	
	//ͨ������������list
	public void testIterator() {
		Iterator iterator = coursesToSelect.iterator();
		System.out.println("�γ��б�����(iterrator����)��");
		while (iterator.hasNext()) {
			Course course = (Course) iterator.next();
			System.out.println(course.getId()+":"+course.getName());
		}
	}
	
	//ͨ��foreach ����
	public void testForEach() {
		System.out.println("�γ��б�����(foreach����)��");
		for(Object object : coursesToSelect) {
			Course course = (Course) object;
			System.out.println(course.getId()+":"+course.getName());
		}
	}
	
	//�޸�listԪ��
	public void testModify() {
		coursesToSelect.set(3, new Course("6", "���ݿ�"));
	}
	
	//ɾ��listԪ��
	public void testRemove() {
		System.out.println("����2λ�ý���ɾ��");
		//ָ������ɾ��
		coursesToSelect.remove(2);
		System.out.println("ɾ���ɹ�");
		testForEach();
		Course[] courses = {(Course) coursesToSelect.get(2),(Course) coursesToSelect.get(3)};
		System.out.println("����2��3����ɾ��");
		//removeAllʹ��
		coursesToSelect.removeAll(Arrays.asList(courses));
		System.out.println("ɾ���ɹ�");
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
