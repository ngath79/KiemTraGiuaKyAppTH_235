package com.google.signinsignup;

public class ItemSubjects {
    private String tenmonhoc;
    private String mota;
    private int hinh;

    public ItemSubjects(String tenmonhoc, String mota, int hinh) {
        this.tenmonhoc = tenmonhoc;
        this.mota = mota;
        this.hinh = hinh;
    }

    public String getTenmonhoc() {
        return tenmonhoc;
    }

    public void setTenmonhoc(String tenmonhoc) {
        this.tenmonhoc = tenmonhoc;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
