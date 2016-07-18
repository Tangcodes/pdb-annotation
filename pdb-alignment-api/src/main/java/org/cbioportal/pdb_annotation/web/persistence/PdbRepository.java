package org.cbioportal.pdb_annotation.web.persistence;

import javax.transaction.Transactional;

import org.cbioportal.pdb_annotation.web.models.Alignment;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface PdbRepository extends CrudRepository<Alignment, Long>{

}
