package com.ktdsuniversity.edu.tmdb.vo;

public class ActorsVO {
	private String actorId;
	private String actorName;
	private String profilePic;
	
	public String getActorId() {
		return actorId;
	}
	public void setActorId(String actorId) {
		this.actorId = actorId;
	}
	public String getActorName() {
		return actorName;
	}
	public void setActorName(String actorName) {
		this.actorName = actorName;
	}
	public String getProfilePic() {
		return profilePic;
	}
	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}
	@Override
	public String toString() {
		return "Actor) actorId: " + actorId + ", actorName: " + actorName + ", profilePic: " + profilePic + "\n";
	}
}
