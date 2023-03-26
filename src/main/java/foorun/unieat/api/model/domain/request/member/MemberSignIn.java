package foorun.unieat.api.model.domain.request.member;

import foorun.unieat.api.model.base.dto.UniEatBaseDTO;
import lombok.Data;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@Validated
public class MemberSignIn implements UniEatBaseDTO {
    @NotBlank
    @Email(message = "E-Mail 양식이 아닙니다.")
    private String email;

    @ToString.Exclude
    private String password;
}