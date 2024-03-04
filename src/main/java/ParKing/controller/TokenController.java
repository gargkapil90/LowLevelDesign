package ParKing.controller;

import ParKing.dto.requestDto.IssueTokenRequestDto;
import ParKing.dto.responseDto.IssueTokenResponseDto;
import ParKing.dto.responseDto.ResponseStatus;
import ParKing.model.Token;
import ParKing.service.TokenService;

public class TokenController {
    private TokenService tokenService;
    public TokenController(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    IssueTokenResponseDto IssueToken(IssueTokenRequestDto requestInfo) {
        IssueTokenResponseDto response = new IssueTokenResponseDto();
        try {
            Token token = tokenService.IssueToken(requestInfo.getVehicleNumber(),
                    requestInfo.getOwnerName(),
                    requestInfo.getGateId(),
                    requestInfo.getVehicleType());
            response.setToken(token);
            response.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception ex) {
            response.setFailureMessage(ex.getMessage());
            response.setResponseStatus(ResponseStatus.FAILED);
        }
        return response;
    }
}
