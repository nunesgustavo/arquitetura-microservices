package br.com.emmanuelneri.vendas.service;

import br.com.emmanuelneri.vendas.vo.ClienteVo;

import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
public class ClienteService implements Serializable {


    public List<ClienteVo> findAll() {
        return new ArrayList<>();
    }
}
