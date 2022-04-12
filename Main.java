import java.io.IOException;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    try {
      Service1 s = new Service1();
      s.addStudent(new Student("Krzysztof", 20,"20.02.2022"));
      s.addStudent(new Student("Janusz", 40,"20.02.2022"));

      
      String imie;
      int wiek;
      String data;
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
          System.out.println("Podaj date urodzin");
          data=sc.next();
          s.addStudent(new Student(imie, wiek, data));
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