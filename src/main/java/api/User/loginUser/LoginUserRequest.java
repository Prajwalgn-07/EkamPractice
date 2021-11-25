package api.User.loginUser;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Builder
public @Getter
class LoginUserRequest {
	private String password;
	private String email;
}