package com.satya.a1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HrDepartment hrd = new HrDepartment();
		TechDepartment td = new TechDepartment();
		AdminDepartment ad = new AdminDepartment();

		System.out.println(" Welcome to" + ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(hrd.isTodayAHoliday());

		System.out.println();
		System.out.println(" Welcome to" + hrd.departmentName());
		System.out.println(hrd.doActivity());
		System.out.println(hrd.getTodaysWork());
		System.out.println(hrd.getWorkDeadline());
		System.out.println(hrd.isTodayAHoliday());

		System.out.println();
		System.out.println(" Welcome to" + td.departmentName());
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.getTechStackInformation());
		System.out.println(hrd.isTodayAHoliday());

	}

}
