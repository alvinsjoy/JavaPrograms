import java.util.Scanner;
class Patient
{
    int id;
    int age;
    double bloodData;

    public Patient()
    {
        id=0;
        age=0;
        bloodData=0;
    }
    public Patient(int id, int age,double bloodData)
    {
        this.id = id;
        this.age = age;
        this.bloodData=bloodData;
    }
    int getId()
    {
        return id;
    }
    int getAge()
    {
        return age;
    }
    double getBloodData()
    {
        return bloodData;
    }
}
class TestPatient {
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the patient ID: ");
    	int id=sc.nextInt();
    	System.out.println("Enter the patient Age: ");
    	int age=sc.nextInt();
    	System.out.println("Enter the patient Blood Data: ");
    	double bloodData2=sc.nextDouble();
        Patient patient1 = new Patient();
        System.out.println("Patient 1 Default:");
        System.out.println("ID: " + patient1.getId());
        System.out.println("Age: " + patient1.getAge());
        System.out.println("Blood Data: " + patient1.getBloodData());
        
        Patient patient2 = new Patient(id,age,bloodData2);
        System.out.println("Patient 2 Overloaded:");
        System.out.println("ID: " + patient2.getId());
        System.out.println("Age: " + patient2.getAge());
        System.out.println("Blood Data: " + patient2.getBloodData());
    }
}
