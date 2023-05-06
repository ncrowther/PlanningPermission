package gov.bom;

public class PropertyGeoData {

	boolean listedBuilding;
    boolean inFloodRiskArea;
    boolean inConservationArea;
    boolean inAreaOfOutstandingNaturalBeauty;
    boolean inTreePreservationOrderZone;
    boolean inSiteOfSpecialScientificInterest;
    boolean detached;
    
    
    
	public boolean isInFloodRiskArea() {
		return inFloodRiskArea;
	}
	public void setInFloodRiskArea(boolean inFloodRiskArea) {
		this.inFloodRiskArea = inFloodRiskArea;
	}
	public boolean isInConservationArea() {
		return inConservationArea;
	}
	public void setInConservationArea(boolean inConservationArea) {
		this.inConservationArea = inConservationArea;
	}
	public boolean isInAreaOfOutstandingNaturalBeauty() {
		return inAreaOfOutstandingNaturalBeauty;
	}
	public void setInAreaOfOutstandingNaturalBeauty(boolean inAreaOfOutstandingNaturalBeauty) {
		this.inAreaOfOutstandingNaturalBeauty = inAreaOfOutstandingNaturalBeauty;
	}
	public boolean isInTreePreservationOrderZone() {
		return inTreePreservationOrderZone;
	}
	public void setInTreePreservationOrderZone(boolean inTreePreservationOrderZone) {
		this.inTreePreservationOrderZone = inTreePreservationOrderZone;
	}
	public boolean isInSiteOfSpecialScientificInterest() {
		return inSiteOfSpecialScientificInterest;
	}
	public void setInSiteOfSpecialScientificInterest(boolean inSiteOfSpecialScientificInterest) {
		this.inSiteOfSpecialScientificInterest = inSiteOfSpecialScientificInterest;
	}
	public boolean isListedBuilding() {
		return listedBuilding;
	}
	public void setListedBuilding(boolean listedBuilding) {
		this.listedBuilding = listedBuilding;
	}
	public boolean isDetached() {
		return detached;
	}
	public void setDetached(boolean detached) {
		this.detached = detached;
	}
    
    
}
