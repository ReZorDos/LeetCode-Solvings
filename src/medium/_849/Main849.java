package medium._849;

public class Main849 {

    public static void main(String[] args) {

    }

    public int maxDistToClosest(int[] seats) {
        int maxZeros = 0;
        int curZeroes = 0;
        int firstZeroes = -1;

        for (int seat : seats) {
            if (seat == 0) {
                curZeroes++;
                maxZeros = Math.max(maxZeros, curZeroes);
            } else {
                if (firstZeroes == -1) {
                    firstZeroes = curZeroes;
                }
                curZeroes = 0;
            }
        }

        if (maxZeros == curZeroes || firstZeroes == maxZeros) {
            return maxZeros;
        }

        if (curZeroes > (maxZeros + 1) / 2) {
            return curZeroes;
        }

        if (firstZeroes > (maxZeros + 1) / 2) {
            return firstZeroes;
        }

        return (maxZeros + 1) / 2;
    }

}
