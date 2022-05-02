package com.hulkStore.inventario.modules.users.services;

import com.hulkStore.inventario.modules.users.model.Customer;
import com.hulkStore.inventario.modules.users.model.WebUserSystem;
import com.hulkStore.inventario.modules.users.repository.CustomerRepository;
import com.hulkStore.inventario.modules.users.repository.WebUserSystemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * this service class connects to several repositories and bundles  their functionality
 *  @author Leticia Villa
 *  @version 1.0
 * */
@Service
public class WebUserSystemService {
    @Autowired
    private WebUserSystemRepository webUserSystemRepository;

    public List<WebUserSystem> listAll() {
        return webUserSystemRepository.findAll();
    }

    public void save(WebUserSystem webUserSystem){
        webUserSystemRepository.save(webUserSystem);
    }
    public WebUserSystem searchBuy(Long id)
    {
        return  webUserSystemRepository.getById(id);
    }

    public void delete(Long id)
    {
        webUserSystemRepository.deleteById(id);
    }

}
