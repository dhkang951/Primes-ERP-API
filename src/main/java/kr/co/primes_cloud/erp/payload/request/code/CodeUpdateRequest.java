package kr.co.primes_cloud.erp.payload.request.code;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Code Update 요청")
public class CodeUpdateRequest {

    @Schema(description = "use state", example = "true")
    private Boolean isUse;

    @Size(max = 100, message = "code name ex) 베어링류은 100자 이내로 입력해주세요.")
    @Schema(description = "code name ex) 베어링류", example = "CODE001")
    private String codeName;

    @Size(max = 255, message = "description은 255자 이내로 입력해주세요.")
    @Schema(description = "description", example = "샘플값")
    private String description;
}
