public class teste1 {
    public static void main(String[] args) {
        int numeros[] = {16, 23, 55, 11, 85, 36, 77, 59, 66, 29};

        for(int i =0;i < numeros.length;i++) {
            int divisor = numeros[i] -1;
            while(divisor > 1) {
                if((numeros[i] % divisor--)== 0) {
                    break;
                }
            }
            if(divisor == 1) {
                System.out.println(numeros[i]);
            }
        }
    }
}