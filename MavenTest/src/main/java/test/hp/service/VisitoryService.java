package test.hp.service;

import java.util.List;

import test.hp.bean.Visitory;

public interface VisitoryService {
    public List<Visitory> FindVisitById(Integer uid);
}
