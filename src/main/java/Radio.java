public class Radio {
    private int currentStation;
    private int currentVolume;

    // Получить текущую радиостанцию
    public int getCurrentStation() {
        return currentStation;
    }

    // Установить радиостанцию, если она в пределах 0-9
    public void setCurrentStation(int station) {
        if (station >= 0 && station <= 9) {
            this.currentStation = station;
        }
    }

    // Переключение на следующую станцию
    public void nextStation() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    // Переключение на предыдущую станцию
    public void prevStation() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }
    }

    // Получить текущий уровень громкости
    public int getCurrentVolume() {
        return currentVolume;
    }

    // Увеличить громкость на 1
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    // Уменьшить громкость на 1
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    // Установить громкость, если она в пределах 0-100
    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.currentVolume = volume;
        }
    }
}
