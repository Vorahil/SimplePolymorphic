//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        Pet cat = new Cat();
        Pet dog = new Dog();
        Food fish = new Fish();
        Food bone = new Bone();
        Master me = new Master();
        me.Feed(cat,fish);
        me.Feed(dog,bone);
        me.eat(cat);
        me.cry(dog);
    }
}

