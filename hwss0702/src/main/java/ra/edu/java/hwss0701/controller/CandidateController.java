package ra.edu.java.hwss0701.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ra.edu.java.hwss0701.model.dto.request.CandidateCreateDTO;
import ra.edu.java.hwss0701.model.dto.response.ApiDataResponse;
import ra.edu.java.hwss0701.model.entity.Candidate;
import ra.edu.java.hwss0701.service.CandidateService;

@RestController
@RequestMapping("/api/candidates")
@RequiredArgsConstructor
public class CandidateController {
    private final CandidateService candidateService;
    @PostMapping
    public ResponseEntity<ApiDataResponse<Candidate>> createCandidate(@Valid @RequestBody CandidateCreateDTO candidateCreateDTO) {
        return new ResponseEntity<>(new ApiDataResponse<>(
                true,
                "Thêm mới ứng viên thành công!",
                candidateService.createCandidate(candidateCreateDTO),
                null,
                HttpStatus.CREATED
        ), HttpStatus.CREATED);
    }
}
