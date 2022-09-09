package com.example.hibernate.entities;

import jakarta.persistence.*;

@Entity
public class Position {
    @Basic
    @Column(name = "position", nullable = true, length = -1)
    private String position;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "positionId", nullable = false)
    private Integer positionId;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Position position1 = (Position) o;

        if (position != null ? !position.equals(position1.position) : position1.position != null) return false;
        if (positionId != null ? !positionId.equals(position1.positionId) : position1.positionId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = position != null ? position.hashCode() : 0;
        result = 31 * result + (positionId != null ? positionId.hashCode() : 0);
        return result;
    }
}
