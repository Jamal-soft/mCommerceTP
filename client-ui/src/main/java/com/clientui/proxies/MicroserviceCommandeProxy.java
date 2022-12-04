package com.clientui.proxies;

import com.clientui.beans.CommandeBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "gateway-server")
public interface MicroserviceCommandeProxy {

    @PostMapping(value = "microservice-commandes/commandes")
    CommandeBean ajouterCommande(@RequestBody CommandeBean commande);
}
