package pe.mil.microservices.constants;

import lombok.experimental.UtilityClass;

@UtilityClass
public class SagaEventTypeConstants {

    public static final String SAGA_EVENT_TYPE_INBOUND_CODE = "INBOUND";
    public static final String SAGA_EVENT_TYPE_INBOUND_DESCRIPTION = "events that are generated by an external system and consumed by the microservice";
    public static final String SAGA_EVENT_TYPE_OUTBOUND_CODE = "OUTBOUND";
    public static final String SAGA_EVENT_TYPE_OUTBOUND_DESCRIPTION = "events that are generated by the microservice that defines the producer";

}