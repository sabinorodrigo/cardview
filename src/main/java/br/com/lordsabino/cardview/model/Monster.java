package br.com.lordsabino.cardview.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import br.com.lordsabino.cardview.model.enums.Attribute;
import br.com.lordsabino.cardview.model.enums.Types;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "monster")
public class Monster implements Card {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	@Enumerated(EnumType.STRING)
	private Attribute attribute;

	@ElementCollection(targetClass = Types.class)
	@Enumerated(EnumType.STRING)
	@CollectionTable(
	    name = "monster_types",
	    joinColumns = @JoinColumn(name = "monster_id")
	)
	private Set<Types> types = new HashSet<>();

	private int level;

	private int attack;

	private int defense;

	private String passcode;

	private String statuses;

	private String description;
	
	public Monster() {
	}

	public Monster(String name, Attribute attribute, Set<Types> types, int level, int attack, int defense,
			String passcode, String statuses, String description) {

		this.name = name;
		this.attribute = attribute;
		this.types = Set.copyOf(types);
		this.level = level;
		this.attack = attack;
		this.defense = defense;
		this.passcode = passcode;
		this.statuses = statuses;
		this.description = description;
	}
	
    @Override
	public String toString() {
    	String format = "Name: %s%nAttribute: %s%nTypes: %s%nLevel: %d%nAttack: %d%nDefense: %d%sPasscode: %s%nStatuses: %s%nDescription: %s%n";
		return String.format(format, getName(), getAttribute(), getTypes(), getLevel(), getAttack(), getDefense(), getPasscode(), getStatuses(), getDescription());
	}

	// Verification method
	public boolean hasType(Types type) {
        return types.contains(type);
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

	public Attribute getAttribute() {
		return attribute;
	}

	public void setAttribute(Attribute attribute) {
		this.attribute = attribute;
	}

	public Set<Types> getTypes() {
	    return types;
	}

	public void setTypes(Set<Types> types) {
	    this.types = types;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
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

	@Override
	public int hashCode() {
		return Objects.hash(passcode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Monster other = (Monster) obj;
		return Objects.equals(passcode, other.passcode);
	}
	
		
}
