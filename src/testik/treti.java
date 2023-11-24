package testik;

public class treti {
    public static void main(String[] args) {
        int[] skore1 = {70, 70, 70, 70, 70, 70, 70, 70};
        int pom = 0;
        boolean prospel = true;
        for (int i = 0; i < skore1.length; i++) {
            pom = pom + skore1[i];
            if (skore1[i] < 60){
                prospel = false;
            }

        }
        pom = pom/skore1.length;
        if(pom >= 70 && prospel){
            System.out.println("prospel s prumerem " + pom);
        }else{
            System.out.println("neprospel s prumerem " + pom);
        }
    }
}
