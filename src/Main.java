import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float mat,fiz,turk,muzik,kimya;
        Scanner inp = new Scanner(System.in);

        System.out.println("lütfen mat notunuzu giriniz ?");
        mat = inp.nextFloat();
        if(mat <0 && mat > 100)
        {
            mat =inp.nextFloat();
        }

        System.out.println("lütfen fiz notunuzu giriniz ?");
        fiz = inp.nextFloat();
        if(fiz <0 && fiz > 100)
        {
            fiz =inp.nextFloat();
        }
        System.out.println("lütfen turk notunuzu giriniz ?");
        turk = inp.nextFloat();
        if(turk <0 && turk > 100)
        {
            turk =inp.nextFloat();
        }
        System.out.println("lütfen muzik notunuzu giriniz ?");
        muzik = inp.nextFloat();
        if(muzik <0 && muzik > 100)
        {
            muzik =inp.nextFloat();
        }
        System.out.println("lütfen kimya notunuzu giriniz ?");
        kimya = inp.nextFloat();
        if(kimya <0 && kimya > 100)
        {
            kimya =inp.nextFloat();
        }
        float avarage;
        avarage = (mat + turk + fiz + muzik + kimya)/5;
        if(avarage < 55){
            System.out.println("sınıfı geçemediniz üzgünüz :/");
        }
        else

            System.out.println("tebrikler sınıfı başarıyla geçtiniz :)");

        }

    }