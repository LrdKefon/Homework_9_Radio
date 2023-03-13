package ru.netology;

public class Radio {
    private int maxStation;
    private int minStation = 0;
    private int currentStation;//  Текущая радиостанция
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;//  Текущая громкость

    public Radio() {
        this.maxStation = 9;//  Конструктор
    }

    public Radio(int sumStations) {// Счетчик
        this.maxStation = sumStations - 1;
    }

    public int getCurrentStation() {// Получить номер станции
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {//  Установить текущую станцию
        if (currentStation < minStation) {// Меньше минимальной
            return;
        }
        if (currentStation > maxStation) {//  Больше максимальной (в конструкторе)
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {//  Следующая станция (+1 станция)
        if (currentStation == maxStation) {//  Текущая станция равна или нет Mах?
            this.currentStation = 0;
            return;
        }
        this.currentStation = currentStation + 1;
    }

    public void previousStation() {// Предыдущая станция (-1 станция)
        if (currentStation == minStation) {//  Текущая станция равна или нет Min?
            this.currentStation = 9;
            return;
        }
        this.currentStation = currentStation - 1;
    }

    public int getCurrentVolume() {//  Получить уровень звука
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {//  Установить уровень звука
        if (currentVolume < minVolume) {// Если меньше минимума
            return;
        }
        if (currentVolume > maxVolume) {//  Если больше максимума (в конструкторе)
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void volumeUp() {//  Увеличить на 1
        if (currentVolume == maxVolume) { // Если равна Max
            return;
        }
        this.currentVolume = currentVolume + 1;
    }

    public void volumeDown() {//  Уменьшить на 1
        if (currentVolume == minVolume) {   //  Если равна Min
            return;
        }
        this.currentVolume = currentVolume - 1;
    }
}