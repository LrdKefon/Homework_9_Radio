package ru.netology;

public class Radio {
    private int currentStation;// Текущая радиостанция
    private int currentVolume;// Текущая громкость

    public int getCurrentStation() {// получить актуальный номер станции
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {//установить текущий номер станции
        if (currentStation < 0) {// Не может быть меньше 0
            return;
        }
        if (currentStation > 9) {// Не может быть больше 9
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {     //  Следующая станция
        this.currentStation = currentStation + 1;
        if (currentStation > 9) {   //если станция выходит за лимит(9), верни 0
            this.currentStation = 0;
        }
    }

    public void prevStation() {     // Предыдущая станция
        this.currentStation = currentStation - 1;
        if (currentStation == -1) {     // При станции 0, предыдущая будет 9
            this.currentStation = 9;
        }
    }

    public void stationInput(int currentStation) {  // Установить номер станции
        if (currentStation < 0) {                   // Не может быть меньше 0
            return;
        }
        if (currentStation > 9) {                   // Не может быть больше 9
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {         // Получить уровень звука

        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {// Установить уровень громкости

        this.currentVolume = currentVolume;
    }

    public void volumeUp() {// Увеличить громкость на 1, если больше max то устанавливается max
        this.currentVolume = currentVolume + 1;
        if (currentVolume >= 100) { //(в пределах от 0 до 100)
            this.currentVolume = 100;
        }
    }

    public void volumeDown() {// Уменьшить громкость на 1 Если меньше min, то устанавливается min
        this.currentVolume = currentVolume - 1;
        if (currentVolume <= 0) { //(в пределах от 0 до 100)
            this.currentVolume = 0;
        }
    }
}
