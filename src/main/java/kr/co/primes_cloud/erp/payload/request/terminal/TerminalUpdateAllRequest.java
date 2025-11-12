package kr.co.primes_cloud.erp.payload.request.terminal;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Terminal 일괄 Update 요청")
public class TerminalUpdateAllRequest {

    @NotNull(message = "ID는 필수입니다.")
    @Schema(description = "ID", example = "1")
    private Long id;

    @Schema(description = "사용여부", example = "true")
    private Boolean isUse;

    @Schema(description = "데이터 회계년", example = "1")
    private Short accountYear;

    @Size(max = 30, message = "Terminal name은 30자 이내로 입력해주세요.")
    @Schema(description = "Terminal name", example = "샘플명")
    private String terminalName;

    @Schema(description = "Description", example = "샘플값")
    private String description;

    @Size(max = 100, message = "Image url은 100자 이내로 입력해주세요.")
    @Schema(description = "Image url", example = "샘플값")
    private String imageUrl;
}
