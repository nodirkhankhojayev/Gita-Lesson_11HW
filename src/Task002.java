public class Task002 {
    public static void main(String[] args) {
        System.out.println("TASk 1");
        Fruit apple = new Fruit("apple", "red", 100);
        System.out.println("name: " + apple.getName() + ", color: " + apple.getColor() + ", weight: " + apple.getWeight());

        System.out.println();
        System.out.println("TASk 2");
        Shape square = new Shape("square", "red", 4, 4, 16);
        square.show();

        System.out.println();
        System.out.println("TASk 3");
        Student student = new Student(1, "Aziz", 20, "P311");
        student.show();

        System.out.println();
        System.out.println("TASk 4");
        Kasr kasr2 = new Kasr(2, 2);
        Kasr kasr3 = new Kasr(3, 3);
        kasr2.add(kasr3);
        System.out.println("surat: " + kasr2.getSurat() + ", maxraj: " + kasr2.getMaxraj());

        System.out.println();
        System.out.println("TASk 5");
        Rectangle rectangle1 = new Rectangle(3, 4);
        Rectangle rectangle2 = new Rectangle(4, 4);
        System.out.println("rectangle1: " + rectangle1.isSquare(rectangle1));
        System.out.println("rectangle2: " + rectangle2.isSquare(rectangle2));

        System.out.println();
        System.out.println("TASk 6");
        Music music1 = new Music("Shirin Xotiralar", "Yoshligim", "03:45", "Asosiy Qo'shiq", "Qo'shiq matni...");
        Music music2 = new Music("Yor-Yor", "Dostonlar", "04:20", "Chorlar", "Qo'shiqning matni...");
        music1.play();
        music2.play();

        System.out.println();
        System.out.println("Task 7");
        Contact contact1 = new Contact("Ali Valiyev", "+998901234567", "ali.valiyev@example.com", "Toshkent, Uzbekistan", true);
        Contact contact2 = new Contact("Olim Karimov", "+998911112233", "olim.karimov@example.com", "Samarqand, Uzbekistan", false);

        contact1.show();
        System.out.println();
        contact2.show();
     }
}

//Task 1
class Fruit{
    private String name;
    private String color;
    private int weight;

    Fruit(String name, String color, int weight){
        this.color = color;
        this.name = name;
        this.weight = weight;
    }

    public String getName(){
        return name;
    }

    public String getColor(){
        return color;
    }

    public int getWeight(){
        return weight;
    }

}

//TAsk 2
class Shape{
    private String name;
    private String color;
    private int perimeter;
    private int area;
    private  int size;

    Shape(String name, String color, int size,int perimeter, int area){
        this.name = name;
        this.color = color;
        this.perimeter = perimeter;
        this.area = area;
        this.size = size;
    }

    public int getSize(){
        return size;
    }
    public void  show(){
        System.out.println("tomonlari: " + getSize() + ", perimetri: " + perimeter + ", area: " + area);
    }

}

//Task 3
class Student{
    private int id;
    private String name;
    private int age;
    private String group;

    Student(int id, String name, int age, String group){
        this.id = id;
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getGroup(){
        return group;
    }

    public void show(){
        System.out.println("id: " + getId() + ", name: " + getName() + ", age: " + getAge() + ", group: " + getGroup());
    }
}

//Task 4
class Kasr{
    private int surat;
    private int maxraj;

    Kasr(int surat, int maxraj){
        this.surat = surat;
        this.maxraj = maxraj;
    }

    public int getSurat(){
        return surat;
    }
    public int getMaxraj(){
        return maxraj;
    }

    public void add(Kasr kasr){
        this.surat += kasr.getSurat();
        this.maxraj += kasr.getMaxraj();
    }
}

//Task  5
class Rectangle{
    private int width;
    private int height;

    Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }

    public boolean isSquare(Rectangle rectangle){
        if(getWidth() == getHeight()){
            System.out.println("this is square");
            return true;
        }
        System.out.println("this is not square");
        return false;
    }
}

//Task 6
class Music {
    private String name;
    private String album;
    private String time;
    private String title;
    private String text;


    public Music(String name, String album, String time, String title, String text) {
        this.name = name;
        this.album = album;
        this.time = time;
        this.title = title;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public String getAlbum() {
        return album;
    }

    public String getTime() {
        return time;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public void play() {
        System.out.println("Musiqa ijro etilmoqda: " + name + " - " + title);
    }
}


//task 7
class Contact {
    private String name;
    private String number;
    private String email;
    private String address;
    private boolean favourite;

    public Contact(String name, String number, String email, String address, boolean favourite) {
        this.name = name;
        this.number = number;
        this.email = email;
        this.address = address;
        this.favourite = favourite;
    }

    public void show() {
        System.out.println("Contact Information:");
        System.out.println("Name: " + name);
        System.out.println("Number: " + number);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
        System.out.println("Favourite: " + (favourite ? "Yes" : "No"));
    }
}
