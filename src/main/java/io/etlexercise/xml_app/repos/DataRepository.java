package io.etlexercise.xml_app.repos;

import io.etlexercise.xml_app.domain.Data;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DataRepository extends JpaRepository<Data, Integer> {
}
