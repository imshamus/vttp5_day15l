package sg.edu.nus.iss.vttp5a_day15l.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import sg.edu.nus.iss.vttp5a_day15l.utility.Util;

@Repository
public class ValueRepo 
{

    // Slide 20

    @Autowired
    @Qualifier(Util.template01)
    RedisTemplate<String, String> template;

    // Slide 24 - create/update a value
    public void createValue(String key, String value)
    {
        template.opsForValue().set(key, value);

        // setIfPresent
        // setIfAbsent
    }
    
    // Slide 25 - Retrieve a value
    public String getValue(String key)
    {
        return template.opsForValue().get(key);
    }

    // Slide 26 - increment value that only works for key with integer value
    public void incrementValue(String key)
    {
        template.opsForValue().increment(key);
    }

    public void incrementByValue(String key, Integer value)
    {
        template.opsForValue().increment(key, value);
    }

    // Decrement value
    public void decrementValue(String key)
    {
        template.opsForValue().decrement(key);
    }

    public void decrementByValue(String key, Integer value)
    {
        template.opsForValue().decrement(key, value);
    }


    // Slide 27 - Delete a value
    public Boolean deleteValue(String key)
    {
        return template.delete(key);

    }

    // Slide 28 - Check key exist
    public Boolean checkExist(String key)
    {
        return template.hasKey(key);
    }
}
