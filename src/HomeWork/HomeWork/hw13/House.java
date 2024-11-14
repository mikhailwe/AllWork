package HomeWork.HomeWork.hw13;

import java.util.Objects;

public class House {
    private int floors;
    private int rooms;
    private boolean hasGarage;

    public House(Builder builder) {
        this.floors = builder.floors;
        this.rooms = builder.rooms;
        this.hasGarage = builder.hasGarage;
    }

    public static class Builder {
        private int floors;
        private int rooms;
        private boolean hasGarage;

        public Builder() {
        }

        public Builder floors(int f) {
            this.floors = f;
            return this;
        }

        public Builder rooms(int r) {
            this.rooms = r;
            return this;
        }

        public Builder hasGarage(boolean b) {
            this.hasGarage = b;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }

    @Override
    public String toString() {
        return "House{" +
                "floors=" + floors +
                ", rooms=" + rooms +
                ", hasGarage=" + hasGarage +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return floors == house.floors && rooms == house.rooms;
    }

    @Override
    public int hashCode() {
        return Objects.hash(floors, rooms, hasGarage);
    }
}


