package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsPage;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author lipengfei <184441376@qq.com><br/>
 * @date 2020/6/8
 * api接口
 */
public interface CmsPageRepository extends MongoRepository<CmsPage,String> {
}

