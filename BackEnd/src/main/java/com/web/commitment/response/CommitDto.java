package com.web.commitment.response;

import java.util.List;

import lombok.Data;

@Data
public class CommitDto {
	private String email;

	private String region;

	private String nationalX;

	private String nationalY;

	private String localX;

	private String localY;

	private String address;
	
	private List<BoardCommitDto> board;
}
