public class App {

    public static void main(String[] args) {

        String s1 = "LUIMUITONERD";
        String s2 = "NERD";

        System.out.println(sameSubstring(s1,s2));

    }

    public static int sameSubstring(String s1, String s2){

        if(s1.length() < s2.length()){
            return -1;
        }

        String[] splitS1 = s1.split("");
        String[] splitS2 = s2.split("");
        int counter = 0;

        for(int i = 0; i < splitS1.length; i++){
            if(splitS1[i].equals(splitS2[0])){
                for(int j = i++; j < splitS2.length-1; j++){
                    if(splitS1[j].equals(splitS2[counter])){
                        counter++;
                    }else{
                        break;
                    }
                }
                return i;
            }
        }
        return -1;
    }


}
