package kr.co.primes_cloud.erp.payload.request.vendorcharger;

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
@Schema(description = "Vendor Charger Update 요청")
public class VendorChargerUpdateRequest {

    @Schema(description = "사용여부", example = "true")
    private Boolean isUse;

    @Size(max = 50, message = "이름은 50자 이내로 입력해주세요.")
    @Schema(description = "이름", example = "홍길동")
    private String name;

    @Size(max = 50, message = "직책은 50자 이내로 입력해주세요.")
    @Schema(description = "직책", example = "과장")
    private String position;

    @Size(max = 50, message = "부서는 50자 이내로 입력해주세요.")
    @Schema(description = "부서", example = "구매팀")
    private String department;

    @Size(max = 100, message = "메일주소는 100자 이내로 입력해주세요.")
    @Schema(description = "메일주소", example = "hong@example.com")
    private String email;

    @Size(max = 20, message = "연락처는 20자 이내로 입력해주세요.")
    @Schema(description = "연락처", example = "010-1234-5678")
    private String contact;

    @Size(max = 500, message = "메모는 500자 이내로 입력해주세요.")
    @Schema(description = "메모", example = "비고 메모")
    private String memo;

    @Schema(description = "주담당자 여부", example = "false")
    private Boolean isMainCharger;
}

