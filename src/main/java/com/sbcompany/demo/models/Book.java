package com.sbcompany.demo.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;
import java.io.Serializable;

@RedisHash("book")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book implements Serializable {

    private Integer id;
    private String isbn;
    private String title;
    private Author author;
}
