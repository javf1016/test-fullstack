package com.chubb.test.respository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.chubb.test.model.Client;

@Repository
public class ClientRepository implements IClientRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Client> findAll() {
		return jdbcTemplate.query("select id,first_name,last_name,surname,phone from client", BeanPropertyRowMapper.newInstance(Client.class));
	}

	@Override
	public int save(Client client) {		
		return jdbcTemplate.update("insert into client values (?, ?, ?, ?)", new Object[] {client.getFirstName(), client.getLastName(), client.getSurname(), client.getPhone()});
	}

    @Override
    public int deleteById(int id) {
        return jdbcTemplate.update("delete from client where id = ?", new Object[] {id});
    }
}
