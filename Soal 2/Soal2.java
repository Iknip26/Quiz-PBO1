public class Soal2{
    public static void main(String[] args) {
        Person orang1 = new Person("hanif", "Bekasi");
        Staff staf1 = new Staff("Sandy", "Solo", "SV_UGM", 1000000);
        Student student1 = new Student("Muflih", "Bantul", "IPA", 3, 200000);

        System.out.println("pemanggilan semua method 'Person'" );
        System.out.println(orang1.getName());
        orang1.setAddress("Jakarta");
        System.out.println(orang1.getAddress());
        System.out.println(orang1+ "\n");

        System.out.println("pemanggilan semua method 'Staff'" );
        System.out.println(staf1.getName());
        staf1.setAddress("Jakarta");
        System.out.println(staf1.getAddress());
        staf1.setSchool("SMA 1");
        System.out.println(staf1.getSchool());
        staf1.setPay(500000);
        System.out.println(staf1.getPay());
        System.out.println(staf1 + "\n");

        System.out.println("pemanggilan semua method 'Student'" );
        System.out.println(student1.getName());
        student1.setAddress("Tangerang");
        System.out.println(student1.getAddress());
        student1.setProgram("IPS");
        System.out.println(student1.getProgram());
        student1.setYear(500000);
        System.out.println(student1.getYear());
        student1.setFee(400000);
        System.out.println(student1.getFee());
        System.out.println(student1 + "\n");
    }
}
