package api.User.loginUser;

import lombok.Builder;
import lombok.Getter;
@Builder
public @Getter class LoginUserNegativeRequest {
	private String email;
}