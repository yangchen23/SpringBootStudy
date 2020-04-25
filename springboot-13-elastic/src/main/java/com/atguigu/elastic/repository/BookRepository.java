package com.atguigu.elastic.repository;

import com.atguigu.elastic.bean.Book;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * @author yangchen
 * @version v1.0
 * @date 2020/4/22 22:40
 */
public interface BookRepository extends ElasticsearchRepository<Book, Integer> {

    public List<Book> findByBookNameLike(String bookName);
}
