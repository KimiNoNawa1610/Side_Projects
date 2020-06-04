public class Minimax {

    public static int minimax(int depth, int Index, boolean Max, int coordinate[], int height){

        if(depth==height){

            return coordinate[Index];
        }

        else if(Max){

            return Math.max(minimax(depth+1,Index*2,false,coordinate, height),
                    minimax(depth+1,Index*2+1,false,coordinate, height));

        }

        else{

            return Math.min(minimax(depth+1,Index*2,true,coordinate, height),
                    minimax(depth+1,Index*2+1,true,coordinate, height));

        }
    }

    public static int Log2(int num){

        if(num==1){

            return 0;

        }

        else{

            return 1+Log2(num/2);

        }
    }

}
