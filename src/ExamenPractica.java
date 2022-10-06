public class ExamenPractica {


    public double mitjaAritmetica(int indexElegit, int[] array) {
        int media = 0;
        for (int index = 0; index <= indexElegit; index++) {
            media += array[index];
        }
        return (double) media / array.length;
    }

    public int minimValor(int indexElegit, int[] array) {
        int minNumber;
        int index = 0;
        minNumber = array[index];
        for (index = 0; index <= indexElegit; index++) {
            if (minNumber > array[index]) {
                minNumber = array[index];
            }
        }
        return minNumber;
    }

    public int retornarIndexValMinim(int indexElegit, int[] array) {
        int minValue = minimValor(indexElegit, array);
        int index;
        for (index = 0; index < array.length; index++) {
            if (array[index] == minValue) {
                break;
            }
        }
        return index;
    }

    public int maxValue(int indexElegit, int[] array) {
        int index = 0;
        int maxValue = array[index];
        for (index = 0; index <= indexElegit; index++) {
            if (array[index] > maxValue) {
                maxValue = array[index];
            }
        }
        return maxValue;
    }

    public int indexMaxValue(int indexElegit, int[] array) {
        int maxValue = maxValue(indexElegit, array);
        int index;
        for (index = 0; index < array.length; index++) {
            if (array[index] == maxValue) {
                break;
            }
        }
        return index;
    }

    public boolean ordenatAsc(int[] array) {
        for (int index = 0; index < array.length - 1; index++) {
            if (array[index] > array[index + 1]) {
                return false;
            }
        }
        return true;
    }

    public boolean ordenatDes(int[] array) {
        for (int index = 0; index < array.length - 1; index++) {
            if (array[index] < array[index + 1]) {
                return false;
            }
        }
        return true;
    }

    public int[] invertirArray(int[] array) {
        int[] numerosInversos = new int[array.length];
        final int numeroSize = array.length - 1;
        for (int index = numeroSize; index >= 0; index--) {
            numerosInversos[numeroSize - index] = array[index];
        }
        return numerosInversos;
    }

    public int cercarIndexDeNumeroOcurrencia(int numeroOcurrencia, int[] array) {
        int index;
        for (index = 0; index < array.length; index++) {
            if (array[index] == numeroOcurrencia) {
                return index;
            }
        }
        return -1;
    }

    //10
    public int retornarNumeroProxMitjanaAritmetica(int numeroElegit, int[] array) {
        int mitjaAritmetica = (int) mitjaAritmetica(numeroElegit, array);
        int indexNumProx = 0, index = 0, difContIndexMediaArit;
        int difMinima = (array[index] - mitjaAritmetica < 0) ? -(array[index] - mitjaAritmetica) : array[index] - mitjaAritmetica;

        for (index = 0; index < array.length; index++) {
            difContIndexMediaArit = (array[index] - mitjaAritmetica < 0) ? -(array[index] - mitjaAritmetica) : array[index] - mitjaAritmetica;
            if (difContIndexMediaArit < difMinima) {
                indexNumProx = index;
                difMinima = difContIndexMediaArit;
            }
        }
        return array[indexNumProx];
    }

    //11 mirar
    int[] cercarMaxValueFinsIniciIIntercambiarPosicio(int indexElegit, int[] array) {
        int numMax = maxValue(indexElegit, array);
        int numeroTemporal;
        int[] numerosIntercanviats = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            numerosIntercanviats[index] = array[index];
        }
        for (int index = 0; index <= indexElegit; index++) {
            if (numerosIntercanviats[index] == numMax) {
                numeroTemporal = numerosIntercanviats[index];
                numerosIntercanviats[index] = numerosIntercanviats[indexElegit];
                numerosIntercanviats[indexElegit] = numeroTemporal;
            }
        }
        return numerosIntercanviats;
    }

    //12 mirar


    int[] matriuOrdenadaPerMetodeAnterior(int[] array) {
        int[] matriuOrdenada = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            matriuOrdenada[index] = array[index];
        }
        for (int index = matriuOrdenada.length - 1; index >= 0; index--) {
            if (ordenatAsc(matriuOrdenada)) {
                break;
            }
            matriuOrdenada = cercarMaxValueFinsIniciIIntercambiarPosicio(index, matriuOrdenada);
        }
        return matriuOrdenada;
    }

    public void mostrarArray(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.print(" , " + array[index]);
        }
        System.out.println();
    }
}
