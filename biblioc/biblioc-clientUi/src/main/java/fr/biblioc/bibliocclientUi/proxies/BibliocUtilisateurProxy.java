package fr.biblioc.bibliocclientUi.proxies;

import fr.biblioc.bibliocclientUi.beans.utilisateur.AdresseBean;
import fr.biblioc.bibliocclientUi.beans.utilisateur.UtilisateurBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Proxy du microservice utilisateur.
 */
@FeignClient(name = "biblioc-utilisateur", url = "localhost:9004")
public interface BibliocUtilisateurProxy {

    @GetMapping(value = "/Utilisateurs")
    List<UtilisateurBean> listUtilisateurs();

    @GetMapping( value = "/Utilisateurs-last")
    int recupererLeDernierUtilisateur();

    @GetMapping(value = "/Utilisateurs/{id}")
    UtilisateurBean getUtilisateur(@PathVariable("id") int id);

    @PostMapping(value = "/Utilisateurs")
    UtilisateurBean newUtilisateur(@RequestBody UtilisateurBean utilisateur);

    @PutMapping(value = "/Utilisateurs")
    UtilisateurBean updateUtilisateur(@RequestBody UtilisateurBean utilisateur);

    @GetMapping(value = "/Adresses/{id}")
    AdresseBean getAdresse(@PathVariable("id") int id);

    @PostMapping(value = "/Adresses")
    AdresseBean newAdresse(@RequestBody AdresseBean adresse);

    @PutMapping(value = "/Adresses")
    AdresseBean updateAdresse(@RequestBody AdresseBean adresse);

}
