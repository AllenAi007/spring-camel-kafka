package ai.routes;

import ch.qos.logback.core.joran.conditional.ThenOrElseActionBase;
import org.apache.camel.Exchange;
import org.apache.camel.LoggingLevel;
import org.apache.camel.Processor;
import org.apache.camel.RuntimeCamelException;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.kafka.KafkaConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.util.stream.Stream;

/**
 * Created by hua.ai on 2016/11/5.
 * For Exception handling will be added into camel context by default
 */
@Component
public class ExceptionHandlerRouter extends RouteBuilder {

    private static final Logger LOG = LoggerFactory.getLogger(ExceptionHandlerRouter.class);

    public void configure() throws Exception {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Start config for exception handler.");
        }
        onException(Exception.class).handled(true).log("Error caused : ${exception.message}");
    }
}
