package com.ranufrozen.models;

public class Item {    
    private int quantity;
//    nanti ambil datanya dari active record
//    nanti contek halaman product 
    public Item(int quantity){        
        this.quantity = quantity;
    }

    // input: productStock, itemBought
    // output: valid/invalid
    // event: onClick at button 'buy' in product page
    public boolean checkLimitBuying(int prodStock){
        // sebelum masuk ke cart, produk harus dicek dulu 
        // apakah item.quantity sesuai dengan product.stock atau belum?        

        // jika stok diatas quantity yang diminta user, maka valid
        if(prodStock > this.quantity) {
            return true;
        }else {
            return false;
        }
    }   
}
