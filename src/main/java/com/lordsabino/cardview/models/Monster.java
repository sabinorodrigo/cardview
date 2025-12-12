package com.lordsabino.cardview.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "TB_MONSTER")
public class Monster implements Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String cardType;

    private String attribute;

    private String types;

    private int level;

    private int attack;

    private int defense;

    private String passcode;

    private String statuses;

    private String cardDescriptions;

    public Monster() {
    }

    public Monster(
            String name,
            String cardType,
            String attribute,
            String types,
            int level,
            int attack,
            int defense,
            String passcode,
            String statuses,
            String cardDescriptions) {
        this.name = name;
        this.cardType = cardType;
        this.attribute = attribute;
        this.types = types;
        this.level = level;
        this.attack = attack;
        this.defense = defense;
        this.passcode = passcode;
        this.statuses = statuses;
        this.cardDescriptions = cardDescriptions;
    }

    @Override
    public String toString() {
        String format = "Name: %s%nCard Type: %s%nAttribute: %s%nTypes: %s%nLevel: %d%nAttack: %d%nDefense: %d%nPasscode: %s%nStatuses: %s%nCard Descriptions: %s%n";
        return String.format(format, getName(), getCardType(), getAttribute(), getTypes(), getLevel(), getAttack(), getDefense(), getPasscode(), getStatuses(), getCardDescriptions());
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
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

    public String getCardDescriptions() {
        return cardDescriptions;
    }

    public void setCardDescriptions(String cardDescriptions) {
        this.cardDescriptions = cardDescriptions;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Monster monster = (Monster) o;
        return id == monster.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
