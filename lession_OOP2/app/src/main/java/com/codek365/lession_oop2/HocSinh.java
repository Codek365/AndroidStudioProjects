package com.codek365.lession_oop2;

/**
 * Created by nguyendangkhoa on 10/5/15.
 */
public class HocSinh {

    public String HoTen;
    private Double Toan;
    private Double Ly;
    private Double Hoa;

    public HocSinh(String hoTen, Double toan, Double ly, Double hoa) {
        HoTen = hoTen;

        if (toan<0) {
            Toan = 0.0;
        } else if (toan>10){
            Toan = 10.0;
        } else {
            Toan = toan;
        }

        Ly = ly;
        Hoa = hoa;
    }
}
