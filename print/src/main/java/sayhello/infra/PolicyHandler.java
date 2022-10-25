package sayhello.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import sayhello.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import sayhello.domain.*;


@Service
@Transactional
public class PolicyHandler{
    @Autowired PrintingRepository printingRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='SayHello'")
    public void wheneverSayHello_PrintHello(@Payload SayHello sayHello){

        SayHello event = sayHello;
        System.out.println("\n\n##### listener PrintHello : " + sayHello + "\n\n");


        

        // Sample Logic //
        Printing.printHello(event);
        

        

    }

}


