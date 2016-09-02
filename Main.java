

public class Main {

    public static void main(String[] args) {
       

    }
    
    //int[][] a, if a[i][j]==0, then set the entire row and column to 0
    //scan the matrix, mark i and j to be true when detect 0
    //scan the matrix again, set the row or column to 0
    
    public static void set0(int[][] a){
    	if(a==null) return;
    	int m=a.length,n=a[0].length;
    	boolean[] row=new boolean[m];
    	boolean[] column=new boolean[n];
    	for(int i=0;i<m;i++){
    		for(int j=0;j<n;j++){
    			if(a[i][j]==0){
    				row[i]=true;
    				column[j]=true;
    			}
    		}
    	}
    	
    	for(int i=0;i<m;i++){
    		for(int j=0;j<n;j++){
    			if(row[i]||column[j]){
    				a[i][j]=0;
    			}
    		}
    	}

    	
    }




}