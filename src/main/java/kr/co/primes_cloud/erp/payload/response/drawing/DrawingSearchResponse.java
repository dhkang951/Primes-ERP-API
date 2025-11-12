package kr.co.primes_cloud.erp.payload.response.drawing;

import com.lts5.init.dto.FileLinkDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DrawingSearchResponse {

    // Drawing 엔티티의 기본 필드들
    private Long id;
    private Short tenantId;
    private Boolean isUse;
    private Boolean isDelete;
    private Long itemId;
    private Long progressId;
    private Short itemNo;
    private String itemNumber;
    private String itemName;
    private String itemSpec;
    private String itemModel;
    private String manufacturerName;
    private String drawingType;
    private String drawingTypeDescription;
    private String drawingNumber;
    private String drawingName;
    private String drawingVersion;
    private LocalDate drawingCreateDate;
    private String drawingChargerName;
    private String revisionDetails;
    private LocalDate revisionDate;
    private String startCommandNo;
    private String endCommandNo;
    private String startLotNo;
    private String endLotNo;
    private String eoNo;
    private String eoCode;
    private LocalDate eoApplyDate;
    private String createdBy;
    private LocalDateTime createdAt;
    private String updatedBy;
    private LocalDateTime updatedAt;

    // FileLink 정보
    private List<FileLinkDto> fileUrls;
}

