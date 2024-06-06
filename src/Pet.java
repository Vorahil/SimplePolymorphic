class Pet {
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int age;


    public void cry(){
        System.out.println("我不会说话");
    }
    public void eat(){
        System.out.println("我不会吃");
    }
}
class Cat extends Pet {
    {
        super.setAge(10);
        super.setName("小丑");
    }

    @Override
    public void eat(){
        System.out.println("我爱耗子");
    }
    @Override
    public void cry(){
        System.out.println("嘿嘿嘿");
    }
    public String GetName(){
        return super.getName();
    }
     public int GetAge(){
        return super.getAge();
    }


}
class Dog extends Pet {
    {
        super.setAge(5);
        super.setName("shit");
    }

    @Override
    public void eat(){
        System.out.println("我爱猫肉");
    }
    @Override
    public void cry(){
        System.out.println("呃呃呃");
    }
    public String GetName(){
        return super.getName();
    }
     public int GetAge(){
        return super.getAge();
    }


}

