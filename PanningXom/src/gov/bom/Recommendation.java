package gov.bom;

import java.util.ArrayList;
import java.util.List;

public class Recommendation {
     boolean accepted;
     List<String> rejectionReasons = new ArrayList<String>();
     
	public boolean isAccepted() {
		return accepted;
	}
	public void setAccepted(boolean accepted) {
		this.accepted = accepted;
	}
	public List<String> getRejectionReasons() {
		return rejectionReasons;
	}
	public void addRejectionReason(String rejectionReason) {
		this.rejectionReasons.add(rejectionReason);
	}
	
	@Override
	public String toString() {
		return "Recommendation [accepted=" + accepted + ", rejectionReasons=" + rejectionReasons + "]";
	}
     
     
}
