package com.hulkStore.inventario.modules.kardex.services;

import com.hulkStore.inventario.modules.kardex.model.Buys;
import com.hulkStore.inventario.modules.kardex.repository.BuysRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuysService  {
    @Autowired
    private BuysRepository buysRepository;

    public List<Buys> listAll() {
        return buysRepository.findAll();
    }

    public void save(Buys buys){
        buysRepository.save(buys);
    }
    public Buys searchBuy(Long id)
    {
        return  buysRepository.getById(id);
    }

    public void delete(Long id)
    {
        buysRepository.deleteById(id);
    }

}
