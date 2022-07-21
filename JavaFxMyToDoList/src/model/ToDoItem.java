package model;

import java.time.LocalDate;

public class ToDoItem {
	private static int numOfActivities = 0;
	private String activity;
	private Status.IStatus status;
	private LocalDate dateCreated;
	private LocalDate dateCompleted;
	private int position = 0;


	public ToDoItem() {
		this.activity = " ";
		status = Status.IStatus.NOT_STARTED;
		dateCreated = LocalDate.now();
	}

	public ToDoItem(String a) {
		this.activity = a;
		status = Status.IStatus.NOT_STARTED;
		dateCreated = LocalDate.now();
		position = numOfActivities + 1;
		numOfActivities++;
	}

	public String getActivity() {
		return activity;
	}

	public void setStatus(Status.IStatus newState) {
		status = newState;
	}

	public Status.IStatus getStatus() {
		return status;
	}

	public LocalDate getDateCreated() {
		return dateCreated;
	}

	public LocalDate getDateCompleted() {
		return dateCompleted;
	}

	public void setDateCompleted(String dc) {
		dateCompleted = LocalDate.parse(dc);
	}

	public int getPosition() {
        return position;
	}

	public static int getNumberOfActivities() {
        return numOfActivities;
	}
}

