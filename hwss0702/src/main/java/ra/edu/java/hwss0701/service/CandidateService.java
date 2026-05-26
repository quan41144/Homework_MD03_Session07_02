package ra.edu.java.hwss0701.service;

import ra.edu.java.hwss0701.model.dto.request.CandidateCreateDTO;
import ra.edu.java.hwss0701.model.entity.Candidate;

public interface CandidateService {
    Candidate createCandidate(CandidateCreateDTO candidateCreateDTO);
}
