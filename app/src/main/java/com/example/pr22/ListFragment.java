package com.example.pr22;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class ListFragment extends Fragment implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        LinearLayout first_layout = (LinearLayout) view.findViewById(R.id.first_layout);
        LinearLayout second_layout = (LinearLayout) view.findViewById(R.id.second_layout);
        LinearLayout third_layout = (LinearLayout) view.findViewById(R.id.third_layout);
        LinearLayout fourth_layout = (LinearLayout) view.findViewById(R.id.fourth_layout);
        first_layout.setOnClickListener(this);
        second_layout.setOnClickListener(this);
        third_layout.setOnClickListener(this);
        fourth_layout.setOnClickListener(this);
        return view;
    }
    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.first_layout:transaction("Предел","    Предел функции – величина, к которой стремится значение данной функции при стремлении ее аргумента к предельной для области определения точке.\n    Любой предел состоит из трех частей:\n1) Всем известного значка предела\n2)Записи под значком предела, в данном случае X -> 1. Запись читается «икс стремится к единице». Чаще всего – именно X, хотя вместо «икса» на практике встречаются и другие переменные. В практических заданиях на месте единицы может находиться совершенно любое число, а также бесконечность ().\n 3) Функции под знаком предела\nВыражение «икс стремится к единице» следует понимать так – «икс» последовательно принимает значения, которые бесконечно близко приближаются к единице и практически с ней совпадают.\n Другими словами, что число A есть пределе функции f(x) в точке x=a, если для всех х, достаточно близких к числу A и отличных от него, соответствующие им значения функции f(x) оказываются сколь угодно близким к числу А (естественно, в тех точках х, в которых функция f(x) определена)\n    "); break;
            case R.id.second_layout: transaction("Производная","   Производная функции — понятие дифференциального исчисления, характеризующее скорость изменения функции в данной точке. Определяется как предел отношения приращения функции к приращению её аргумента при стремлении приращения аргумента к нулю, если такой предел существует.\n   Функцию, имеющую конечную производную (в некоторой точке), называют дифференцируемой (в данной точке).\n   Процесс вычисления производной называется дифференци́рованием. Обратный процесс — нахождение первообразной — интегрирование.\n   Если в точке x0 существует конечная производная функции y=f(x), то эта функция называется дифференцируемой в точке x0.\n   Если функция y=f(x) дифференцируема в каждой точке некоторого промежутка, то она дифференцируема на промежутке.\n   Алгебраический смысл: производная функции в точке есть угловой коэфициент касательной к графику этой функции\n   "); break;
            case R.id.third_layout: transaction("Неопрделенный интеграл","   Интегрирование было известно еще в Древнем Египте. Конечно, не в современном виде, но все же. С тех пор математики написали очень много книг по этой теме. Особенно отличились Ньютон и Лейбниц, но суть вещей не изменилась.\n   Неопределенным интегралом функции f(x) называется такая функция F(x), производная которой равна функции f(x).\n   Другими словами интеграл – это производная наоборот или первообразная.\n   Первообразная существует для всех непрерывных функций. Также к первообразной часто прибавляют знак константы, так как производные функций, различающихся на константу, совпадают.\n   Процесс нахождения интеграла называется интегрированием.\n "); break;
            case R.id.fourth_layout: transaction("Определенный интеграл","   Как найти площадь фигуры, ограниченной графиком функции? С помощью интеграла! Разобьем криволинейную трапецию, ограниченную осями координат и графиком функции, на бесконечно малые отрезки. Таким образом фигура окажется разделена на тонкие столбики. Сумма площадей столбиков и будет составлять площадь трапеции. Но помните, что такое вычисление даст примерный результат. Однако чем меньше и уже будут отрезки, тем точнее будет вычисление. Если мы уменьшим их до такой степени, что длина будет стремиться к нулю, то сумма площадей отрезков будет стремиться к площади фигуры. Это и есть определенный интеграл.\n   Точки а и b называются пределами интегрирования.\n   Как считать определенный интеграл? С помощью формулы Ньютона-Лейбница. Мы уже выяснили, что определенный интеграл – это предел суммы. Но как получить конкретное значение при решении примера? Для этого существует формула Ньютона-Лейбница"); break;
        }
    }
    public void transaction(String name, String text){
        FragmentTransaction fragmentTransaction = getParentFragmentManager().beginTransaction();
        InfoFragment infoFragment = InfoFragment.newInstance(name, text);
        fragmentTransaction.replace(R.id.fragmentContainerView, infoFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}