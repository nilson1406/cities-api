package com.github.nilsonconceicao.countries.repositories;

import com.github.nilsonconceicao.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
