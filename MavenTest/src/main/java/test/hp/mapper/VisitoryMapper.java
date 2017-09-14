package test.hp.mapper;

import java.util.List;

import test.hp.bean.Visitory;

public interface VisitoryMapper {
    public List<Visitory> findvisitById(Integer uid);
}
