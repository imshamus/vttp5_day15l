package sg.edu.nus.iss.vttp5a_day15l.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import sg.edu.nus.iss.vttp5a_day15l.utility.Util;

@Repository
public class ListRepo 
{
    @Autowired
    @Qualifier(Util.template02) // nothing wrong with usign diff tempalte 
    RedisTemplate<String, Object> template;
    
    // slide 30
    public void leftPush(String key, String value)
    {
        template.opsForList().leftPush(key, value);
    }

    public void rightPush(String key, String value)
    {
        template.opsForList().rightPush(key, value);
    }

    // slide 31
    public void rightPop(String key)
    {
        template.opsForList().leftPop(key, 1); // hard code remove 1 by 1
    }

    public void leftPop(String key)
    {
        template.opsForList().rightPop(key); // never code also okay, see others
    }

    // Slide 32
    public String get(String key, Integer index)
    {
        return template.opsForList().index(key, index).toString();
    }

    // Slide 33
    public Long size(String key)
    {
        return template.opsForList().size(key);
    }

}
