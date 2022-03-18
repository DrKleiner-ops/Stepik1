public class Stepik {
    public static void main(String[] args) {
        String[] roles = {
                "Городничий", "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String[] textLines = {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        StringBuilder [] ntextLines = new StringBuilder[textLines.length];
        StringBuilder [] nroles = new StringBuilder[roles.length];

        for (int i = 0; i < roles.length; i++) {        //роли в SB
            nroles[i] = new StringBuilder(roles[i]);


        }
        for (int i = 0; i < textLines.length; i++) {     //текст в SB
            ntextLines[i] = new StringBuilder(textLines[i]);
            for (int j = 0; j < nroles.length; j++) {
                //StringBuilder b = i+')';
                String b = Integer.toString(i+1)+')';
                textLines[i].replaceFirst(roles[j], b);
                System.out.println(b);
            }

        }


        /*for (int i = 0; i < textLines.length; i++) {    //вывод текста
            System.out.println(textLines[i]);

        }*/
    }
}


