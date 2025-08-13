public class jaggedArray {
    public static void main(String[] args) {
        int num[][] = new int[3][];
        num[0] = new int[3];
        num[1] = new int[4];
        num[2] = new int[2];


        for(int i=0;i<num.length;i++){
            //System.out.println(num[i].length);
            for(int j=0;j<num[i].length;j++){
                System.out.print(num[i].length);
                num[i][j] = (int)(Math.random()*10);
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
        //System.out.println(num.length);
        // for (int[] m : num) {
        //    for(int x: m){
        //         System.out.print(x + " ");
        //    } 
        //    System.out.println();
        // }     
    }
}
