package commain.wixsite.brunellekama.lets_hang_out;

public class Admin extends User {

	public Admin(String firstName, String lastName, String password) {
		super(firstName, lastName, password);
		// TODO Auto-generated constructor stub
	}

	public void addFriend(SocialGroup group, User person) {
		group.members.add(person);
	}
	
	public void removeFriend(SocialGroup group, User person) {
		group.members.remove(person);
	}
	
	public void approveFriend(SocialGroup group, User person, String approval){
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

