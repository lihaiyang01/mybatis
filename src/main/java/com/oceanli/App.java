package com.oceanli;

import com.oceanli.domain.Blog;
import com.oceanli.ibatis.v1.HConfiguration;
import com.oceanli.ibatis.v1.HExecutor;
import com.oceanli.ibatis.v1.HSqlSession;
import com.oceanli.mapper.BlogMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        HSqlSession hSqlSession = new HSqlSession(new HConfiguration(), new HExecutor());
        BlogMapper mapper = hSqlSession.getMapper(BlogMapper.class);
        Blog blog = mapper.selectBlogById(1);
    }
}
