public class ArrayDuplicat {

    public static void main(String[] args) {


        int[] game1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};

        int[] game2 = {11,33,33,65,88,66,44,99,11};


        for(int i = 0; i < game1.length; i++)
        {
            for(int k = 0; k < game2.length; k++)
            {
                if(game1[i] == game2[k])
                {
                    System.out.println(game1[i] + "At the index of :"  );
                }



}}}}


