package com.spice.indosat.seller.ccube.service;

import com.spice.indosat.seller.ccube.persistance.TblSellers;

import java.util.List;

/**
 * Created by nitin.kumar1 on 3/18/2017.
 */
public interface SellerService {
    Iterable<TblSellers> getSellerList();

	TblSellers getSellerId(Long id);
}
