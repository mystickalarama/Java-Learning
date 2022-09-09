public class Student {
    String name,stuNo;
    int classes, matS, fizikS, kimyaS;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage, matA, fizikA, kimyaA;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya, int matS, int fizikS, int kimyaS) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

        if (matS >= 0 && matS <= 100) {
            this.matS = matS;
        }

        if (fizikS >= 0 && fizikS <= 100) {
            this.fizikS = fizikS;
        }

        if (kimyaS >= 0 && kimyaS <= 100) {
            this.kimyaS = kimyaS;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.matA = (this.mat.note * 0.8) + (this.matS * 0.2);
        this.fizikA = (this.fizik.note * 0.8) + (this.fizikS * 0.2);
        this.kimyaA = (this.kimya.note * 0.8) + (this.kimyaS * 0.2);
        this.avarage = (this.fizikA + this.kimyaA + this.matA) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note + "\tSözlü : " + this.matS + "\tMat ort.: " + this.matA);
        System.out.println("Fizik Notu : " + this.fizik.note + "\tSözlü : " + this.matS + "\tFizik ort.: " + this.matA);
        System.out.println("Kimya Notu : " + this.kimya.note + "\tSözlü : " + this.matS + "\tKimya ort.: " + this.matA);
    }

}