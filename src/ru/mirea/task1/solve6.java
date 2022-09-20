package ru.mirea.task1;

class Solve6Bubble {

    private long[] array;
    private int elems;
    public Solve6Bubble(long[] array){ //конструктор класса
        this.array=array; //создание массива размером max
        elems = array.length; //при создании массив содержит 0 элементов
    }

    public void printer(){ //метод вывода массива в консоль
        for (int i = 0; i < elems; i++){ //для каждого элемента в массиве
            System.out.print(array[i] + " "); //вывести в консоль
        }
        System.out.println("----Окончание вывода массива----");
    }

    private void toSwap(int first, int second){ //метод меняет местами пару чисел массива
        long dummy = array[first]; //во временную переменную помещаем первый элемент
        array[first] = array[second]; //на место первого ставим второй элемент
        array[second] = dummy; //вместо второго элемента пишем первый из временной памяти
    }

    public void bubbleSorter(){ //МЕТОД ПУЗЫРЬКОВОЙ СОРТИРОВКИ
        for (int out = elems - 1; out >= 1; out--){ //Внешний цикл
            for (int in = 0; in < out; in++){ //Внутренний цикл
                if(array[in] > array[in + 1]) //Если порядок элементов нарушен
                    toSwap(in, in + 1); //вызвать метод, меняющий местами
            }
        }
    }

}


public class solve6{

    public static void main(String[] args) {
        //Первый способ
        long[] array;
        array = new long[15];

        for (int i = 0; i < array.length; i++) {
            array[i] = (long)(Math.random()*100);
        }



        Solve6Bubble start = new Solve6Bubble(array);
        start.printer();
        start.bubbleSorter();
        start.printer();



    }
}
