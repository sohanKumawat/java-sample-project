package com.mb.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mb.demo.entity.common.metaData.AssetMedaDataEntity;

@Repository
public interface AssetDataRepository extends JpaRepository<AssetMedaDataEntity, Long>{

}
