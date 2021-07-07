import java.util.Scanner;
 
public class BilanganPrima {
    public static void main(String args[])
    {
        // inisialisasi Fungsi
        Scanner input = new Scanner(System.in);
        // deklarasi variabel
        int mulai_dari, batas, jumlah;
 
        // main menu Program
        System.out.println("Program Menampilkan Deret Bilangan Prima");
        System.out.print("Mulai dari: ");
        mulai_dari = input.nextInt();
        System.out.print("Batas: ");
        batas = input.nextInt();
        System.out.println("------------------------------------------");
 
        for (int i=mulai_dari; i<=batas; i++)
        {
            jumlah=0;
            for (int j=1; j<=i; j++)
            {
                if (i%j==0)
                {
                    jumlah = jumlah+1;
                }
            }
            if (jumlah==2)
            {
                System.out.print(i+" ");
            }
        }
    }
}