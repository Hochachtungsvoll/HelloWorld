public class ZweiDArrays {

    public static void main (String [] args){

        String [] [] zweiD = {
                {"Das", "ist", "ja"},
                {"voll", "geilo", "mit"},
                {"den", "2D", "Arrays"}
        };

        for (int i=0;i<zweiD.length;i++){
            for (int j=0;j<zweiD[i].length;j++){
                System.out.println(zweiD[i][j] + " ");
            }
        }

    }


}
