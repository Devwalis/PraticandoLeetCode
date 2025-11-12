package PraticandoLogica.src;

public class VerificarOrdenacaoDeArrey{
    

    public String isSortedEndHow(int[] array){
        boolean isAscending = true;
        boolean isDescending = true;
        

        //Verfifica a ordem crescente

        for(int i = 1; i < array.length; i++){
            if(array[i] < array[i - 1]){
                isAscending = false;
                break; // QUebra o loop assim que a ordem crescente for violada
            }
        }

        if(!isAscending){
            for(int i = 1; i < array.length; i++){
                if (array[i] > array[i - 1]) {
                    
                
                isDescending = false;
                break; //QUebra o loop assim que a ordem decrescenta for violada
            }
        }
    } else{
        return"yes, ascending";
    }
    if(isDescending){
        return "yes, descending";
        
    }else{
        return "no";
    }
}

public static void main(String[] args){
    VerificarOrdenacaoDeArrey solver = new VerificarOrdenacaoDeArrey();
    System.out.println(solver.isSortedEndHow(new int[]{1, 2, 10, 10, 20, 20}));
    System.out.println(solver.isSortedEndHow(new int[]{4, 5, 6, 10, 20, 30}));
    System.out.println(solver.isSortedEndHow(new int[]{1, 40, 50, 30, 80}));
    System.out.println(solver.isSortedEndHow(new int[]{130, 20, 80, 90 ,70}));
}
}
