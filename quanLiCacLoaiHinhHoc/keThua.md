Câu 1:

Trình bày khái niệm Kế thừa (Inheritance) trong OOP. Nêu rõ lợi ích của kế thừa?
Kế thừa (Inheritance):
- Là một tính chất quan trọng của OOP,
- cho phép 1 lớp con(subclass) kế thừa 1 lớp cha(superclass),
- Giúp tái sử dụng mã nguồn

Từ khóa super được sử dụng trong kế thừa như thế nào?
- Dùng để gọi đến các thành phần(constructor, thuộc tính, phương thức) của lớp cha từ lớp con,
- Thường dùng trong constructor của lớp con để gọi đến constructor của lớp cha,

class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name); // Gọi constructor của lớp cha
    }

    @Override
    public void speak() {
        super.speak(); // Gọi phương thức lớp cha
        System.out.println("Gâu gâu!");
    }
}
