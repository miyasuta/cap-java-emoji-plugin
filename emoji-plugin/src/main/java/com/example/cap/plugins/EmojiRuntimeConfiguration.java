package com.example.cap.plugins;

import com.sap.cds.services.runtime.CdsRuntimeConfiguration;
import com.sap.cds.services.runtime.CdsRuntimeConfigurer;

public class EmojiRuntimeConfiguration implements CdsRuntimeConfiguration{
    @Override
    public void eventHandlers(CdsRuntimeConfigurer configurer) {
        configurer.eventHandler(new EmojiReadHandler());
    }
}
