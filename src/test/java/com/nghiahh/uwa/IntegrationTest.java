package com.nghiahh.uwa;

import com.nghiahh.uwa.config.AsyncSyncConfiguration;
import com.nghiahh.uwa.config.EmbeddedRedis;
import com.nghiahh.uwa.config.EmbeddedSQL;
import com.nghiahh.uwa.config.JacksonConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { UwaApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class })
@EmbeddedRedis
@EmbeddedSQL
public @interface IntegrationTest {
}
