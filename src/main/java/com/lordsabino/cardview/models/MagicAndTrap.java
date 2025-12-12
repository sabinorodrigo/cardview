package com.lordsabino.cardview.models;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "TB_MAGIC_TRAP")
public class MagicAndTrap implements Card{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String property;

    private String passcode;

    private String cardEffectTypes;

    private String statuses;

    private String cardDescriptions;

    public MagicAndTrap() {
    }

    public MagicAndTrap(String name, String property, String passcode, String cardEffectTypes, String statuses, String cardDescriptions) {
        this.name = name;
        this.property = property;
        this.passcode = passcode;
        this.cardEffectTypes = cardEffectTypes;
        this.statuses = statuses;
        this.cardDescriptions = cardDescriptions;
    }

    @Override
    public String toString() {
        String format = "Name: %s%nProperty: %s%nPasscode: %s%nCard Effect Types: %s%nCard Description: %s%n";
        return String.format(format, getName(), getProperty(), getPasscode(), getCardEffectTypes(), getStatuses(), getCardDescriptions());
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

    public String getCardEffectTypes() {
        return cardEffectTypes;
    }

    public void setCardEffectTypes(String cardEffectTypes) {
        this.cardEffectTypes = cardEffectTypes;
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
        MagicAndTrap that = (MagicAndTrap) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
