public class Lingkaran {
   private double phi=3.14;
   private int d;
   private double keliling;

   public void hitungkeliling(){
       this.keliling = phi*d;
   }
   public void setd(int d){
       this.d = d;
   }
   public double getKeliling(){
       return keliling;
   }
}
