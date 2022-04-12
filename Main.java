import java.io.IOException;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    try {
      Service1 s = new Service1();
      s.addStudent(new Student("Krzysztof", 20));
      s.addStudent(new Student("Janusz", 40));

      
      String imie;
      int wiek;
      int i=0;
      while(i==0){
        System.out.println("Dodanie studenta wybierz 1");
      System.out.println("lista studentow wybierz 2");
         System.out.println("koniec programu wybierz 3");
      int wybierz;
      Scanner sc = new Scanner(System.in);
wybierz =sc.nextInt();
      switch(wybierz){
  case 1:
        System.out.println("Podaj Imie");
          imie=sc.next();
          System.out.println("Podaj wiek");
          wiek=sc.nextInt();
          s.addStudent(new Student(imie, wiek));
          break;
        case 2:{
      var students = s.getStudents();
      for(Student current : students) {
        System.out.println(current.ToString());
      }
          break;}
        case 3:
        {i=1;
          break;
          }
        default:
   System.out.println("koniec programu, brak wyboru");
      }}
    } catch (IOException e) {

    }
  }
}