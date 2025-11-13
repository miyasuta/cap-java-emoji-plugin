package com.example.cap.plugins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sap.cds.services.runtime.CdsRuntimeConfiguration;
import com.sap.cds.services.runtime.CdsRuntimeConfigurer;

public class EmojiRuntimeConfiguration implements CdsRuntimeConfiguration{
    private static final Logger logger = LoggerFactory.getLogger(EmojiRuntimeConfiguration.class);

    @Override
    public void eventHandlers(CdsRuntimeConfigurer configurer) {
        configurer.eventHandler(new EmojiReadHandler());
        logger.info("[emoji-plugin] EmojiReadHandler successfully registered ✅");
    }
}
