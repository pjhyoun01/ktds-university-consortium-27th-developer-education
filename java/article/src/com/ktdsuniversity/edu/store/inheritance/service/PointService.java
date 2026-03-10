package com.ktdsuniversity.edu.store.inheritance.service;

import com.ktdsuniversity.edu.store.inheritance.VO.CustomerVO;
import com.ktdsuniversity.edu.store.inheritance.dto.PointInfoDTO;

public interface PointService {
	int usePoint(PointInfoDTO pointInfoDTO);
	void savePoint(CustomerVO customerVO, int productPrice);
}
