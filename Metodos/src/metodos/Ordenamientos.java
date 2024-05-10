
package metodos;


public class Ordenamientos {
    public void MuestraArray(int [] a){
        for (int i=0;i<a.length;i++){
            System.out.print("["+a[i]+"]");
            }
        System.out.println("");
        System.out.println("");        
        }
    public void BubleSort(int[] a) {
        System.out.println("Array Original: ");
        this.MuestraArray(a);
        int n = a.length;  
        int temp;
        int comp = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Iteracion del paso " + (i + 1) + ":");
            for (int j = 1; j < (n - i); j++) {
                if (a[j - 1] > a[j]) {
                    // Intercambio
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                    comp++;

                    System.out.println("Comparando " + a[j - 1] + " y " + a[j] + ", intercambio realizado.");
                    System.out.print("Arreglo actual: ");
                    this.MuestraArray(a);
                } else {
                    System.out.println("Comparando " + a[j - 1] + " y " + a[j] + ", no se realiza intercambio.");
                }
            }
            System.out.println("Final de la iteracion " + (i + 1) + ".");
        }

        System.out.println("Array ordenado:");
        this.MuestraArray(a);
        System.out.println("Total comparaciones: " + comp);
}

    public void SelectionSort(int[] a) {
        System.out.println("Array Original: ");
        this.MuestraArray(a);
        int n = a.length;
        int comp = 0;
        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;
            System.out.println("\nIteracion " + (i + 1) + ":");
            System.out.println("Indice minimo inicial: " + indiceMinimo);
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[indiceMinimo]) {
                    indiceMinimo = j;
                    comp ++;
                  }
                }
            // Intercambiar arreglo[i] y arreglo[indiceMinimo]
            if (indiceMinimo != i) {
                int temp = a[i];
                a[i] = a[indiceMinimo];
                a[indiceMinimo] = temp;
                System.out.println("Intercambio: " + a[i] + " <-> " + a[indiceMinimo]);
            }else {
                System.out.println("No se realizo intercambio");
            }
           }
        System.out.println("Array ordenado:");
        this.MuestraArray(a);
        System.out.println("Total comparaciones:" + comp);
        } 
        
    public void InsertionSort(int[] a) {
        System.out.println("Array Original:");
        this.MuestraArray(a);
        int n = a.length;
        int comp = 0;

        for (int i = 1; i < n; i++) {
            int valorActual = a[i];
            int j = i - 1;

            System.out.println("\nIteracion " + i + ":");

            while (j >= 0 && a[j] > valorActual) {
                a[j + 1] = a[j];
                j--;
                comp++;
            }

            a[j + 1] = valorActual;

            System.out.println("Estado actual del arreglo:");
            this.MuestraArray(a);
        }
        System.out.println("\nArray ordenado:");
        this.MuestraArray(a);
        System.out.println("Total comparaciones:" + comp);      
    }   

    public void ShellSort(int[] a) {
        System.out.println("Array Original:");
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
                        comp++;

                        System.out.println("\nIncremento: " + incremento);
                        System.out.println("Estado actual del arreglo:");
                        this.MuestraArray(a);
                    }
                }
            }

        } while (incremento > 1);

        System.out.println("\nArray ordenado:");
        this.MuestraArray(a);

        System.out.println("Total comparaciones: " + comp);
    }
    private int comparisons_1 = 0;
    public int get_comparisons_1(){
        return this.comparisons_1;
    }
    public void mergeSort(int[] a) {
        System.out.println("Array Original:");
        this.MuestraArray(a);

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

        System.out.println("\nArray ordenado:");
        this.MuestraArray(a);
        System.out.println("Total comparaciones: " + this.get_comparisons_1());
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
            this.comparisons_1++;

            // Mostrar el estado actual del arreglo después de cada comparación
            System.out.println("\nComparacion:");
            System.out.println("Estado actual del arreglo:");
            this.MuestraArray(arr);
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
    
    private int comparisons_2 = 0;
    public int get_comparisons_2(){
        return this.comparisons_2;
    }
    public void quicksort(int[] array, int low, int high) {
        int i = low;
        int j = high;
        int pivot = array[low + (high - low) / 2];

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
                comparisons_2++; // Incrementa el contador de comparaciones
            }
            while (array[j] > pivot) {
                j--;
                comparisons_2++; // Incrementa el contador de comparaciones
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;

                // Muestra el estado actual del arreglo después de cada intercambio
                System.out.println("\nIntercambio:");
                this.MuestraArray(array);
            }
        }

        if (low < j) {
            quicksort(array, low, j);
        }
        if (i < high) {
            quicksort(array, i, high);
        }
    }
}
