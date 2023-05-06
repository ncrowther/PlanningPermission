package gov.bom;

public class PlanningRequest {

	BuildingUse buildingUse;
	EnergyUse energyUse;
	
	int storiesOfOriginalHouse;
	boolean alwaysHouse;
	int extensionHeight;
	int distanceInMetresOfExtensionFromRearBoundary;
	int percentageOfPropertyCoveredByExtension;
    
	public BuildingUse getBuildingUse() {
		return buildingUse;
	}
	public void setBuildingUse(BuildingUse buildingUse) {
		this.buildingUse = buildingUse;
	}
	public EnergyUse getEnergyUse() {
		return energyUse;
	}
	public void setEnergyUse(EnergyUse energyUse) {
		this.energyUse = energyUse;
	}
	public int getStoriesOfOriginalHouse() {
		return storiesOfOriginalHouse;
	}
	public void setStoriesOfOriginalHouse(int storiesOfOriginalHouse) {
		this.storiesOfOriginalHouse = storiesOfOriginalHouse;
	}
	public boolean isAlwaysHouse() {
		return alwaysHouse;
	}
	public void setAlwaysHouse(boolean alwaysHouse) {
		this.alwaysHouse = alwaysHouse;
	}
	public int getExtensionHeight() {
		return extensionHeight;
	}
	public void setExtensionHeight(int extensionHeight) {
		this.extensionHeight = extensionHeight;
	}
	public int getDistanceInMetresOfExtensionFromRearBoundary() {
		return distanceInMetresOfExtensionFromRearBoundary;
	}
	public void setDistanceInMetresOfExtensionFromRearBoundary(int distanceInMetresOfExtensionFromRearBoundary) {
		this.distanceInMetresOfExtensionFromRearBoundary = distanceInMetresOfExtensionFromRearBoundary;
	}
	public int getPercentageOfPropertyCoveredByExtension() {
		return percentageOfPropertyCoveredByExtension;
	}
	public void setPercentageOfPropertyCoveredByExtension(int percentageOfPropertyCoveredByExtension) {
		this.percentageOfPropertyCoveredByExtension = percentageOfPropertyCoveredByExtension;
	} 

	
}
