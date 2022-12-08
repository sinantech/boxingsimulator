public class Match {
    Fighter firstFighter;
    Fighter secondFighter;
    int minWeight;
    int maxWeight;


    Match(Fighter firstFighter, Fighter secondFighter, int minWeight, int maxWeight) {
        this.firstFighter = firstFighter;
        this.secondFighter = secondFighter;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (isCheck()) {
            while (this.firstFighter.health > 0 && this.secondFighter.health > 0) {

                System.out.println("===== New Round =====");
                int starter = Math.round((float) Math.random());
                System.out.println("First Blood :  " + starter);

                if ((starter == 0)) {

                    this.secondFighter.health = this.firstFighter.hit(this.secondFighter);
                    if (isWin()) break;
                    this.firstFighter.health = this.secondFighter.hit(this.firstFighter);
                    if (isWin()) break;
                }

                if ((starter == 1)) {
                    this.secondFighter.health = this.secondFighter.hit(this.firstFighter);
                    if (isWin()) break;
                    this.firstFighter.health = this.firstFighter.hit(this.secondFighter);
                    if (isWin()) break;
                }

                System.out.println(this.firstFighter.name + " Health : " + this.firstFighter.health);
                System.out.println(this.secondFighter.name + " Health : " + this.secondFighter.health);
            }
        } else {
            System.out.println("Weight Does Not Match");
        }
    }

    boolean isCheck() {
        return (this.firstFighter.weight >= minWeight && this.firstFighter.weight <= maxWeight) && (this.secondFighter.weight >= minWeight && this.secondFighter.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.firstFighter.health == 0) {
            System.out.println(this.secondFighter.name + " " + "Winner");
            return true;
        }

        if (this.secondFighter.health == 0) {
            System.out.println(this.firstFighter.name + " " + "Winner");
            return true;
        }

        return false;
    }

}
