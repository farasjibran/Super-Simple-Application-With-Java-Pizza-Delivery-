package com.company;

import java.util.Scanner;

public
class Main
    {

        public static
        void main(String[] args)
            {
                // write your code here

                // Scanner
                Scanner input = new Scanner(System.in);

                // List Menu
                String[][] menu = {
                        {"pizza cheesy bread", "30500"},
                        {"pizza calzone", "33000"},
                        {"pizza apple strudel", "17000"},
                        {"pizza lasagna", "20000"}
                };

                // List Topping
                String[][] topping = {
                        {"extra cheese", "12000"},
                        {"extra beef", "12000"},
                        {"extra vegetables", "10000"}
                };

                // MySecondClass
                MySecondClass.Coba("Selamat Datang Di Pizza Apa Adanya");
                MySecondClass.Coba("MENU YANG TERSEDIA :");
                MySecondClass.Coba("------------------------");

                // Untuk Memunculkan Menu
                for (String[] namamakan : menu)
                    {
                        for (String menumakan : namamakan)
                            {
                                System.out.print(menumakan + " ");
                            }
                        System.out.println();
                    }
                MySecondClass.Coba("------------------------");

                // Variable
                boolean looping = true;
                boolean info = false;
                int uang = 0;
                int uangtopping = 0;
                int totalkedua;
                String konfirmasi = "";
                String toppingpilihan = "";

                // Inputan
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

                // Loop untuk produk apabila barang tidak tersedia
                while (looping)
                    {
                        if (!info)
                            {
                                MySecondClass.Error("Produk Yang Anda Pilih Tidak Ada");
                                System.out.println("Apakah anda ingin mencari lagi ? (y/n) ");
                                konfirmasi = input.nextLine().toLowerCase();
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

                                // Fitur menambahkan topping
                                MySecondClass.Coba("Apakah anda ingin menambahkan topping? (y/n)");
                                konfirmasi = input.nextLine().toLowerCase();
                                if (konfirmasi.contains("n"))
                                    {
                                        looping = false;
                                    }
                                else
                                    {
                                        MySecondClass.Coba("------------------------");
                                        MySecondClass.Coba("TOPPING YANG TERSEDIA : ");

                                        // Untuk Memunculkan Topping
                                        for (String[] namatopping : topping)
                                            {
                                                for (String toppingmenu : namatopping)
                                                    {
                                                        System.out.print(toppingmenu + " ");
                                                    }
                                                System.out.println();
                                            }
                                        MySecondClass.Coba("------------------------");
                                        MySecondClass.Coba("Topping Yang Dipilih : ");
                                        toppingpilihan = input.nextLine().toLowerCase();
                                        for (String[] namatopping : topping)
                                            {
                                                for (String toppingmenu : namatopping)
                                                    {
                                                        if (toppingmenu.equals(toppingpilihan))
                                                            {
                                                                uangtopping = MySecondClass
                                                                        .KonvertInt(
                                                                                namatopping[1].trim());
                                                                info = true;
                                                            }
                                                    }
                                            }
                                        MySecondClass
                                                .Coba("Anda telah membeli " + pilihan +
                                                      " dengan tambahan topping " +
                                                      toppingpilihan + " dengan total harga " +
                                                      MySecondClass.KonvertString(uang + uangtopping));
                                        MySecondClass.Coba("Total Harga : " +
                                                           MySecondClass
                                                                   .KonvertString(uang + uangtopping));
                                        MySecondClass.Coba("Masukkan Uang Anda : ");
                                        int uanganda = input.nextInt();

                                        // Loop apabila uang yang di bayar saat pembayaran kurang
                                        while (looping)
                                            {
                                                if (uanganda < uang + uangtopping)
                                                    {
                                                        MySecondClass
                                                                .Coba("Uang yang anda masukkan kurang. silahkan coba lagi");
                                                        MySecondClass.Coba("Masukkan Uang Anda : ");
                                                        uanganda = input.nextInt();
                                                        if (uanganda == uang + uangtopping)
                                                            {
                                                                totalkedua = uang + uangtopping;
                                                                int totaluang = uanganda - totalkedua;
                                                                MySecondClass.Coba("Kembalian : " +
                                                                                   MySecondClass
                                                                                           .KonvertString(
                                                                                                   totaluang));
                                                                MySecondClass
                                                                        .Coba("---- TerimaKasih Telah Berbelanja Di Toko Kami ----");
                                                                looping = false;
                                                            }
                                                    }
                                                else
                                                    {
                                                        totalkedua = uang + uangtopping;
                                                        int totaluang = uanganda - totalkedua;
                                                        MySecondClass
                                                                .Coba("Kembalian : " +
                                                                      MySecondClass.KonvertString(
                                                                              totaluang));
                                                        MySecondClass
                                                                .Coba("---- TerimaKasih Telah Berbelanja Di Toko Kami ----");
                                                        looping = false;
                                                    }
                                            }
                                    }
                            }
                        else
                            {
                                // Fitur menambahkan topping
                                MySecondClass.Coba("Apakah anda ingin menambahkan topping? (y/n)");
                                konfirmasi = input.nextLine().toLowerCase();
                                if (konfirmasi.contains("n"))
                                    {
                                        // Apabila pizza tidak ditambahkan topping maka pembayaran seperti berikut
                                        MySecondClass
                                                .Coba("Anda telah membeli " + pilihan + " dengan harga " +
                                                      MySecondClass.KonvertString(uang));
                                        MySecondClass
                                                .Coba("Total Harga : " + MySecondClass.KonvertString(uang));
                                        MySecondClass.Coba("Masukkan Uang Anda : ");
                                        int uanganda = input.nextInt();

                                        // Loop apabila uang yang di bayar saat pembayaran kurang
                                        while (looping)
                                            {
                                                if (uanganda < uang)
                                                    {
                                                        MySecondClass
                                                                .Coba("Uang yang anda masukkan kurang. silahkan coba lagi");
                                                        MySecondClass.Coba("Masukkan Uang Anda : ");
                                                        uanganda = input.nextInt();
                                                        if (uanganda == uang)
                                                            {
                                                                int totaluang = uanganda - uang;
                                                                MySecondClass.Coba("Kembalian : " +
                                                                                   MySecondClass
                                                                                           .KonvertString(
                                                                                                   totaluang));
                                                                MySecondClass
                                                                        .Coba("---- TerimaKasih Telah Berbelanja Di Toko Kami ----");
                                                                looping = false;
                                                            }
                                                    }
                                                else
                                                    {
                                                        int totaluang = uanganda - uang;
                                                        MySecondClass
                                                                .Coba("Kembalian : " +
                                                                      MySecondClass
                                                                              .KonvertString(totaluang));
                                                        MySecondClass
                                                                .Coba("---- TerimaKasih Telah Berbelanja Di Toko Kami ----");
                                                        looping = false;
                                                    }
                                            }
                                    }
                                else
                                    {
                                        MySecondClass.Coba("------------------------");
                                        MySecondClass.Coba("TOPPING YANG TERSEDIA : ");

                                        // Untuk Memunculkan Topping
                                        for (String[] namatopping : topping)
                                            {
                                                for (String toppingmenu : namatopping)
                                                    {
                                                        System.out.print(toppingmenu + " ");
                                                    }
                                                System.out.println();
                                            }
                                        MySecondClass.Coba("------------------------");
                                        MySecondClass.Coba("Topping Yang Dipilih : ");
                                        toppingpilihan = input.nextLine().toLowerCase();
                                        for (String[] namatopping : topping)
                                            {
                                                for (String toppingmenu : namatopping)
                                                    {
                                                        if (toppingmenu.equals(toppingpilihan))
                                                            {
                                                                uangtopping = MySecondClass
                                                                        .KonvertInt(namatopping[1].trim());
                                                                info = true;
                                                            }
                                                    }
                                            }

                                        // Apabila pizza ditambahkan topping maka pembayaran seperti berikut
                                        MySecondClass
                                                .Coba("Anda telah membeli " + pilihan +
                                                      " dengan tambahan topping " +
                                                      toppingpilihan + " dengan total harga " +
                                                      MySecondClass.KonvertString(uang + uangtopping));
                                        MySecondClass.Coba("Total Harga : " +
                                                           MySecondClass
                                                                   .KonvertString(uang + uangtopping));
                                        MySecondClass.Coba("Masukkan Uang Anda : ");
                                        int uanganda = input.nextInt();

                                        // Loop apabila uang yang di bayar saat pembayaran kurang
                                        while (looping)
                                            {
                                                if (uanganda < uang + uangtopping)
                                                    {
                                                        MySecondClass
                                                                .Coba("Uang yang anda masukkan kurang. silahkan coba lagi");
                                                        MySecondClass.Coba("Masukkan Uang Anda : ");
                                                        uanganda = input.nextInt();
                                                        if (uanganda == uang + uangtopping)
                                                            {
                                                                totalkedua = uang + uangtopping;
                                                                int totaluang = uanganda - totalkedua;
                                                                MySecondClass.Coba("Kembalian : " +
                                                                                   MySecondClass
                                                                                           .KonvertString(
                                                                                                   totaluang));
                                                                MySecondClass
                                                                        .Coba("---- TerimaKasih Telah Berbelanja Di Toko Kami ----");
                                                                looping = false;
                                                            }
                                                    }
                                                else
                                                    {
                                                        totalkedua = uang + uangtopping;
                                                        int totaluang = uanganda - totalkedua;
                                                        MySecondClass
                                                                .Coba("Kembalian : " +
                                                                      MySecondClass.KonvertString(
                                                                              totaluang));
                                                        MySecondClass
                                                                .Coba("---- TerimaKasih Telah Berbelanja Di Toko Kami ----");
                                                        looping = false;
                                                    }
                                                break;
                                            }
                                    }
                            }
                    }
            }
    }