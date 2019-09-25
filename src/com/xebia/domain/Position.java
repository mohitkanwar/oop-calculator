package com.xebia.domain;

import java.util.Objects;

public final class Position {
    private final String positionLabel;

    public Position(String positionLabel) {
        this.positionLabel = positionLabel;
    }

    public String getPositionLabel() {
        return positionLabel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Position)) return false;
        Position position = (Position) o;
        return Objects.equals(getPositionLabel(), position.getPositionLabel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPositionLabel());
    }
}
