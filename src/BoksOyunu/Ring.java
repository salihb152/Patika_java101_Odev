package BoksOyunu;

public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    boolean tossCoinResult; //Maçın başlangıcında yazı tura atımı sonucu
// yazı tura atımına göre kim ilk başlıcak o belirlenecek

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        tossCoin(); //Oyunun başlangıcında yazı tura atılır bu yöntemle.

        if(this.f1.coinSelect==this.f2.coinSelect){ // bu if statement la her iki oyuncunu yazı turada aynı tercihi yapması önlenir.

            System.out.println("Oyuncular yazı turada aynı tercihi yaptilar.");
        }  else if(this.f1.coinSelect==this.tossCoinResult)  {// bu if statementla ilk oyuncunun tercihi ile yazı tura karşılatırılır. ilk oyuncunun tercihi ile yazı tura sonucu aynı ise  ilk vuruşu o yapar ve ilk oyuna başlamış olur.

            if (checkWeight()) {
                while (f1.health > 0 && f2.health > 0) {
                    System.out.println("======== YENİ ROUND ===========");
                    f2.health = f1.hit(f2);
                    if (isWin()){
                        break;
                    }
                    f1.health = f2.hit(f1);
                    if (isWin()){
                        break;
                    }
                    printScore();
                }
    
            } else {
                System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
            }
        } else{ //Diger koşullar yanlış ise f2 oyuncun tercihi ile yazı tura sonucu aynı demektir. Bu nedenle f2 oyuncu ilk vuruşu yapar ve ouyna ilk olarak başlar.

            if (checkWeight()) {
                while (f1.health > 0 && f2.health > 0) {
                    System.out.println("======== YENİ ROUND ===========");
                    f1.health = f2.hit(f1);
                    if (isWin()){
                        break;
                    }
                    f2.health = f1.hit(f2);
                    if (isWin()){
                        break;
                    }
                    printScore();
                }
    
            } else {
                System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
            }
        }

        


    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        } else if (f2.health == 0){
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        }

        return false;
    }


    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
    }
    // Bu yöntemle Yazı tura atımı gerçekleştirilir ve sonucu belirlenir
    private void tossCoin(){
       double num= Math.random()*100;
       this.tossCoinResult = num>50 ? true: false;  
       System.out.println("====================");
       System.out.println("Yazı tura sonucu : "+ this.tossCoinResult);  
       System.out.println("====================");

    }
}
