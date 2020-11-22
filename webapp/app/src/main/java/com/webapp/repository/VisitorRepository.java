package com.webapp.repository;

import com.webapp.entity.Visitor;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitorRepository extends JpaRepository<Visitor, Long> {
    Visitor findByIp(String ip);
}