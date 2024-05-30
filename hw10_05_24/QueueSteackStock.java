package hw10_05_24;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueSteackStock {
    public static void main(String[] args) {


//     1 уровень сложности: 1) Вы работаете на складе, который продает один вид продукции, не имеющий сроков хранения, например кирпич.
//    У вас всего одни двери на складе, через которые вы загружаете новый товар и отгружаете заказчикам тоже через эту же дверь.
//    Как бы вы построили рабочий процесс на Вашем складе, какую бы коллекцию использовали для имитации процесса работы?
//    Напишите программу, которая бы имитировала работу.
//
//2)* Тот же склад, что и в случае п.1 но у Вас есть две двери - одна в начале склада, вторая в конце.
//    Как бы вы построили оптимальный рабочий процесс на Вашем складе, какую бы коллекцию использовали для имитации процесса работы?
//    Напишите программу, которая бы имитировала работу.
        Stack<String> stack1 = new Stack<>(); //всегда нужно строго типизировать

        stack1.push("Red brick");
        stack1.push("White brick");
        stack1.push("Fire brick");
        stack1.push("Decorative brick");
        System.out.println("Порядок расположения кирпичей на складе с одной дверью: " + stack1);


        // добaвить кирпичи
        stack1.push("Paving brick");
        stack1.push("Black brick");
        System.out.println("Состояние склада после добавления на склад кирпичей: " + stack1);


        //смотрим,какой кирпич первым отгрузится и удаляем его
        System.out.println("первым отгрузится: " + stack1.pop());



       Queue<String> queue1 = new LinkedList<>();
       queue1.add("Red brick");
        queue1.add("White brick");
        queue1.add("Fire brick");
        queue1.add("Decorative brick");
        System.out.println("Порядок расположения кирпичей на складе с двумя дверями:" + queue1);

        // добaвить кирпичи
        queue1.add("Paving brick");
        queue1.add("Black brick");
        System.out.println("Состояние склада после добавления на склад кирпичей: " + queue1);

        //смотрим,какой кирпич первым отгрузится
        System.out.println("первым отгрузится: " + queue1.poll());

    }


    Stack<Integer>product = new Stack<>();

    public void adding(int quantity){
        product.push(quantity);
        System.out.println(quantity + "количество товаров загружено");
    }
}
