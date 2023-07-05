package foorun.unieat.api.model.domain.member.request;

import foorun.unieat.api.model.base.dto.UniEatRequestDTO;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;

@Data(staticConstructor = "of")
@Validated
public class MemberSignOut implements UniEatRequestDTO {
    @NotBlank
    private final String accessToken;
    @NotBlank
    private final String refreshToken;
}