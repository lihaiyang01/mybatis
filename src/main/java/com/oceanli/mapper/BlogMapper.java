package com.oceanli.mapper;

import com.oceanli.domain.Blog;

public interface BlogMapper {
    /**
     * 根据主键查询文章
     * @param bid
     * @return
     */
    public Blog selectBlogById(Integer bid);


}
