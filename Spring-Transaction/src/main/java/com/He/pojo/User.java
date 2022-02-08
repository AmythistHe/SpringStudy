package com.He.pojo;

import lombok.Data;

/**
 * @author AmythistHe
 * @version 1.0
 * @description
 * @create 2022/2/6 13:32
 */
// @DataµÈ¼ÛÓÚ@ToString @EqualsAndHashCode @Getter @Setter @RequiredArgsConstructor
@Data
public class User {
    private int id;
    private String name;
    private String pwd;
}
