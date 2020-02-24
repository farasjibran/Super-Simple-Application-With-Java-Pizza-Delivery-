package com.company;

import java.util.Arrays;
import java.util.Scanner;

public
class Main
    {

        public static
        void main(String[] args)
            {
                // write your code here

//        Scanner
                Scanner input = new Scanner(System.in);

//        List Menu
                String[][] menu = {
                        {"pizza cheesy bread", "30500"},
                        {"pizza calzone", "33000"},
                        {"pizza apple strudel", "17000"}
                };

//        MySecondClass
                MySecondClass.Coba("Selamat Datang Di Pizza Apa Adanya");
                MySecondClass.Coba("Menu Yang Tersedia :");
                MySecondClass.Coba("------------------------");

//        Untuk Memunculkan Menu
                for (String[] namamakan : menu)
                    {
                        for (String menumakan : namamakan)
                            {
                                System.out.print(menumakan + " ");
                            }
                        System.out.println();
                    }

                MySecondClass.Coba("------------------------");

//        Looping
                boolean looping = true;
                boolean info = false;
                int uang = 0;
                while (looping)
                    {

                        try
                            {
                                MySecondClass.Coba("Pizza Yang Dipilih : ");
                                String pilihan = input.nextLine().toLowerCase();
                                for (String[] makanan : menu)
                                    {
                                        for (String dimakan : makanan)
                                            {
                                                if (dimakan.equals(pilihan))
                                                    {
                                                        uang = MySecondClass.KonvertInt(makanan[1].trim());
                                                        info = true;
                                                    }
                                            }
                                    }

//                    Apabila produk yang dipilih tidak tersedia
                                if (!info)
                                    {
                                        MySecondClass.Coba("Produk Yang Anda Pilih Tidak Ada");
                                        System.out.println("Apakah anda ingin mencari lagi ? (y/n) ");
                                        String konfirmasi = input.nextLine().toLowerCase();
                                        if (konfirmasi.contains("n"))
                                            {
                                                return;
                                            }
                                        MySecondClass.Coba("Pizza Yang Dipilih : ");
                                        pilihan = input.nextLine().toLowerCase();
                                        for (String[] makanan : menu)
                                            {
                                                for (String dimakan : makanan)
                                                    {
                                                        if (dimakan.equals(pilihan))
                                                            {
                                                                uang = MySecondClass.KonvertInt(makanan[1]);
                                                                info = true;
                                                            }
                                                    }
                                            }
                                    }

                                MySecondClass.Coba("Total Harga : " + MySecondClass.KonvertString(uang));
                                MySecondClass.Coba("Masukkan Uang Anda : ");
                                int uanganda = input.nextInt();
                                int samadengan = uanganda - uang;
                                MySecondClass.Coba("Kembalian : " + MySecondClass.KonvertString(samadengan));
                                MySecondClass.Coba("------- Terimakasih Telah Membeli Pizza Di Toko Kami -------");
                                break;
                            }

                        catch (Exception e)
                            {
                                System.err.println("Error");;
                            }

                    }

            }
    }
