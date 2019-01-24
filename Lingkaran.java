public class Lingkaran {
    public static void main(String [] args){
        Lingkaran1 satu = new Lingkaran1();
        satu.hasil();
    }
}
class Lingkaran1{
    public double phi = 3.14;
    public int d = 10;
    public double hasil;

    public void hasil(){
        hasil = phi*d;
        System.out.println("Keliling lingkarannya adalah = " + hasil);
    }
}
