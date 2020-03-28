package com.jinqi.exam.service;

import com.jinqi.exam.entity.Manager;
import com.jinqi.exam.exception.ManagerNotFoundException;

public interface ManagerService {

    Manager login(Manager manager) throws ManagerNotFoundException;

    Manager checkInfo(Integer managerId);

    Integer updateInfo(Manager manager);
}
