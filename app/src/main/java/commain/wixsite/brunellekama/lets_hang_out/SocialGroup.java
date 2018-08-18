package commain.wixsite.brunellekama.lets_hang_out;

import java.util.List;

public class SocialGroup {
	
	protected String name;
	protected List<User> members;
	protected List<Admin> admins;
	protected String visibility;
	protected List<Activity> prefActivity;
	protected List<User> requestedMembers;
	protected List<Activity> requestedActivities;

	
	public SocialGroup(String name, String visibility) {
		this.name = name;
		this.visibility = visibility;
	}
	
}
