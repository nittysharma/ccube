package com.spice.indosat.seller.ccube.dao;

/**
 * Created by nitin.kumar1 on 3/18/2017.
 */

import com.spice.indosat.seller.ccube.persistance.TblSellers;
import org.springframework.data.repository.CrudRepository;

public interface SellerRepo extends CrudRepository<TblSellers, Long> {
}
