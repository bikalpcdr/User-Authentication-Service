package com.bikalp.AuthService.Security;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoginFailureResponse {

    private boolean success;

    private String message;

}
