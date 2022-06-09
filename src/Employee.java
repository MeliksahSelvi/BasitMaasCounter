public class Employee {

    String calisanName;
    double calisanSalary;
    int workHours;
    int hireYear;

    Employee(String calisanName,int calisanSalary,int workHours,int hireYear){

        this.calisanName=calisanName;
        this.calisanSalary=calisanSalary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    double getTax(){

        double vergi;

        if(this.calisanSalary>1000){

            vergi=calisanSalary*0.03;
            return vergi;
        }
        else
            return 0;

    }

    int getBonus(){

        int bonus;

        if(workHours>40){
            bonus=(workHours-40)*30;
            return bonus;
        }
        else
            return 0;
    }

    double raiseSalary(){

        int gecenSure=2022-this.hireYear;
        double artis=0;

        if(gecenSure>3 && gecenSure<=10)
            artis=calisanSalary*0.05;

        else if(gecenSure>10 && gecenSure<=20)
            artis=calisanSalary*0.1;

        else if(gecenSure>20)
            artis=calisanSalary*0.15;

        return artis;
    }

    void printString(){

        double fark;

        System.out.println("Adi :"+this.calisanName);
        System.out.println("Maasi :"+this.calisanSalary);
        System.out.println("Calisma Saati :"+this.workHours);
        System.out.println("Baslangic Yili :"+this.hireYear);
        System.out.println("Vergi :"+this.getTax());
        System.out.println("Bonus :"+this.getBonus());
        System.out.println("Maas Artisi :"+this.raiseSalary());

        fark=this.getBonus()+this.raiseSalary()-this.getTax();
        calisanSalary+=fark;
        System.out.println("Toplam Maas :"+calisanSalary);
    }

}
