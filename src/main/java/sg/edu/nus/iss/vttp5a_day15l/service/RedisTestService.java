package sg.edu.nus.iss.vttp5a_day15l.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.nus.iss.vttp5a_day15l.repository.ListRepo;
import sg.edu.nus.iss.vttp5a_day15l.repository.ValueRepo;

@Service
public class RedisTestService 
{
    @Autowired
    ListRepo lRepo;
    
    @Autowired
    ValueRepo vRepo;

    // Write service
}
