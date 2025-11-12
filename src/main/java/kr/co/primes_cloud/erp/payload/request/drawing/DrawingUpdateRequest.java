package kr.co.primes_cloud.erp.payload.request.drawing;

import com.lts5.init.entity.enums.DrawingType;
import com.lts5.init.payload.request.filelink.FileLinkUpdateInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Drawing Update 요청")
public class DrawingUpdateRequest {

    @Schema(description = "사용여부", example = "true")
    private Boolean isUse;

    @Schema(description = "아이템 ID", example = "1")
    private Long itemId;

    @Schema(description = "공정 ID", example = "1")
    private Long progressId;

    @Schema(description = "도면 타입", example = "FINISHED_PRODUCT", allowableValues = {"FINISHED_PRODUCT", "PROGRESS"})
    private DrawingType drawingType;

    @Size(max = 100, message = "도면번호는 100자 이내로 입력해주세요.")
    @Schema(description = "도면번호", example = "DWG-001")
    private String drawingNumber;

    @Size(max = 100, message = "도면명은 100자 이내로 입력해주세요.")
    @Schema(description = "도면명", example = "샘플 도면")
    private String drawingName;

    @Size(max = 20, message = "도면 버전은 20자 이내로 입력해주세요.")
    @Schema(description = "도면 버전", example = "v1.0")
    private String drawingVersion;

    @Schema(description = "도면 작성일", example = "2024-01-01")
    private LocalDate drawingCreateDate;

    @Size(max = 30, message = "담당자명은 30자 이내로 입력해주세요.")
    @Schema(description = "담당자명", example = "홍길동")
    private String drawingChargerName;

    @Schema(description = "개정 내용", example = "수정 내용")
    private String revisionDetails;

    @Schema(description = "개정일", example = "2024-01-01")
    private LocalDate revisionDate;

    @Size(max = 30, message = "시작 명령번호는 30자 이내로 입력해주세요.")
    @Schema(description = "시작 명령번호", example = "CMD-001")
    private String startCommandNo;

    @Size(max = 30, message = "종료 명령번호는 30자 이내로 입력해주세요.")
    @Schema(description = "종료 명령번호", example = "CMD-002")
    private String endCommandNo;

    @Size(max = 30, message = "시작 로트번호는 30자 이내로 입력해주세요.")
    @Schema(description = "시작 로트번호", example = "LOT-001")
    private String startLotNo;

    @Size(max = 30, message = "종료 로트번호는 30자 이내로 입력해주세요.")
    @Schema(description = "종료 로트번호", example = "LOT-002")
    private String endLotNo;

    @Size(max = 100, message = "EO 번호는 100자 이내로 입력해주세요.")
    @Schema(description = "EO 번호", example = "EO-001")
    private String eoNo;

    @Size(max = 100, message = "EO 코드는 100자 이내로 입력해주세요.")
    @Schema(description = "EO 코드", example = "EO-CODE-001")
    private String eoCode;

    @Schema(description = "EO 적용일", example = "2024-01-01")
    private LocalDate eoApplyDate;

    @Schema(description = "파일 링크 목록")
    private List<FileLinkUpdateInfo> fileUrls;
}

