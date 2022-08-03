package encapsulation26;

public class TestEncapsulation {

    public static void main(String[] args) {
        Encapsulate obj=new Encapsulate();
        obj.setName("Divya");
        obj.setAge(19);
        obj.setRollNo(51);

        System.out.println("Codebusters name : " +obj.getName());
        System.out.println("Codebuster age : " +obj.getAge());
        System.out.println("Codebuster rollno : "+obj.getRollNo());


    }

}
