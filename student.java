public class student {
    int id;
    String name;
    float marks;

    student() {
        System.out.println("In COnstructor");
    }
    student( int id , String name , float marks) {
        System.out.println("In COnstructor parameterised");
        this.id=id;
        this.name=name;
        this.marks=marks;
        // System.out.println(this.id,this.name,this.marks);

    }
    public static void main(String[] args) {
     student s1 = new student();   
     student s2 = new student(1,"Amit",89); 

     
    }

}
