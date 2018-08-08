package com.example.brunelle.myapplication;

import java.util.HashMap;
import java.util.List;

public class SocialGroup {
	
	protected String name;
	protected List<Person> members;
	protected List<Admin> admins;
	protected String visibility;
	protected List<Activity> prefActivity;
	protected List<Person> requestedMembers;
	protected List<Activity> requestedActivities;

	
	public SocialGroup(String name, String visibility) {
		this.name = name;
		this.visibility = visibility;
	}
	
}
