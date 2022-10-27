public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
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


    public void sozortafalan(int mat,int fizik,int kimya){
        if (mat >= 0 && mat <= 100) {
            this.mat.sozlu = mat;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.sozlu = fizik;
        }
        if (kimya >= 0 && kimya <= 100) {
            this.kimya.sozlu = kimya;
        }
    }
    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }

    public void isPass() {
        System.out.println("Sözlü notun ortalamaya etkisi %20 dir");
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0||
                this.mat.sozlu == 0 || this.fizik.sozlu == 0 || this.kimya.sozlu == 0) {
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
        this.avarage = (((this.fizik.note*0.80)+(this.fizik.sozlu*0.20))
                + ((this.kimya.note*0.80)+(this.kimya.sozlu*0.20) )
                + ((this.mat.note*0.80)+(this.mat.sozlu*0.20))) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik Sözlüsü : " + this.mat.sozlu);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Fizik Sözlüsü : " + this.fizik.sozlu);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Kimya Sözlüsü : " + this.kimya.sozlu);
    }

}
