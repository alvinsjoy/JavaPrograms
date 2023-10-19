class BloodData
{
    private String bloodType;
    private char rhFactor;
    public BloodData()
    {
        this.bloodType = "O";
        this.rhFactor = '+';
    }
    public BloodData(String bloodType, char rhFactor)
    {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }
    String getBloodType()
    {
        return bloodType;
    }

    char getRhFactor()
    {
        return rhFactor;
    }
}

class Patient
{
    int id;
    int age;
    BloodData bloodData;

    public Patient() {
        this.id = 0;
        this.age = 0;
        this.bloodData = new BloodData();
    }
    public Patient(int id, int age, BloodData bloodData)
    {
        this.id = id;
        this.age = age;
        this.bloodData = bloodData;
    }
    public int getId()
    {
        return id;
    }
    public int getAge()
    {
        return age;
    }
    public BloodData getBloodData()
    {
        return bloodData;
    }
}
class TestPatient {
    public static void main(String[] args)
    {
        Patient patient1 = new Patient();
        System.out.println("Patient 1 Default:");
        System.out.println("ID: " + patient1.getId());
        System.out.println("Age: " + patient1.getAge());
        System.out.println("Blood Type: " + patient1.getBloodData().getBloodType());
        System.out.println("Rh Factor: " + patient1.getBloodData().getRhFactor());
        System.out.println();

        BloodData bloodData2 = new BloodData("A", '+');
        Patient patient2 = new Patient(12345, 30, bloodData2);
        System.out.println("Patient 2 Overloaded:");
        System.out.println("ID: " + patient2.getId());
        System.out.println("Age: " + patient2.getAge());
        System.out.println("Blood Type: " + patient2.getBloodData().getBloodType());
        System.out.println("Rh Factor: " + patient2.getBloodData().getRhFactor());
    }
}
