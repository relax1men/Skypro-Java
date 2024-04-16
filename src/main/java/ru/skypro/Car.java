package ru.skypro;


public class Car extends WheelableTransport {


    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


    public void check() {

        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
    }


    public void updateTyre() {

        System.out.println("Меняем покрышку машины");
    }

    public void checkEngine() {

        System.out.println("Проверяем двигатель");
    }
}

