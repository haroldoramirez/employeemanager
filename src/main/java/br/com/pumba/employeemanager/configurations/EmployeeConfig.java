package br.com.pumba.employeemanager.configurations;

import br.com.pumba.employeemanager.models.Employee;
import br.com.pumba.employeemanager.repositories.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class EmployeeConfig {

    @Bean
    CommandLineRunner commandLineRunner(EmployeeRepository repository) {
        return args -> {
            Employee miriam = new Employee(
                    "Miriam",
                    "miriam@gmail.com",
                    "Analista de Sistemas",
                    "1234567890",
                    "https://bootdey.com/img/Content/avatar/avatar3.png",
                    "3030"

            );
            Employee haroldo = new Employee(
                    "Haroldo",
                    "haroldo@gmail.com",
                    "Analista de Sistemas",
                    "1234567890",
                    "https://bootdey.com/img/Content/avatar/avatar3.png",
                    "4040"

            );
            Employee bruna = new Employee(
                    "Bruna",
                    "bruna@gmail.com",
                    "Professora",
                    "1234567890",
                    "https://bootdey.com/img/Content/avatar/avatar3.png",
                    "1010"

            );
            Employee diana = new Employee(
                    "Diana",
                    "diana@gmail.com",
                    "Aluno",
                    "1234567890",
                    "https://bootdey.com/img/Content/avatar/avatar3.png",
                    "0001"

            );
            Employee marcos = new Employee(
                    "Marcos",
                    "marcos@gmail.com",
                    "Devops",
                    "1234567890",
                    "https://bootdey.com/img/Content/avatar/avatar3.png",
                    "1111"

            );
            Employee liz = new Employee(
                    "Liz",
                    "liz@gmail.com",
                    "Gerente",
                    "1234567890",
                    "https://bootdey.com/img/Content/avatar/avatar3.png",
                    "2222"

            );
            Employee meteoro = new Employee(
                    "Meteoro",
                    "meteoro@gmail.com",
                    "Jornalismo",
                    "1234567890",
                    "https://bootdey.com/img/Content/avatar/avatar3.png",
                    "3333"

            );
            Employee eduardo = new Employee(
                    "Eduardo",
                    "eduardo@gmail.com",
                    "Historiador",
                    "1234567890",
                    "https://bootdey.com/img/Content/avatar/avatar3.png",
                    "4444"

            );
            Employee carlos = new Employee(
                    "Carlos",
                    "carlos@gmail.com",
                    "Cagão",
                    "1234567890",
                    "https://bootdey.com/img/Content/avatar/avatar3.png",
                    "5555"

            );
            Employee gabriel = new Employee(
                    "Gabriel",
                    "fallen@gmail.com",
                    "Pro Player",
                    "1234567890",
                    "https://bootdey.com/img/Content/avatar/avatar3.png",
                    "6666"

            );
            Employee gregor = new Employee(
                    "Gregor",
                    "gregor@gmail.com",
                    "Analista de Negócios",
                    "1234567890",
                    "https://bootdey.com/img/Content/avatar/avatar3.png",
                    "7777"

            );
            repository.saveAll(
                    List.of(miriam, haroldo, bruna, diana, marcos, liz, meteoro, eduardo, carlos, gabriel, gregor)
            );
        };
    }
}
