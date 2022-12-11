package fr.efrei.factory;

import fr.efrei.domain.Job;
import fr.efrei.domain.Position;
import fr.efrei.util.Helper;

import java.util.List;

public class JobFactory {
    public static Job createJob(String title, List<Position> positions){
        if (Helper.isNullOrEmpty(title) || positions == null)
            return null;

        Job job = new Job.Builder().setPositions(positions)
                .setTitle(title)
                .build();

        return job;
    }
}
