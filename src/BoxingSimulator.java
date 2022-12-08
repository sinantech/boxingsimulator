public class BoxingSimulator {
    public static void main(String[] args) {
        Fighter firstFighter = new Fighter("Rocky Balboa", 115, 1444, 100, 40);
        Fighter secondFighter = new Fighter("Ivan Drago" , 75 , 1547 , 85,70);

        Match match = new Match (firstFighter,secondFighter,85,100);
        match.run();
    }
}
