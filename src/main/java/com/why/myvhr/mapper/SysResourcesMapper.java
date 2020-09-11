package com.why.myvhr.mapper;

import com.why.myvhr.beans.SysResources;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SysResourcesMapper {
    List<SysResources> findAll();

}