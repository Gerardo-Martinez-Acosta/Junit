package com.example.demogra.mapper;

import com.example.demogra.entity.Client;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-21T16:30:55-0600",
    comments = "version: 1.4.0.Beta2, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.3.2.jar, environment: Java 17.0.1 (Oracle Corporation)"
)
public class User2DTOImpl implements User2DTO {

    @Override
    public Client clientToClient(Client cl) {
        if ( cl == null ) {
            return null;
        }

        long l = 0L;
        String string = null;
        String string2 = null;

        Client client = new Client( l, string, string2 );

        client.setId( cl.getId() );
        client.setName( cl.getName() );
        client.setCity( cl.getCity() );

        return client;
    }
}
