
public class MLE {
    public static void main(String []args){


        int testLenght=3;
        double[] x=new double[testLenght];
        double[] y=new double[testLenght];

        x[0]=1;
        x[1]=2;
        x[2]=3;

        y[0]=2;
        y[1]=6;
        y[2]=3;



        System.out.println(euclideanDistance(x,y));


    }


    public static int hammingDistnce(String binaryOne,String binaryTwo){
        if(binaryOne.length()!=binaryTwo.length()){
            System.out.println("Inputs ar not equal length");
            return -1;
        }
        int hammingDistnace=0;

        for(int i=0; i<binaryOne.length();i++){
            if(binaryOne.charAt(i)!=binaryTwo.charAt(i)){
                hammingDistnace=hammingDistnace+1;
            }

        }

        return hammingDistnace;







    }

    public static double cosineSimilarity(double []intputVecorA,double []intputVecorB){
        int presition=10000000;
        double tempDot=dotProuduct(intputVecorA,intputVecorB);
        double denometor = vecotorMagnitude(intputVecorA)*vecotorMagnitude(intputVecorB);

        double similarity;

        similarity= (int)(presition*(tempDot/denometor));

        return similarity/presition;


    }

    public static double euclideanDistance(double []intputVecorA,double []intputVecorB){

        double toBeSqrt=0;
        double prescition=1000000;
        double euclideanDis=0;

        for(int i =0;i<intputVecorA.length;i++){

            double tempDiff= intputVecorA[i]-intputVecorB[i];

            toBeSqrt=toBeSqrt+(tempDiff*tempDiff);
        }

        euclideanDis=(int)(prescition*Math.sqrt(toBeSqrt));


        return euclideanDis/prescition;
    }

    public static double vecotorMagnitude(double []inputVector){
        //check
        if(inputVector.length<=0){
            System.out.println("Really should have arrays larger than 0");
            return -1;
        }

        double total=0;

        for (int i=0;i<inputVector.length;i++){
            total=total+inputVector[i]*inputVector[i];

        }

        return Math.sqrt(total);
    }

    public static double dotProuduct(double []vecorA,double []vecorB){

        // checks that lengths of vector A and B match to move forward
        if(vecorA.length!=vecorB.length){
            System.out.println("Vectors for dot operation are not the same length");
            return -1000000000;
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
