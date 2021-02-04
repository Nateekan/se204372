import java.util.Vector;

public class OurGroup {

    private Vector<String> groupMembers;
    public OurGroup()
    {
        groupMembers = new Vector<String>();
        groupMembers.add("Nateekan Ngamkam"); //PUT YOUR NAME HERE
	groupMembers.add("Thakuntorn Thitinakarath");
    }
    public Vector<String> getGroupMembers () {
        return groupMembers;
    }

}
