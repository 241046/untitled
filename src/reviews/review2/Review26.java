package reviews.review2;

public class Review26 {
    public static void main(String[] args){
        int[] numArrey = new int[] {1,2,3,3,4,5,6,7,8,9};
        int target = 3;
        int count = 0;
        for(int i = 0;i < numArrey.length;i++){
            if(target == numArrey[i]){
                count++;
            }
        }
        System.out.println("探索した値:" + target);
        System.out.println("一致した数:" + count);
    }
}
