// 7. Contoh Variable hiding, jadi kita mau manggil si parent tapi ketutupan sama class child 
class Parent {
    String name;
    void doIt() {
        System.out.println("Do it parents!!!!!");
    }
}


class Child extends Parent{
    String name;
    void doIt() {
        System.out.println("Do it childddddd!!!!!!!!!!");
        System.out.println("Parent name is " + super.name);
    }
}
