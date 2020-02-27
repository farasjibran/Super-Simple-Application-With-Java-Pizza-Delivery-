package com.company;

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
                        {"pizza apple strudel", "17000"},
                        {"pizza lasagna", "20000"}
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

                //                Variable
                boolean looping = true;
                boolean info = false;
                int uang = 0;

                //                Inputan
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

                //                Loop untuk produk apabila barang tidak tersedia
                while (looping)
                    {
                        if (!info)
                            {
                                MySecondClass.Coba("Produk Yang Anda Pilih Tidak Ada");
                                System.out.println("Apakah anda ingin mencari lagi ? (y/n) ");
                                String konfirmasi = input.nextLine().toLowerCase();
                                if (konfirmasi.contains("n"))
                                    {
                                        looping = false;
                                    }
                                else
                                    {
                                        MySecondClass.Coba("Pizza Yang Dipilih : ");
                                        pilihan = input.nextLine().toLowerCase();
                                        for (String[] makanan : menu)
                                            {
                                                for (String dimakan : makanan)
                                                    {
                                                        if (dimakan.equals(pilihan))
                                                            {
                                                                uang = MySecondClass
                                                                        .KonvertInt(makanan[1].trim());
                                                                info = true;
                                                            }
                                                    }
                                            }
                                    }
                            }
                        else
                            {
                                MySecondClass.Coba("Total Harga : " + MySecondClass.KonvertString(uang));
                                MySecondClass.Coba("Masukkan Uang Anda : ");
                                int uanganda = input.nextInt();

                                //                  Loop apabila uang yang di bayar saat pembayaran kurang
                                while (looping)
                                    {
                                        if (uanganda < uang)
                                            {
                                                MySecondClass.Coba("Uang yang anda masukkan kurang. silahkan coba lagi");
                                                MySecondClass.Coba("Masukkan Uang Anda : ");
                                                uanganda = input.nextInt();
                                                if (uanganda == uang)
                                                    {
                                                        int totaluang = uanganda - uang;
                                                        MySecondClass.Coba("Kembalian : " +
                                                                           MySecondClass.KonvertString(totaluang));
                                                        MySecondClass
                                                                .Coba("---- TerimaKasih Telah Berbelanja Di Toko Kami ----");
                                                        looping = false;
                                                    }
                                            }
                                        else
                                            {
                                                int totaluang = uanganda - uang;
                                                MySecondClass
                                                        .Coba("Kembalian : " + MySecondClass.KonvertString(totaluang));
                                                MySecondClass
                                                        .Coba("---- TerimaKasih Telah Berbelanja Di Toko Kami ----");
                                                looping = false;
                                            }
                                    }
                                break;
                            }
                    }
            }
    }