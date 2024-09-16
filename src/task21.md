#### Наследование реализации
```
class Trip {
    private final int countOfDays;
	private final String city;

    public Trip(int countOfDays, String city) {
        this.countOfDays = countOfDays;
        this.city = city;
    }
}

class Excursion extends Trip {
    // уникальная абстракция структуры данных
    private final Guide guide; // гид

    public GrossBook(int countOfDays, String city, Guide guide) {
        super(countOfDays, city);
        this.guide = guide;
    }
}
```

#### Льготное наследование
```
class Handler {
    public void sendMessage(String message) {
        // реализация
    }
}

class SmsHandler extends Handler {
    public void doSomething() {
        // реализация частного случая 
        sendMessage("My message");
    }
}
```