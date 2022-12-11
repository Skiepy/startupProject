package fr.efrei.domain;

import fr.efrei.repository.PositionRepository;

import java.util.List;

public class Job {
    private String title;
    private List<Position> positions;

    private Job(){}

    private Job(Builder builder) {
        this.title = builder.title;
        this.positions = builder.positions;
    }

    public String getTitle() {
        return title;
    }

    public List<Position> getPositions() {
        return positions;
    }

    @Override
    public String toString() {
        return "Job{" +
                "title='" + title + '\'' +
                ", positions=" + positions +
                '}';
    }

    public static class Builder {
        private String title;
        private List<Position> positions;

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setPositions(List<Position> positions) {
            this.positions = positions;
            return this;
        }

        public Builder copy(Job job) {
            this.title = job.title;
            this.positions = job.positions;
            return this;
        }

        public Job build() { return new Job(this); }
    }

}
