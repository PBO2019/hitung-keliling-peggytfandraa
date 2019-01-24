public class BujurSangkar {
    public static void main(String [] args){
        BujurSangkar1 satu = new BujurSangkar1();
        satu.hasil();
    }
}
 class BujurSangkar1{
    public int sisi = 4;
    public double hasil;

    public void hasil(){
        hasil = 4*sisi;
        System.out.println("Keliling Bujur Sangkarnya adalah = " + hasil);
    }
 }