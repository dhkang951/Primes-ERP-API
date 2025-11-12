package kr.co.primes_cloud.erp.payload.request.drawing;

import com.lts5.init.entity.enums.DrawingType;
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
@Schema(description = "Drawing 검색 요청")
public class DrawingSearchRequest {

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

    @Schema(description = "아이템 ID", example = "1")
    private Long itemId;

    @Schema(description = "공정 ID", example = "1")
    private Long progressId;

    // Item 관련 검색 조건
    @Schema(description = "품번", example = "12345")
    private String itemNumber;

    @Schema(description = "품명", example = "샘플명")
    private String itemName;

    @Schema(description = "규격", example = "샘플값")
    private String itemSpec;

    @Schema(description = "모델명", example = "샘플값")
    private String itemModel;

    @Schema(description = "도면 타입", example = "FINISHED_PRODUCT", allowableValues = {"FINISHED_PRODUCT", "PROGRESS"})
    private DrawingType drawingType;

    @Schema(description = "도면번호", example = "DWG-001")
    private String drawingNumber;

    @Schema(description = "도면명", example = "샘플 도면")
    private String drawingName;

    @Schema(description = "도면 버전", example = "v1.0")
    private String drawingVersion;

    @Schema(description = "도면 작성일 시작", example = "2024-01-01")
    private LocalDate drawingCreateDateStart;

    @Schema(description = "도면 작성일 종료", example = "2024-12-31")
    private LocalDate drawingCreateDateEnd;

    @Schema(description = "담당자명", example = "홍길동")
    private String drawingChargerName;

    @Schema(description = "개정일 시작", example = "2024-01-01")
    private LocalDate revisionDateStart;

    @Schema(description = "개정일 종료", example = "2024-12-31")
    private LocalDate revisionDateEnd;

    @Schema(description = "시작 명령번호", example = "CMD-001")
    private String startCommandNo;

    @Schema(description = "종료 명령번호", example = "CMD-002")
    private String endCommandNo;

    @Schema(description = "시작 로트번호", example = "LOT-001")
    private String startLotNo;

    @Schema(description = "종료 로트번호", example = "LOT-002")
    private String endLotNo;

    @Schema(description = "EO 번호", example = "EO-001")
    private String eoNo;

    @Schema(description = "EO 코드", example = "EO-CODE-001")
    private String eoCode;

    @Schema(description = "EO 적용일 시작", example = "2024-01-01")
    private LocalDate eoApplyDateStart;

    @Schema(description = "EO 적용일 종료", example = "2024-12-31")
    private LocalDate eoApplyDateEnd;
}

