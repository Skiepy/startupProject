package fr.efrei.repository;

import fr.efrei.domain.Job;

import java.util.List;

public interface IJobRepository extends IRepository<Job, String>{
    public List<Job> getAll();
}
