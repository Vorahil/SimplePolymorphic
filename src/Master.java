class Master {
    public void Feed(Pet pet,Food food){
        System.out.println("这个宠物名字是"+pet.getName()+"他的年龄是"+pet.getAge());
        System.out.println("他最喜爱的食物"+food.getName()+"价格是"+food.getPrice());
    }
    public void eat(Pet pet){
        pet.eat();
    }
    public void cry(Pet pet){
        pet.cry();
    }
}
