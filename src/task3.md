Концепция "Класс как модуль" в Java поддерживается следующим образом:

1. Использование пакетов. 

Для этого необходимо определить название пакета в начале файла:
```
package mypack;
```
Возможности использования пакетов:

- Структурирование проекта - допускается создавать иерархию пакетов, которая отражается и в файловой системе проекта.
- Ограничение доступа к членам классов - создается некоторое пространство имен.
- Поддержка классов с одинаковыми именами, если они находятся в разных пакетах.

2. Использование модулей.

Модуль представляет собой группу пакетов и ресурсов. Модуль определяется в файле исходного кода по имени ```module-info.java``` с использованием ключевых слов:
```
module mymodule {
	// определение модуля
}
```

Возможности использования модулей:

- Способность модуля сообщать о том, что ему требуется другой модуль.
- Способность модуля контролировать, какие из его пакетов доступны другому модулю.