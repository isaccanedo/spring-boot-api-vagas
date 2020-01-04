package com.isac.canedo.apivagas.repository;

import org.springframework.data.repository.CrudRepository;

import com.isac.canedo.apivagas.dominio.VagasDominio;

public interface VagasRepository extends CrudRepository<VagasDominio, Long> {

}
