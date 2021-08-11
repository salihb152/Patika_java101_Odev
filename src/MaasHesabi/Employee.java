package MaasHesabi;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name=name;
        if(salary<=0){
            this.salary=0;
        }else{
            this.salary=salary;
        }
        if(workHours<0){
            this.workHours=0;
        }else{
            this.workHours=workHours;
        }
        if(hireYear<0){
            this.hireYear=0;
        }else{
            this.hireYear=hireYear;
        }
    }

    double tax(){
        if(this.salary<1000){
                return 0;
        } else{
            return this.salary*3/100;
        }
    }

    double bonus(){
        if(this.workHours<40){
          return 0;
        } else{
            return  (this.workHours-40)*30;
        }
    }
    double raiseSalary(){
        if(this.hireYear>2021){
            return 0;
        } else {
            if((2021-this.hireYear)<10){
                return this.salary*5/100;
            } else if((2021-this.hireYear)<20){
                return this.salary*10/100;
            } else{
                return this.salary*15/100;
            }
        }
    }
    double countCurrentSalaryWithTax(){
     return   this.salary+bonus()-tax();
    }
    double countTotalSalaryWithRaise(){
     return this.salary+ raiseSalary();
    }
    void print(){
    System.out.println("Adı : "+ this.name+"\n"
    + "Maaşı : "+ this.salary + "\n"
    + "Çalışma Saati : "+ this.workHours+"\n"
    + "Başlangıç Yılı : "+this.hireYear+"\n"
    + "Vergi : " + tax()+"\n"
    + "Bonus : "+ bonus()+"\n"
    + "Maaş Artışı : "+ raiseSalary()+"\n"
    + "Vergi ve Bonuslar ile birlikte maaş : "+ countCurrentSalaryWithTax()+ "\n"
    + "Toplam Maaş :  "+ countTotalSalaryWithRaise()
     );     
    }

}
    
    
