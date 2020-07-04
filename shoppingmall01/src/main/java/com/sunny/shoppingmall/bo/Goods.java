/*
 * Created by IntelliJ IDEA.
 * User: VULCAN
 * Date: 2019/11/18
 * Time: 15:58
 */
package com.sunny.shoppingmall.bo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Goods {
    private int goodstypeid;
    private String manufacturer;
    private String goodsname;
    private String goodstype;
    private double price;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date goodsdate;
    private int stock;

}