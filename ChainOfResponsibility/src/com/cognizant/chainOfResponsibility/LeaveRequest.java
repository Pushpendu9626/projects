package com.cognizant.chainOfResponsibility;

public class LeaveRequest {

	private String Employee;
	private int LeaveDays;

	public String getEmployee() {
		return Employee;
	}

	public void setEmployee(String employee) {
		Employee = employee;
	}

	public int getLeaveDays() {
		return LeaveDays;
	}

	public void setLeaveDays(int leaveDays) {
		LeaveDays = leaveDays;
	}

	public LeaveRequest(String employee, int leaveDays) {
		super();
		Employee = employee;
		LeaveDays = leaveDays;
	}

	public LeaveRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "LeaveRequest [Employee=" + Employee + ", LeaveDays=" + LeaveDays + "]";
	}

}
