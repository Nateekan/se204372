import java.util.Vector;

public class OurGroup {

    private Vector<String> groupMembers;
    public OurGroup()
    {
        groupMembers = new Vector<String>();
        groupMembers.add("Nateekan Ngamkam"); //PUT YOUR NAME HERE
	groupMembers.add("Parit Menklay");
    }
    public Vector<String> getGroupMembers () {
        return groupMembers;
    }

}
