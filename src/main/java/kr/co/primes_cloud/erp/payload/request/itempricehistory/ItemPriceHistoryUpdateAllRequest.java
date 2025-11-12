package kr.co.primes_cloud.erp.payload.request.itempricehistory;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "ItemPriceHistory UpdateAll 요청")
public class ItemPriceHistoryUpdateAllRequest {

    @Schema(description = "ID", example = "1")
    private Long id;

    @Schema(description = "아이템 ID", example = "1")
    private Long itemId;

    @Schema(description = "아이템번호", example = "1")
    private Integer itemNo;

    @Schema(description = "업체 ID", example = "1")
    private Long vendorId;

    @Size(max = 255, message = "업체명은 255자 이내로 입력해주세요.")
    @Schema(description = "업체명", example = "업체명")
    private String vendorName;

    @Schema(description = "기본여부", example = "true")
    private Boolean isDefault;

    @Schema(description = "매출매입 flag", example = "true")
    private Boolean inoutFlag;

    @Schema(description = "적용일자", example = "2024-01-01")
    private LocalDate applyDate;

    @Schema(description = "인상전 단가", example = "1000000")
    private Double beforePrice;

    @Schema(description = "인상후 단가", example = "1000000")
    private Double afterPrice;

    @Size(max = 255, message = "인상요인은 255자 이내로 입력해주세요.")
    @Schema(description = "인상요인", example = "인상요인")
    private String reasonDesc;
} 