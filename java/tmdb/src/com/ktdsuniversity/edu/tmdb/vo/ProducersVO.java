package com.ktdsuniversity.edu.tmdb.vo;

public class ProducersVO {
	private String producerId;
	private String producerName;
	
	public String getProducerId() {
		return producerId;
	}
	public void setProducerId(String producerId) {
		this.producerId = producerId;
	}
	public String getProducerName() {
		return producerName;
	}
	public void setProducerName(String producerName) {
		this.producerName = producerName;
	}
	@Override
	public String toString() {
		return "Producer) producerId: " + producerId + ", producerName: " + producerName + "\n";
	}
	
}
