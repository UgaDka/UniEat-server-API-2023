package foorun.unieat.api.model.domain.member.request;

import foorun.unieat.api.model.base.dto.UniEatRequestDTO;
import lombok.Data;

@Data
public class MemberLocation implements UniEatRequestDTO {
    private Double latitude;
    private Double longitude;
}