public class Main {
    public static void main(String[] args) {
        float boxer1=78.2f;
        float boxer2=82.7f;
        float totalWeight;
        float deltaWeight;
        totalWeight=boxer1+boxer2;
        deltaWeight=Math.abs(boxer1-boxer2);
        System.out.println("Общий вес бойцов "+totalWeight+ " кг.");
        System.out.println("Разница в весе между бойцами "+deltaWeight+ " кг.");
    }
}