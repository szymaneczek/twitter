package pl.sda.twitter.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TbUser {
    private Long id;
    private String userName;
    private String password;
}
