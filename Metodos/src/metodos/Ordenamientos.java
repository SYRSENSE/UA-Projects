
package metodos;


public class Ordenamientos {
    private void MuestraArray(int [] a){
        for (int i=0;i<a.length;i++){
            System.out.print("["+a[i]+"]");
            }
        System.out.println("");
        System.out.println("");        
        }
    public void BubleSort(int [] a){
        this.MuestraArray(a);
        int n = a.length;  
        int temp = 0;
        int comp = 0;
        for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                if(a[j-1] > a[j]){  
                    //Intercambio  
                    temp = a[j-1];  
                    a[j-1] = a[j];  
                    a[j] = temp;
                    comp ++;
                    }          
                }  
            } 
        System.out.println("Array ordenado:");
        this.MuestraArray(a);
        System.out.println("Total comparaciones:" + comp);
        }

    public void SelectionSort(int[] a) {
        this.MuestraArray(a);
        int n = a.length;
        int comp = 0;
        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[indiceMinimo]) {
                    indiceMinimo = j;
                    comp ++;
                    }
                }
            // Intercambiar arreglo[i] 
            //y arreglo[indiceMinimo]
            int temp = a[i];
            a[i] = a[indiceMinimo];
            a[indiceMinimo] = temp;
           }
        System.out.println("Array ordenado:");
        this.MuestraArray(a);
        System.out.println("Total comparaciones:" + comp);
        } 
        
    public void InsertionSort(int[] a) {
        this.MuestraArray(a);
        int n = a.length;
        int comp = 0;
        for (int i = 1; i < n; i++) {
            int valorActual = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > valorActual) {
                a[j + 1] = a[j];
                j--;
                comp ++;
                }
            a[j + 1] = valorActual;
            }
        System.out.println("Array ordenado:");
        this.MuestraArray(a);
        System.out.println("Total comparaciones:" + comp);
        }

    public void ShellSort(int[] a) {
        this.MuestraArray(a);        
        int n = a.length;
        int incremento = n;
        int comp = 0;
        do {
            incremento = incremento / 2;
            for (int k = 0; k < incremento; k++) {
                for (int i = incremento + k; i < n; i += incremento) {
                    int j = i;
                    while (j - incremento >= 0 && a[j] < a[j - incremento]) {
                        int tmp = a[j];
                        a[j] = a[j - incremento];
                        a[j - incremento] = tmp;
                        j -= incremento;
                        comp ++;
                        }
                    }
                }
            } 
        while (incremento > 1);
        System.out.println("Array ordenado:");
        this.MuestraArray(a);
        System.out.println("Total comparaciones:" + comp);
        }
    
    public void mergeSort(int[] a) {
        if (a.length < 2) { 
            return;
        }
        int mid = a.length / 2;
        int[] left = new int[mid];
        int[] right = new int[a.length - mid];
 
        System.arraycopy(a, 0, left, 0, mid);
        System.arraycopy(a, mid, right, 0, a.length - mid);
 
        mergeSort(left);
        mergeSort(right);
        merge(a, left, right);
        System.out.println("Array ordenado:");
        this.MuestraArray(a);
        System.out.println("Numero de comparaciones:"+ (int)(a.length*(Math.log(a.length)/Math.log(2))-(a.length - 1)));
        }
     
    
    public void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }


                
}
