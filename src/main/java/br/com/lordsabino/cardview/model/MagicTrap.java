package br.com.lordsabino.cardview.model;

public class MagicTrap implements Card {

	private Long id;
	
	private String name;
	
	private String property;
	
	private String passcode;
	
	private String statuses;
	
	private String description;
	
	public MagicTrap() {
	}

	public MagicTrap(String name, String property, String passcode, String statuses, String description) {
		this.name = name;
		this.property = property;
		this.passcode = passcode;
		this.statuses = statuses;
		this.description = description;
	}
	
	@Override
	public String toString() {
		String format = "Name: %s%nProperty: %s%nPasscode: %s%nStatuses: %s%nDescription: %s%n";
		return String.format(format, name, property, passcode, statuses, description);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((passcode == null) ? 0 : passcode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof MagicTrap))
			return false;
		MagicTrap other = (MagicTrap) obj;
		if (passcode == null) {
			if (other.passcode != null)
				return false;
		} else if (!passcode.equals(other.passcode))
			return false;
		return true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getPasscode() {
		return passcode;
	}

	public void setPasscode(String passcode) {
		this.passcode = passcode;
	}

	public String getStatuses() {
		return statuses;
	}

	public void setStatuses(String statuses) {
		this.statuses = statuses;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
