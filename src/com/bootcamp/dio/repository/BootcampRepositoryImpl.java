package com.bootcamp.dio.repository;

import com.bootcamp.dio.model.Bootcamp;

import java.util.ArrayList;
import java.util.List;

public class BootcampRepositoryImpl implements BootcampRepository {

    private List<Bootcamp> bootcamps = new ArrayList<>();

    @Override
    public void save(Bootcamp bootcamp) {
        bootcamps.removeIf(b -> b.getId().equals(bootcamp.getId()));
        bootcamps.add(bootcamp);
    }

    @Override
    public Bootcamp findById(Long id) {
        return bootcamps.stream()
                .filter(bootcamp -> bootcamp.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Bootcamp> findAll() {
        return new ArrayList<>(bootcamps);
    }

    @Override
    public void delete(Bootcamp bootcamp) {
        bootcamps.remove(bootcamp);
    }
}
