import java.util.Random;

public class RandomFloatGenerator {
    public static void main(String[] args) {
        int numberOfRandomNumbers = 10;

        for (int i = 0; i < numberOfRandomNumbers; i++) {
            float randomFloat = getRandomFloatInRange(1.0f, 10.0f);
            System.out.println(randomFloat);
        }
    }

    private static float getRandomFloatInRange(float min, float max) {
        Random rand = new Random();
        return min + rand.nextFloat() * (max - min);
    }
}
