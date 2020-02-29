package com.company;

public
class MySecondClass
    {

        //    Print String
        public static
        void Coba(String kata)
            {
                System.out.println(kata);
            }

        //    Print Error
        public static
        void Error(String kata)
            {
                System.err.println(kata);
            }

        //    Convert String To Integer
        public static
        int KonvertInt(String angka)
            {
                return Integer.parseInt(angka);
            }

        //    Convert Integer To String
        public static
        String KonvertString(int masukkan)
            {
                return String.valueOf(masukkan);
            }

    }
