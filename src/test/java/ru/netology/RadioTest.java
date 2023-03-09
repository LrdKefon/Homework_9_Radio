package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    void stationLimMin() {// Номер текущей радиостанции  в пределах от 0 до 9.
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void stationLimMax() {// Номер текущей радиостанции  в пределах от 0 до 9.
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void stationNext() {// Следующая станция в пределах допустимых 2+1=3
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.nextStation();// Обращение к nextStation
        int expected = 3;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void stationNextTwo() {// Если следующая станция выходит за max limit 9+1=0
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();//Обращение к nextStation
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void stationPrevious() {// Если предыдущая станция меньше min limit 0-1=9
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();//обращение к prevStation
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void stationPreviousTwo() {// Предыдущая станция в пределах допустимых 5-1=4
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prevStation();//обращение к prevStation
        int expected = 4;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void stationInput() {       //Задать номер станции (1-9)
        Radio radio = new Radio();
        int currentStation = 7;
        int expected = 7;
        radio.stationInput(currentStation);//обращение к stationInput
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void stationInputTwo() {// Прямое указание станции за min 1-1=0  (0 < диапазон <10)
        Radio radio = new Radio();
        int currentStation = -1;
        int expected = 0;
        radio.stationInput(currentStation);// Обращение к stationInput
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void stationInputTree() {// Прямое указание станции за ее max  (0 < диапазон <10)
        Radio radio = new Radio();
        int currentStation = 10;
        int expected = 0;
        radio.stationInput(currentStation);// Обращение к stationInput
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void currentVolume() {// Получить уровень звука
        Radio radio = new Radio();
        int expected = 0;
        radio.getCurrentVolume();// Обращение к getCurrentVolume
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void stationVolumeUp() {// Увеличить громкость 100+1=100, вне допустимых значений (0 < диапазон <100)
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.volumeUp();// Обращение к volumeUp
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void stationVolumeUpTwo() {// Увеличить громкость в пределах доупустимых значений 4+1=5
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.volumeUp();// Обращение к volumeUp
        int expected = 5;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void stationVolumeDown() {// Уменьшить громкость 0-1=0, вне допустимых значений (0 < диапазон <100)
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.volumeDown();// Обращение к volumeDown
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void stationVolumeDownTwo() {// Уменьшить громкость 8-1=7, в пределах допустимых значений
        Radio rad = new Radio();
        rad.setCurrentVolume(8);
        rad.volumeDown();// Обращение к volumeMinus
        int expected = 7;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
