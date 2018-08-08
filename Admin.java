package com.example.brunelle.myapplication;

public class Admin extends Person {

	public Admin(String firstName, String lastName, Integer age, String sex, String profession) {
		super(firstName, lastName, age, sex);
		// TODO Auto-generated constructor stub
	}

	public void addFriend(SocialGroup group, Person person) {	
		group.members.add(person);
	}
	
	public void removeFriend(SocialGroup group, Person person) {
		group.members.remove(person);
	}
	
	public void approveFriend(SocialGroup group, Person person, String approval){
		if (approval == "Yes") {
			group.members.add(person);
			person.socialGroups.add(group);
		}
		group.requestedMembers.remove(person);
	}
	
	public void approveActivity(SocialGroup group, Activity activity, String approval) {
		if (approval == "Yes") {
			group.prefActivity.add(activity);
		}
		group.requestedActivities.remove(activity);
	}
}

