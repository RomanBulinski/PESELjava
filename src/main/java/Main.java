public class Main {


    public boolean checkPESEL(String pesel){

        if(pesel.length()!=11){
            return false;
        }

        String[] chars = pesel.split("");
        int[] ints = new int[chars.length];
        for( int i=0; i< chars.length; i++){
             ints[i] = Integer.valueOf(chars[i]);
            System.out.println(ints[i]);
        }

        int[] actionInt = {1,3,7,9,1,3,7,9,1,3};
        int sumOfints = 0;

        for(int i=0; i< actionInt.length; i++ ){
            ints[i] = ints[i] * actionInt[i];
            sumOfints = sumOfints + ints[i];
        }
        int outcom = (10 - (sumOfints%10)) %10;
        if( ints[10] == outcom  ){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Main main = new Main();
//        System.out.println(main.checkPESEL(" "));

    }


}
