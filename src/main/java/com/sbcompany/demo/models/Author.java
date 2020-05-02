package com.sbcompany.demo.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;
import java.io.Serializable;

@RedisHash("author")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Author implements Serializable {
    private String firstName;
    private String lastName;
}
