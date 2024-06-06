class Food {
    private String name;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int price;
    public Food() {
        System.out.println("==食物==");
    }
}
class Fish extends Food {
    {
        super.setName("鱼");
        super.setPrice(100);
    }
}
class Bone extends Food {
    {
        super.setName("骨头");
        super.setPrice(200);
    }
}

