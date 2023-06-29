public class Servicio {
    private  final int MAX_LINE_LENGTH = 40;

    public  void imprimir_mensaje(String mensaje) {
        String[] palabras = mensaje.split(" ");
        StringBuilder sbuiler = new StringBuilder();
        sbuiler.append("/ ");
        int tamano_linea = 0;
        
        for (String palabra : palabras) {
            if (tamano_linea + palabra.length() + 1 > MAX_LINE_LENGTH) {
                for(int i=tamano_linea;i<=40; i++ ){
                    if(i==40){ 
                        sbuiler.append("|");}
                    else {
                        sbuiler.append(" ");
                    }
                }

                sbuiler.append("\n");
                sbuiler.append("| ");
                tamano_linea = 0;
            }

            sbuiler.append(palabra);
            sbuiler.append(" ");
            tamano_linea= tamano_linea+ palabra.length() + 1;
        }
        
        if(tamano_linea<40  &&  sbuiler.length()>38 ){
            System.out.println("tama;o "+tamano_linea+"      "+sbuiler.length());
            sbuiler.replace(sbuiler.length()-tamano_linea-2,sbuiler.length()-tamano_linea-1, "\\");
            for(int i=tamano_linea; i<=40;i++){
                if(i==40){ 
                    sbuiler.append("/");}
                else {
                    sbuiler.append(" ");
                }
            }
        }
       
        if(sbuiler.length()<MAX_LINE_LENGTH){
            sbuiler.replace(0, 1, "<");
            sbuiler.append(">");
        }
        else{
            sbuiler.replace(MAX_LINE_LENGTH+2, MAX_LINE_LENGTH+3,"\\");
        }
        
        System.out.println( sbuiler.toString().trim());
    }
    
    //metodo para imprimir lineas de arriba y de abajo
    public  String repetir_caracter(char caracter, int contador) {
        StringBuilder sb = new StringBuilder();
        if(contador>MAX_LINE_LENGTH){
            contador=MAX_LINE_LENGTH;
        }
        for (int i = 0; i < contador; i++) {
            sb.append(caracter);
        }
        return sb.toString();
    }
    
}
