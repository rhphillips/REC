//so i just added some notes to commit to gitHUB
package com.example.reccenter;

public class Equipment {
	private String name;
	private String image;
	private String muscleGroup;
	private String demoURL;
	private String location;
	
	public Equipment(String name, String image, String muscleGroup,
			String demoURL, String location) {
		super();
		this.name = name;
		this.image = image;
		this.muscleGroup = muscleGroup;
		this.demoURL = demoURL;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getMuscleGroup() {
		return muscleGroup;
	}

	public void setMuscleGroup(String muscleGroup) {
		this.muscleGroup = muscleGroup;
	}

	public String getDemoURL() {
		return demoURL;
	}

	public void setDemoURL(String demoURL) {
		this.demoURL = demoURL;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	

}
