import java.util.Scanner;

public class alistamento {
    
    public static void main(String[] args) {
        
        int idade;
        String sexo = "" ;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Informe a idade: ");
        idade = ler.nextInt();
        System.out.print("Informe o sexo ( F ou M) : ");
        sexo = ler.next();
        
        while (!sexo.equals("f") && !sexo.equals("F") && !sexo.equals("m") && !sexo.equals("M")) {
    System.out.print("Informe o sexo (F ou M): ");
    sexo = ler.next();
}

        
        /*if (sexo == "F" || sexo == "f") {
            System.out.print("Dispensada!");
            
        } else if ((sexo == "M" || sexo== "m") && idade >=18 || idade<=45){
            
            System.out.print("Alistamento Obrigatorio!");
            
        }else{
            System.out.print("Fora do periodo de alistamento obrigatorio!");
        }*/
            
        if (sexo.equals("F") || sexo.equals("f")) {
    System.out.print("Dispensada!");
} else if ((sexo.equals("M") || sexo.equals("m")) && (idade >= 18 && idade <= 45)) {
    System.out.print("Alistamento Obrigatório!");
} else {
    System.out.print("Fora do período de alistamento obrigatório!");
}

    }
    
}