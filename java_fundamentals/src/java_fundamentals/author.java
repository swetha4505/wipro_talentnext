package java_fundamentals;

class author {
	private String name;
	private String email;
	private char gender;
	public author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public char getGender() {
		return gender;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
	    return "Author Name: " + name + ", Email: " + email + ", Gender: " + gender;
	}
}
