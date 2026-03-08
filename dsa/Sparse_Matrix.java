public class Sparse_Matrix {
    public static void main(String[] args) {

        int matrix[][] = {
            {0,0,3},
            {0,0,0},
            {5,0,0}
        };

        int size = 0;

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(matrix[i][j]!=0){
                    size++;
                }
            }
        }

        int sparse[][] = new int[size][3];
        int k=0;

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(matrix[i][j]!=0){
                    sparse[k][0] = i;
                    sparse[k][1] = j;
                    sparse[k][2] = matrix[i][j];
                    k++;
                }
            }
        }

        for(int i=0;i<size;i++){
            System.out.println(
                sparse[i][0]+" "+
                sparse[i][1]+" "+
                sparse[i][2]);
        }
    }
}