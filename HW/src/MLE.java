
public class MLE {
    public static void main(String []args){



    }


    public static void cosineSimilarity(double []intputVecorA,double []intputVecorB){



    }

    public static double dotProuduct(double []vecorA,double []vecorB){

        // checks that lengths of vector A and B match to move forward
        if(vecorA.length!=vecorB.length){
            System.out.println("Vectors for dot operation are not the same length");
            return -1.0;
        }

        //holds dot product
        double dotProduct=0.0;

        // iterates though the two vectors and multiplies their
        // corisponding elements. Then ads teh product to dotProduct
        for(int i =0;i<vecorA.length;i++){
            dotProduct=dotProduct+(vecorA[i]*vecorB[i]);
        }



        return dotProduct;
    }









}
