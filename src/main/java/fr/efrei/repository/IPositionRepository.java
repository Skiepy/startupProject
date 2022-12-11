package fr.efrei.repository;

import fr.efrei.domain.Position;

import java.util.List;

public interface IPositionRepository extends IRepository<Position, String> {
    public List<Position> getAll();
}
