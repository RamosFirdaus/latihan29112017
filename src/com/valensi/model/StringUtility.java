package com.valensi.model;

public class StringUtility {

    public static void main(String[] args) {
        try{
            Scanner scan;
            scan = new Scanner (new File("C:/JAVA_LATIHAN/dataproduk.txt"));
            ArrayList<Product>product = new ArrayList<>();
            while (scan.hasNextLine()){
        }

        String produkDanHarga = scan.nextLine();
        String[] data = produkDanHarga.split(",");
        String namaProduk = data[0];
        String clear = data[1].trim();
        double harga = double.parseDouble(clear);
        Product p = new Product (namaProduk, harga);
        product.adp(p);
        
        System.out.println(namaProduct);
        System.out.println(harga);

    }

}
