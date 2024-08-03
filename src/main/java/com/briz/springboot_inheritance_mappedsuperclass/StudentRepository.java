package com.briz.springboot_inheritance_mappedsuperclass;

import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface StudentRepository extends PersonRepository {

}
