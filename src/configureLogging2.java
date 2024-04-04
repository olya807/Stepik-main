import java.util.logging.*;

public class configureLogging2 {

        private static final Logger l = Logger.getLogger(configureLogging2.class.getName());
        public static void main(String[] args) {
            l.setLevel(Level.ALL);
            ConsoleHandler c = new ConsoleHandler();
            XMLFormatter a = new XMLFormatter();
            // типа в консоль запихиваем, т.е. устанавливаем формат выводимого на экран, т.е. мы          хотим
            // видеть выводимое в виде ХМЛ
            c.setFormatter(a);
            // добовляем наш новообразованый с новыми настройками хэндлер.
            l.addHandler(c);
            //Выводим наши логи
            c.setLevel(Level.ALL);
            l.finest("Halyna");
            l.info("My first log");
            l.warning("YYY");
            l.severe("QQQQ");
        }
    }