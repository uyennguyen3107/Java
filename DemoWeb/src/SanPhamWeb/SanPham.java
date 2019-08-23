package SanPhamWeb;

public class SanPham {
    private String Ten;
    private String Gia;
    private String img;
	 
	
	public SanPham(String ten, String gia, String img) {
		super();
		Ten = ten;
		Gia = gia;
		this.img = img;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getTen() {
		return Ten;
	}
	public void setTen(String ten) {
		Ten = ten;
	}
	public String getGia() {
		return Gia;
	}
	public void setGia(String gia) {
		Gia = gia;
	}
    
}
