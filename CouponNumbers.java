import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CouponNumbers {


    public int generateDistinctCoupons(int N) {
        Set<Integer> coupons = new HashSet<>();
        Random random = new Random();
        int count = 0;

        while (coupons.size() < N) {
            int randomNumber = random.nextInt(N);
            coupons.add(randomNumber);
            count++;
        }

        return count;
    }
}