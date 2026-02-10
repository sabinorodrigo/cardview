package br.com.lordsabino.cardview.model;

public class Monster implements Card {
	
	private Long id;

	private String name;
	
	private String attribute;
	
	private String types;
	
	private Integer level;
	
	private Integer attack;
	
	private Integer defense;
	
	private String passcode;
	
	private String statuses;
	
	private String description;

	public Monster() {
	}
	
	public Monster(String name, String attribute, String types, Integer level, Integer attack, Integer defense,
			String passcode, String statuses, String description) {
		this.name = name;
		this.attribute = attribute;
		this.types = types;
		this.level = level;
		this.attack = attack;
		this.defense = defense;
		this.passcode = passcode;
		this.statuses = statuses;
		this.description = description;
	}
	
	@Override
	public String toString() {
		String format = "Name: %sAttribute: %s%nTypes: %s%nLevel: %d%nAttack: %d%nDefense: %d%nPasscode: %s%nStatuses: %s%nDescription: %s%n";
		return String.format(format, name, attribute, types, level, attack, defense, passcode, statuses, description);
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
		if (!(obj instanceof Monster))
			return false;
		Monster other = (Monster) obj;
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

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getAttack() {
		return attack;
	}

	public void setAttack(Integer attack) {
		this.attack = attack;
	}

	public Integer getDefense() {
		return defense;
	}

	public void setDefense(Integer defense) {
		this.defense = defense;
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
