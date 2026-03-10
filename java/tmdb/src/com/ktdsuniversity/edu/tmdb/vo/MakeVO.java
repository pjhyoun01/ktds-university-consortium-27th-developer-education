package com.ktdsuniversity.edu.tmdb.vo;

public class MakeVO {
	private String makeId;
	private String movieId;
	private String producerId;
	private String producerRole;
	private String producerPart;
	private ProducersVO producersVO;
	
	public String getMakeId() {
		return makeId;
	}
	public void setMakeId(String makeId) {
		this.makeId = makeId;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getProducerId() {
		return producerId;
	}
	public void setProducerId(String producerId) {
		this.producerId = producerId;
	}
	public String getProducerRole() {
		return producerRole;
	}
	public void setProducerRole(String producerRole) {
		this.producerRole = producerRole;
	}
	public String getProducerPart() {
		return producerPart;
	}
	public void setProducerPart(String producerPart) {
		this.producerPart = producerPart;
	}
	public ProducersVO getProducersVO() {
		return producersVO;
	}
	public void setProducersVO(ProducersVO producersVO) {
		this.producersVO = producersVO;
	}
	@Override
	public String toString() {
		return "Make) makeId: " + makeId + ", movieId: " + movieId + ", producerId: " + producerId + ", producerRole: "
				+ producerRole + ", producerPart: " + producerPart + ", producerName: " + producersVO.getProducerName() + "\n";
	}
	
}
