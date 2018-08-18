package commain.wixsite.brunellekama.lets_hang_out;

import java.util.List;


public class User {
    private String firstName;
    private String lastName;
    private Integer age;
    private String sex;
    protected List<SocialGroup> socialGroups;
    //protected HashMap<SocialGroup, List<String>> socialGroups;
    public User (String firstName, String lastName, String password) {
        //String profession) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
        //this.profession = profession;
    }


    public void joinGroup(SocialGroup group) {
        group.requestedMembers.add(this);
    }

    public void leaveGroup(SocialGroup group) {
        group.members.remove(this);
    }

    public void suggestActivity(SocialGroup group, Activity activity) {
        group.requestedActivities.add(activity);
    }

    public void editFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void editLastName(String lastName) {
        this.lastName = lastName;
    }

    public void editAge(Integer age) {
        this.age = age;
    }

    public void editSex(String sex) {
        this.sex = sex;
    }

    //public void editProfession(String profession) {
    //	this.profession = profession;
    //}


}
