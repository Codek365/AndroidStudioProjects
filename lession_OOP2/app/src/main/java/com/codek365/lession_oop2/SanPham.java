package com.codek365.lession_oop2;

/**
 * Created by nguyendangkhoa on 10/5/15.
 */
public class SanPham {

    public String TenSP;
    private Integer Gia;

    public void setGia(Integer x){
        if (x<0){
            Gia = 0;
        } else {
            Gia = x;
        }
    }

    public Integer getGia(){
        return Gia;
    }
}