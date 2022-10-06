public class ExamenPracticaTest {
    public static void main(String[] args) {
        int[] numeros = {1, 123, 1, 55, 3, 65, 90, 1};

        ExamenPractica ea = new ExamenPractica();
        ea.mostrarArray(numeros);
        System.out.println("mediaAritmetica: "+ea.mitjaAritmetica(numeros.length-1,numeros));
        System.out.println("minimoValor: "+ea.minimValor(numeros.length-1,numeros));
        System.out.println("indecValMinim: "+ea.retornarIndexValMinim(numeros.length-1,numeros));
        System.out.println("maximoValor : "+ea.maxValue(numeros.length-1, numeros));
        System.out.println("IndexMaxVal : "+ea.indexMaxValue(numeros.length-1, numeros));
        System.out.println(" OrdenadoASC : "+ea.ordenatAsc(numeros));
        System.out.println(" OrdenadoDesc: "+ea.ordenatDes(numeros));
        ea.mostrarArray(ea.invertirArray(numeros));
        System.out.println("IndexDeNumeroElegido: "+ea.cercarIndexDeNumeroOcurrencia(1,numeros));
        System.out.println("NumeroProxAMitjaAritmetica: "+ea.retornarNumeroProxMitjanaAritmetica(numeros.length-1,numeros));
        ea.mostrarArray(ea.cercarMaxValueFinsIniciIIntercambiarPosicio(6,numeros));
        ea.mostrarArray(ea.matriuOrdenadaPerMetodeAnterior(numeros));

    }
}
