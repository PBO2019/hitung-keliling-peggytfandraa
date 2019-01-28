public class Main {

    public static void main(String[] args){
        Lingkaran lingakaran = new Lingkaran();
        BujurSangkar bujursangkar = new BujurSangkar();

      lingakaran.setd(10);
      lingakaran.hitungkeliling();
        System.out.println("Keliling Lingkarannya adalah " + lingakaran.getKeliling() + " cm ");


      bujursangkar.setsisi(4);
      bujursangkar.hitungkeliling();
        System.out.println("Keliling Bujur Sangkarnya adalah " + bujursangkar.getKeliling() + " cm ");
    }


}
