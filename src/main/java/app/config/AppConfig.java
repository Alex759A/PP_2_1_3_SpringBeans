package app.config;

import app.model.Timer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {
//    @Bean(name = "timer")
//    public Long getTime() {
//        Timer timer = new Timer();
//        Long timerResult = timer.getTime();
//        return timerResult;
//    }
}

/*
    В компоненте AnimalCage есть поле типа Animal, которое связано с помощью аннотации @Autowired. При выполнении программы
    DI-контейнер подтянет сюда бин, подходящий по типу.

        Задание:
        1) Создайте бин Dog, унаследуйте его от Animal. Создайте на основе этого класса компонент.
        2) Запустите приложение и проверьте, что было выброшено исключение NoUniqueBeanDefinitionException. Это произошло
           из-за того, что существует 2 бина с типом Animal.
        3) Прочитайте о связывании бинов по имени и свяжите AnimalCage c бином Dog через абстрактный класс Animal.
        4) На основе класса Timer создайте бин. Свяжите с AnimalCage. Проверьте, что при выполнении метода main время,
           которое пишет таймер, одно и тоже.
        5) Раскоментировать тест из заготовки и проверить своё решение.
*/