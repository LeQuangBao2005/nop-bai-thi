package model;

/*
  Tác giả: Lê Quang Bảo
 */
public class KhachHang {

    private String maso;
    private String hoten;
    private int loai;
    private double chisocu;
    private double chisomoi;

    public KhachHang() {
    }

    public KhachHang(String maso) {
        this.maso = maso;
    }

    public KhachHang(String maso, String hoten, int loai, double chisocu, double chisomoi) {
        this.maso = maso;
        this.hoten = hoten;
        this.loai = loai;
        this.chisocu = chisocu;
        this.chisomoi = chisomoi;
    }

    public String getMaso() {
        return maso;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getLoai() {
        return loai;
    }

    public void setLoai(int loai) {
        this.loai = loai;
    }

    public double getChisocu() {
        return chisocu;
    }

    public void setChisocu(double chisocu) {
        this.chisocu = chisocu;
    }

    public double getChisomoi() {
        return chisomoi;
    }

    public void setChisomoi(double chisomoi) {
        this.chisomoi = chisomoi;
    }

    //sinh viên cài đặt xử lý cho các phương thức sau    
    public double getTieuThu() {

        return chisomoi - chisocu;

    }

    public double getTienTra() {

        double tieuThu = getTieuThu();
        double giaTien = 0;

        if (loai == 1) {
            giaTien = tieuThu * 4575;
        } else if (loai == 2) {
            if (tieuThu <= 50) {
                giaTien = tieuThu * 1806;
            } else if (tieuThu <= 100) {
                giaTien = 50 * 1806 + (tieuThu - 50) * 1866;
            } else if (tieuThu <= 200) {
                giaTien = 50 * 1806 + 50 * 1866 + (tieuThu - 100) * 2167;
            } else if (tieuThu <= 300) {
                giaTien = 50 * 1806 + 50 * 1866 + 100 * 2167 + (tieuThu - 200) * 2729;
            } else if (tieuThu <= 400) {
                
            } else {
                
            }
        }

        return giaTien * 1.08;
    }
}
