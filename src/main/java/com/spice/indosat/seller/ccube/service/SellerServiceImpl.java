package com.spice.indosat.seller.ccube.service;

import com.spice.indosat.seller.ccube.dao.SellerRepo;
import com.spice.indosat.seller.ccube.persistance.TblSellers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by nitin.kumar1 on 3/18/2017.
 */
@Service
public class SellerServiceImpl implements  SellerService {

    @Autowired
    SellerRepo sellerRepo;
    @Override
    @Transactional
    public Iterable<TblSellers> getSellerList() {
        return this.sellerRepo.findAll();
    }
	@Override
	public TblSellers getSellerId(Long id) {
		return this.sellerRepo.findOne(id);
	}
}
