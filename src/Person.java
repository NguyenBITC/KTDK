class Person{
   private String hoten;
   private int tuoi;
   private String gioitinh;
   public Person (){

   }
    public Person(String hoten,int tuoi, String gioitinh){
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.gioitinh = gioitinh;

    }
    
    
    public String getHoten() {
        return hoten;
    }
    public int getTuoi() {
        return tuoi;
    }
     public String getGioitinh() {
        return gioitinh;
    }
   
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
     public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }
}