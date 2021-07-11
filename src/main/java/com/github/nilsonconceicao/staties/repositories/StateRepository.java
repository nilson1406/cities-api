package com.github.nilsonconceicao.staties.repositories;

import com.github.nilsonconceicao.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
