package kr.co.primes_cloud.erp.payload.request.itempricehistory;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "ItemPriceHistory 검색 요청")
public class ItemPriceHistorySearchRequest {

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

    @Schema(description = "아이템 ID", example = "1")
    private Long itemId;

    @Schema(description = "아이템번호", example = "1")
    private Integer itemNo;

    @Schema(description = "업체 ID", example = "1")
    private Long vendorId;

    @Schema(description = "업체명", example = "업체명")
    private String vendorName;

    @Schema(description = "기본여부", example = "true")
    private Boolean isDefault;

    @Schema(description = "매출매입 flag", example = "true")
    private Boolean inoutFlag;

    @Schema(description = "적용일자", example = "2024-01-01")
    private LocalDate applyDate;

    @Schema(description = "적용일자 시작", example = "2024-01-01")
    private LocalDate applyDateStart;

    @Schema(description = "적용일자 종료", example = "2024-01-01")
    private LocalDate applyDateEnd;

    @Schema(description = "인상전 단가")
    private Double beforePrice;

    @Schema(description = "인상후 단가")
    private Double afterPrice;

    @Schema(description = "인상요인", example = "인상요인")
    private String reasonDesc;
}
