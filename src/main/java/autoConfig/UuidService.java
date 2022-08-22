package autoConfig;

import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class UuidService {

    public UUID uuid(){
        return UUID.randomUUID();
    }

}
