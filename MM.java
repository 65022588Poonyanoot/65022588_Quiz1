class Main{
    public static void main(String[] args) {
    Student Maprang = new Student(650,"Maprang",65,3.00);
    Maprang.ShowDetails();
    Maprang.Setting(650,"Maprang",65,3.00);
    Maprang.ShowDetails();       
    }
}

class Student{

    private int ID;
    private String Name;
    private int AddmissionYear;
    private double GPA;

    Student(int ID , String Name , int AddmissionYear , double GPA){
        this.ID = ID;
        this.Name = Name;
        this.AddmissionYear = AddmissionYear;
        this.GPA = GPA;
    }

    public void ShowDetails(){
        System.out.println("ID : " + this.ID);
        System.out.println("Name : " + this.Name);
        System.out.println("Addmission Year : " + this.AddmissionYear);
        System.out.println("GPA : " + this.GPA);
    }

    public void Setting(int ID , String Name , int AddmissionYear , double GPA){
        this.ID = ID;
        this.Name = Name;
        this.AddmissionYear = AddmissionYear;
        this.GPA = GPA; 
    }
}