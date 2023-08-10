package org.example.homeWorks.HomeWork3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) throws IOException {
        String namesList = "Август, Августин, Авраам, Аврора, Агата, Агафон, Агнесса, Агния, Ада, Аделаида, Аделина, Адонис, Акайо, Акулина, Алан, Алевтина, Александр, Александра, Алексей, Алена, Алина, Алиса,\n" +
                "    Алла, Алсу, Альберт, Альбина, Альфия, Альфред, Амалия, Амелия, Анастасий, Анастасия, Анатолий, Ангелина, Андрей, Анжела, Анжелика, Анисий, Анна, Антон, Антонина, Анфиса, Аполлинарий,\n" +
                "    Аполлон, Ариадна, Арина, Аристарх, Аркадий, Арсен, Арсений, Артем, Артемий, Артур, Архип, Ася, Беатрис, Белла, Бенедикт, Берта, Богдан, Божена, Болеслав, Борис, Борислав, Бронислав,\n" +
                "    Бронислава, Булат, Вадим, Валентин, Валентина, Валерий, Валерия, Ванда, Ванесса, Варвара, Василий, Василиса, Венера, Вениамин, Вера, Вероника, Викентий, Виктор, Виктория, Вилен, Виолетта,\n" +
                "    Виссарион, Вита, Виталий, Влад, Владимир, Владислав, Владислава, Владлен, Вольдемар, Всеволод, Вячеслав, Габриэлла, Гавриил, Галина, Гарри, Гелла, Геннадий, Генриетта, Георгий,\n" +
                "    Герман, Гертруда, Глафира, Глеб, Глория, Гордей, Грейс, Грета, Григорий, Гульмира, Давид, Дана, Даниил, Даниэла, Дарина, Дарья, Даяна, Демьян, Денис, Джеймс, Джек, Джессика, Джозеф,\n" +
                "    Диана, Дина, Динара, Дмитрий, Добрыня, Доминика, Дора, Ева, Евгений, Евгения, Евдоким, Евдокия, Егор, Екатерина, Елена, Елизавета, Елисей, Есения, Ефим, Ефрем, Ефросинья, Жаклин,\n" +
                "    Жанна, Ждан, Захар, Зинаида, Зиновий, Злата, Зорий, Зоряна, Зоя, Иван, Иветта, Игнатий, Игорь, Изабелла, Изольда, Илга, Илларион, Илона, Илья, Инга, Инесса, Инна, Иннокентий, Иосиф,\n" +
                "    Ираида, Ираклий, Ирина, Итан, Ия, Казимир, Калерия, Камилла, Камиль, Капитолина, Карина, Каролина, Касьян, Ким, Кир, Кира, Кирилл, Клавдия, Клара, Клариса, Клим, Климент, Кондрат,\n" +
                "    Константин, Кристина, Ксения, Кузьма, Лада, Лариса, Лев, Леон, Леонид, Леонтий, Леся, Лидия, Лика, Лилиана, Лилия, Лина, Лолита, Луиза, Лукьян, Любовь, Людмила, Магдалина, Майя,\n" +
                "    Макар, Максим, Марат, Маргарита, Марианна, Марина, Мария, Марк, Марта, Мартин, Марфа, Матвей, Мелания, Мелисса, Милана, Милена, Мирон, Мирослава, Мирра, Митрофан, Михаил, Мия,\n" +
                "    Модест, Моисей, Мухаммед, Надежда, Назар, Наоми, Наталия, Наталья, Наум, Нелли, Ника, Никанор, Никита, Никифор, Николай, Николь, Никон, Нина, Нинель, Нонна, Нора, Оксана, Олег,\n" +
                "    Олеся, Оливер, Оливия, Ольга, Оскар, Павел, Парамон, Патрик, Паула, Петр, Платон, Полина, Прасковья, Прохор, Рада, Радмила, Раиса, Райан, Раймонд, Раяна, Регина, Ренат, Рената,\n" +
                "    Рику, Римма, Ринат, Рита, Роберт, Родион, Роза, Роксана, Роман, Россияна, Ростислав, Руслан, Рустам, Рэн, Сабина, Савва, Савелий, Саки, Сакура, Самсон, Самуил, Сарра, Светлана,\n" +
                "    Святослав, Севастьян, Семен, Серафима, Сергей, Сильвия, Снежана, Сора, София, Софья, Станислав, Стелла, Степан, Стефания, Таисия, Такеши, Тамара, Тамила, Тарас, Татьяна, Теодор,\n" +
                "    Тереза, Терентий, Тимофей, Тимур, Тина, Тихон, Томас, Трофим, Ульяна, Урсула, Фаддей, Фаина, Федор, Федот, Феликс, Филат, Филимон, Филипп, Фома, Фрида, Хина, Хлоя, Чарли, Шарлотта,\n" +
                "    Шейла, Шелли, Эдгар, Эдита, Эдуард, Элеонора, Элина, Элла, Эльвира, Эльдар, Эльза, Эмили, Эмилия, Эмма, Эрик, Эрика, Юи, Юлиан, Юлиана, Юлий, Юлия, Юма, Юна, Юрий, Яков, Ямато, Ян,\n" +
                "    Яна, Янина, Ярослав";
        System.out.println("Введите данные в произвольном порядке, через пробел: Фамилия, Имя, Отчество, " +
                "дата рождения (формат dd.mm.yyyy), номер_телефона, пол (символ латиницей f или m)");
        Scanner sc = new Scanner(System.in);
        String[] dataArraySorted = new String[6];
        while (true) {
            try {
                String dataString = sc.nextLine();
                if (!dataString.contains("f") && !dataString.contains("m")) throw new WrongSexException();
                String[] dataArray = dataString.split(" ");
                if (dataArray.length != 6) throw new WrongNumberOfDataException();
                for (String str : dataArray) {
                    if (isNumeric(str)) dataArraySorted[4] = str;
                    else if (str.equals("f") || str.equals("m")) dataArraySorted[5] = str;
                    else if (isDate(str)) dataArraySorted[3] = str;
                    else if (str.endsWith("вич") || str.endsWith("вна")) dataArraySorted[2] = str;
                    else if (namesList.contains(str)) dataArraySorted[1] = str;
                    else dataArraySorted[0] = str;
                }
                for (String str : dataArraySorted) {
                    if (str == null) throw new SomethingWrongException();
                }
                break;
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
        sc.close();

        String dataStringSorted = "<" + dataArraySorted[0] + "><" + dataArraySorted[1] + "><" + dataArraySorted[2] +
                "><" + dataArraySorted[3] + "><" + dataArraySorted[4] + "><" + dataArraySorted[5] + ">" ;
        System.out.println(dataStringSorted);

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(dataArraySorted[0], true));
            bufferedWriter.write(dataStringSorted + "\n");
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Это метод, который проверяет, можно ли преобразовать строку в число
     *
     * @param str это строка, которую нужно проверить
     * @return true, если можно преобразовать строку в число, либо false, если нельзя
     */
    public static boolean isNumeric(String str) {
        try {
            Long.parseLong(str);
            return true;
        } catch (java.lang.NumberFormatException e) {
            return false;
        }
    }

    /**
     * Это метод, который проверяет, является ли строка датой формата dd.mm.yyyy
     *
     * @param str это строка, которую нужно проверить
     * @return true, если строка является датой необходимого формата, либо false, если не является
     */
    public static boolean isDate(String str) {
        if (!str.contains(".")) return false;
        String[] date = str.split("\\.");
        if (date.length != 3) throw new WrongNumberOfDataException();
        if (!isNumeric(date[0]) || !isNumeric(date[1]) || !isNumeric(date[2])) throw new NumberFormatException();
        if (!isDateCorrect(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2])))
            throw new DateIncorrectException();
        return true;
    }

    /**
     * Это метод, который определяет, високосный ли год
     * @param year это год, который нужно проверить
     * @return true, если год високосный, либо false, если нет
     */
     public static boolean isYearLeap ( int year){
         return year % 4 == 0 && (year % 400 == 0 || year % 100 != 0);
     }

     /**
      * Это метод, который определяет, правильно ли введена дата
      * @param day это день
      * @param month это месяц
      * @param year это год
      * @return true, если дата введена дата, либо false, если нет
      */
      public static boolean isDateCorrect ( int day, int month, int year){
          return year < 2024 && year > 1900 &&   //проверка года
                  month > 0 && month <= 12 &&    //проверка месяца
                  day > 0 &&                     //проверка, что дата >0
                  ((day <= 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 ||
                          month == 12)) ||                                                                //проверка, что дней не более 31 в соответствующих месяцах
                          (day <= 30 && (month == 4 || month == 6 || month == 9 || month == 11)) ||       //проверка, что дней не более 30 в соответствующих месяцах
                          (month == 2 && day <= 28 && !isYearLeap(year)) ||                               //проверка, что дней не более 28 в феврале в невисокосные годы
                          (month == 2 && day <= 29 && isYearLeap(year)));                                 //проверка, что дней не более 29 в феврале в високосные годы
      }
}

