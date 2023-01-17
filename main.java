import java.util.Scanner;

public class GPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //course units
        int AGE301 = 2;
        int CPE301 = 3;
        int EEE301 = 2;
        int EEE303 = 3;
        int EEE305 = 2;
        int EEE307 = 3;
        int EEE311 = 3;
        int MTS315 = 3;
        int PMT301 = 2;
        int EEE313 = 1;
        int totalUnits = AGE301 + CPE301 + EEE301 + EEE303 + EEE305 + EEE307 + EEE311 + MTS315 + PMT301 + EEE313;
        
        //grade points
        double AGE301Grade = 70;
        double CPE301Grade = 68;
        double EEE301Grade = 87;
        double EEE303Grade = 73;
        double EEE305Grade = 89;
        double EEE307Grade = 90;
        double EEE311Grade = 56;
        double MTS315Grade = 88;
        double PMT301Grade = 79;
        double EEE313Grade = 68;
        
        //calculating sum of (course unit * grade point)
        double sum = (AGE301 * AGE301Grade) + (CPE301 * CPE301Grade) + (EEE301 * EEE301Grade) + (EEE303 * EEE303Grade) + (EEE305 * EEE305Grade) + (EEE307 * EEE307Grade) + (EEE311 * EEE311Grade) + (MTS315 * MTS315Grade) + (PMT301 * PMT301Grade) + (EEE313 * EEE313Grade);
        
        //calculating GPA
        double gpa = sum / totalUnits;
        
        System.out.println("GPA for the semester: " + gpa);
    }
}
