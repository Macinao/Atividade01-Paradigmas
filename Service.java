public class Service {
    public String oraganiza(int j, String nome, String total){
        String palavra = "";
        int i = j;
        for(; i < nome.length(); i++){
            char c = nome.charAt(i);
            if(Character.isDigit(c)){
                total += c;
            }else{
                palavra += c;
                if(palavra.contains("one")){
                    if(i + 1 == nome.length()){
                        return total += 1;
                    }else{
                        total += 1;
                        return oraganiza(i,nome,total);
                    }
                }if(palavra.contains("two")){
                    if(i + 1 == nome.length()){
                        return total += 2;
                    }else{
                        total += 2;
                        return oraganiza(i,nome,total);
                    }
                }if(palavra.contains("three")){
                    if(i + 1 == nome.length()){
                        return total += 3;
                    }else{
                        total += 3;
                        return oraganiza(i,nome,total);
                    }
                }if(palavra.contains("four")){
                    if(i + 1 == nome.length()){
                        return total += 4;
                    }else{
                        total += 4;
                        return oraganiza(i,nome,total);
                    }
                }if(palavra.contains("five")){
                    if(i + 1 == nome.length()){
                        return total += 5;
                    }else{
                        total += 5;
                        return oraganiza(i,nome,total);
                    }
                }if(palavra.contains("six")){
                    if(i + 1 == nome.length()){
                        return total += 6;
                    }else{
                        total += 6;
                        return oraganiza(i,nome,total);
                    }
                }if(palavra.contains("seven")){
                    if(i + 1 == nome.length()){
                        return total += 7;
                    }else{
                        total += 7;
                        return oraganiza(i,nome,total);
                    }
                }if(palavra.contains("eight")){
                    if(i + 1 == nome.length()){
                        return total += 8;
                    }else{
                        total += 8;
                        return oraganiza(i,nome,total);
                    }
                }if(palavra.contains("nine")){
                    if(i + 1 == nome.length()){
                        return total += 9;
                    }else{
                        total += 9;
                        return oraganiza(i,nome,total);
                    }
                }
            }
        }
        return total;
    }
}