package fr.efrei.repository;

import fr.efrei.domain.Job;

import java.util.ArrayList;
import java.util.List;

public class JobRepository implements IJobRepository{

    private static JobRepository repository = null;
    private List<Job> jobDB = null;

    private JobRepository() { jobDB = new ArrayList<>(); }

    public static JobRepository getRepository() {
        if (repository == null){
            return new JobRepository();
        } else   {
            return repository;
        }
    }

    @Override
    public Job create(Job job) {
        boolean sucess = jobDB.add(job);
        if (sucess)
            return job;
        return null;
    }

    @Override
    public Job read(String s) {
        for (Job j: jobDB){
            if (j.getTitle().equals(s))
                return j;
        }
        return null;
    }

    @Override
    public Job update(Job job) {
        Job oldJob = read(job.getTitle());
        if (job != null){
            jobDB.remove(oldJob);
            jobDB.add(job);
            return job;
        }
        return null;
    }

    @Override
    public boolean delete(String s) {
        Job jobToDelete = read(s);
        if (jobToDelete == null)
            return false;
        jobDB.remove(jobToDelete);
        return true;
    }

    @Override
    public List<Job> getAll() {
        return jobDB;
    }
}
