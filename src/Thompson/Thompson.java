package Thompson;

import java.util.Stack;

public class Thompson {
    public static String changeToSuffix(String infix){
        Stack<Character> charStack = new Stack<>();
        char[] str = infix.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        boolean flag2 = false;
        int count = 0;

        for(int i=0;i<str.length;i++){
            if(str[i]!='(' && str[i]!=')' && str[i]!='|' && str[i]!='*' && str[i]!='.'){
                if(str[i] >= 'A' && str[i] <= 'Z' || str[i] >= 'a' && str[i] <= 'z' || str[i] >= '0' && str[i] <= '9'
					|| str[i] == '_'||str[i]=='='||str[i]=='!'||str[i]=='>'||str[i]=='<') {
                    sb.append(str[i]);
                    count++;
                }
                if(flag2){
                    sb.append('.');
                    flag2 = false;
                }
                if(count >=2&&str[i+1] != '*'){
                    sb.append('.');
                    System.out.println("sb1:"+sb.toString());
                }
            }else {
                if(str[i] != '.') {
                    charStack.push(str[i]);
                    count = 0;
                }
                if(str[i] == ')'){
                    charStack.pop();
                    while(!charStack.isEmpty()){
                        Character character = charStack.pop();
                        if(character.equals('(')){
                            sb.append('.');
                            break;
                        }else if(character.equals('|')){
                            flag = false;
                        } else {
                            sb.append(character);
                        }
                    }

                }else if(flag){
                    Character character = charStack.pop();
                    sb.append(character);
                    flag = false;

                }else if(flag2){
                    sb.append('.');
                    flag2 = false;
                }
                else if(str[i] == '*'){
                    Character character = charStack.pop();
                    sb.append(character);
                    try {
                        if(str[i+1] !='(' && str[i+1] !=')') {
                            flag2 = true;
                        }
                    }catch (Exception e){
                        sb.append('.');
                    }
                }else if(str[i] == '|'){
                    flag = true;
                }
            }
        }
        while (!charStack.isEmpty()){
            Character character = charStack.pop();
            sb.append(character);
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        System.out.println(changeToSuffix("a(b| a)( a|b*)b*"));
        System.out.println(changeToSuffix("a.(b| a)( a|b*).b*"));
        System.out.println(changeToSuffix("a*b"));
        System.out.println(changeToSuffix("a|b"));

    }
}
