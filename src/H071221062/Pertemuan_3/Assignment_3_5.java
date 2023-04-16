package H071221062.Pertemuan_3;

class Assignment_3_5 { //CLASS PRODUCT
    private String name;
    private int price;
    private int stock;

    public Assignment_3_5(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public Assignment_3_5(String name, String price, int stock) {
        this.name = name;
        this.stock = stock;

        if (price.contains("k")) {
            price = price.replace("k", "");
            this.price = Integer.parseInt(price) * 1000;
        } else {
            this.price = Integer.parseInt(price);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void sell() {
        stock--;
    }
}