package com.spice.indosat.seller.ccube.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spice.indosat.seller.ccube.pojo.*;
import com.spice.indosat.seller.ccube.service.*;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/seller")
public class SellerController {
	@Autowired
	public SellerService sellerService;

    @RequestMapping("/")
    public ResponseObj getSellerList(){
        ResponseObj responseObj=new ResponseObj();
            responseObj.setObject(this.sellerService.getSellerList());
            responseObj.setMessage("success");
            responseObj.setStatus("200");
            responseObj.setStatus_code(200);
            return responseObj;
    }
    @ApiImplicitParams({
        @ApiImplicitParam(name = "id", value = "Seller id",
                         required = true, dataType = "long", paramType = "requestparam")
     })
     @ApiOperation(value = "get seller by id")
    @RequestMapping("/{id}")
    public ResponseObj getSellerById(@RequestParam("id") Long id){
    	ResponseObj responseObj=new ResponseObj();
        responseObj.setObject(this.sellerService.getSellerId(id));
        responseObj.setMessage("success");
        responseObj.setStatus("200");
        responseObj.setStatus_code(200);
        return responseObj;
    }
}