package test;

public class Study {
	public 	String name;
	public int mahocsinh;
	public int diemtoan;
	public int diemvan;

	public Study() {}
	
	
	public Study( String name, int mahocsinh, int diemtoan, int diemvan) {
	this.name="duc";
	this.mahocsinh=8;
	this.diemtoan=9;
	this.diemvan=7;
		}
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMahocsinh() {
		return mahocsinh;
	}


	public void setMahocsinh(int mahocsinh) {
		this.mahocsinh = mahocsinh;
	}


	public int getDiemtoan() {
		return diemtoan;
	}


	public void setDiemtoan(int diemtoan) {
		this.diemtoan = diemtoan;
	}


	public int getDiemvan() {
		return diemvan;
	}


	public void setDiemvan(int diemvan) {
		this.diemvan = diemvan;
	}


	public void diemtb() { 
		System.out.println("Diem trung binh la: "+(diemtoan+diemvan/2));
	
	}
	
	
	
	
public static void main(String [] args) {
	Study to1=new Study();

	
}
	
	
	
	
	
	
	
	
	
	

}
