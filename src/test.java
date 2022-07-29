import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        //degiskenler
        int mat, fiz, kim, tr, trh, muz;
        //scanner tanımı
        Scanner inp = new Scanner(System.in);

        //kullanıcı veri girişi
        System.out.print("Matematik notunu giriniz: ");
        mat = inp.nextInt();
        System.out.println(mat);

        System.out.print("Fizik notunu giriniz: ");
        fiz = inp.nextInt();
        System.out.println(fiz);

        System.out.print("Kimya notunu giriniz: ");
        kim = inp.nextInt();
        System.out.println(kim);

        System.out.print("Turkce notunu giriniz: ");
        tr = inp.nextInt();
        System.out.println(tr);

        System.out.print("Tarih notunu giriniz: ");
        trh = inp.nextInt();
        System.out.println(trh);

        System.out.print("Muzik notunu giriniz: ");
        muz = inp.nextInt();
        System.out.println(muz);

        int toplam = (mat + fiz + kim + tr + trh + muz);
        double sonuc = toplam / 6;
        System.out.println("*****Derslerin ortalamasi:" + sonuc);
        //karşılaştırma
        String son = sonuc > 60 ? "sinifi gectiniz." : "sinifta kaldiniz.";
        System.out.println(son);
    }
}
