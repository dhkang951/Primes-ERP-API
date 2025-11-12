package kr.co.primes_cloud.erp.payload.request.vendorcharger;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Vendor Charger 검색 요청")
public class VendorChargerSearchRequest {

    @Schema(description = "사용 여부", example = "true")
    private Boolean isUse;

    @Schema(description = "생성일시 시작", example = "2024-01-01T00:00:00")
    private String createdAtStart;

    @Schema(description = "생성일시 종료", example = "2024-12-31T23:59:59")
    private String createdAtEnd;

    @Schema(description = "생성자", example = "admin")
    private String createdBy;

    @Schema(description = "수정일시 시작", example = "2024-01-01T00:00:00")
    private String updatedAtStart;

    @Schema(description = "수정일시 종료", example = "2024-12-31T23:59:59")
    private String updatedAtEnd;

    @Schema(description = "수정자", example = "admin")
    private String updatedBy;

    @Schema(description = "ID", example = "1")
    private Long id;

    @Schema(description = "Vendor ID", example = "1")
    private Long vendorId;

    @Schema(description = "이름", example = "홍길동")
    private String name;

    @Schema(description = "직책", example = "과장")
    private String position;

    @Schema(description = "부서", example = "구매팀")
    private String department;

    @Schema(description = "메일주소", example = "hong@example.com")
    private String email;

    @Schema(description = "연락처", example = "010-1234-5678")
    private String contact;

    @Schema(description = "주담당자 여부", example = "true")
    private Boolean isMainCharger;
}

