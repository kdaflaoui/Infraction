package org.kid.a_jpa;

import org.kid.a_jpa.dao.AdministrateurRepository;
import org.kid.a_jpa.dao.ProrprioRepository;
import org.kid.a_jpa.entities.Administrateurs;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AJpaApplication {
    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(AJpaApplication.class, args);

        ProrprioRepository proprioDao = ctx.getBean(ProrprioRepository.class);

        AdministrateurRepository AdministrateurDao = ctx.getBean(AdministrateurRepository.class);

        //-------------------------- 1 -- Créer un administrateur :
        Administrateurs admin = new Administrateurs();
        admin.setNom("Flou");
        admin.setPrenom("karim");
        admin.setUsername("karim");
        admin.setPasseword("1234");
        AdministrateurDao.save(admin);
    }
}