class NumberFormatException extends  RuntimeException {
    public NumberFormatException () {
        super("При введении даты должны использоваться только числа! Повторите ввод данных!");
    }
}

class DateIncorrectException extends  RuntimeException {
    public DateIncorrectException () {
        super("Вы неправильно ввели дату! При введении даты все числа должны быть положительными, год не должен " +
                "превышать 2023 или быть менее 1900, месяц не должен превышать 12, дни не должны превышать количество " +
                "дней в соответствующем месяце с учетом високосности года! Повторите ввод данных!");
    }
}

class WrongNumberOfDataException extends RuntimeException {
    public WrongNumberOfDataException () {
        super("Вы ввели неправильное количество данных! Возможно, поставили неправильное количество пробелов между " +
                "словами (их должно быть 5), или точек в дате (их должно быть две). Пожалуйста, повторите ввод " +
                "данных правильно!");
    }
}

class WrongSexException extends RuntimeException {
    public WrongSexException () {
        super("Вы ввели пол неправильно! Пол нужно обозначать латинскими буквами f или m! Пожалуйста, повторите ввод!");
    }
}

class SomethingWrongException extends RuntimeException {
    public SomethingWrongException () {
        super("Что-то вы всё равно записали неправильно... Попробуйте еще раз!");
    }
}
