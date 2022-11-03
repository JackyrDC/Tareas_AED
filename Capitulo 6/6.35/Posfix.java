import java.util.*;
public class Posfix{

    public static void main(String[] args) 
    {
        List<Object> lista = new ArrayList<Object>();
        push("50", lista);
        push("2", lista);
        push("+", lista);
        push("5", lista);
        push("*", lista);
        push("4", lista);
        push("+", lista);
        solve(lista);
    }

    public static void push(String i , List<Object> array)
    {
        array.add(i);        
    }

    public static Object pop(List<Object> array)
    {
        Object i = array.get(array.size()-1);
        array.remove(array.size()-1);
        return i;
    }

    public static String solve( List<Object> array)
    {
        for(int n=0; n<array.size(); n++)
        {
            int res=0;
            if(array.get(n).equals("+"))
            {
                pop(array);
                int a = (int) pop(array);
                int b = (int) pop(array);
                System.out.println(a+"+"+b);
                res=a+b;
                push( String.valueOf(res) ,  array);
            }
            else if(array.get(n).equals("-"))
            {
                pop(array);
                int a = (int) pop(array);
                int b = (int) pop(array);
                res=a-b;
                push(String.valueOf(res), array);
            }
            else if(array.get(n).equals("*"))
            {
                pop(array);
                int a = (int) pop(array);
                int b = (int) pop(array);
                res=a*b;
                push(String.valueOf(res) , array);
            }
            else if(array.get(n).equals("/"))
            {
                pop(array);
                int a = (int) pop(array);
                int b = (int) pop(array);
                res=a/b;
                push(String.valueOf(res), array);
            }
        }

        return array.get(0).toString();
    }

}