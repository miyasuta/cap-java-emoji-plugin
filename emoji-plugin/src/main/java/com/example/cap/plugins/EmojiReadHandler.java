package com.example.cap.plugins;

import com.sap.cds.CdsDataProcessor;
import com.sap.cds.services.cds.ApplicationService;
import com.sap.cds.services.cds.CdsReadEventContext;
import com.sap.cds.services.handler.EventHandler;
import com.sap.cds.services.handler.annotations.After;
import com.sap.cds.services.handler.annotations.ServiceName;

@ServiceName(value = "*", type = ApplicationService.class)
public class EmojiReadHandler implements EventHandler{
    private static final String EMOJI_ANNOTATION_NAME = "@emoji";
    
    @After
    public void decorateEmoji(CdsReadEventContext context) {
        CdsDataProcessor.create()
            .addConverter(
                (path, element, type) -> element.findAnnotation(EMOJI_ANNOTATION_NAME).isPresent(),
                (path, element, value) -> value + " 🎉"
            ).process(context.getResult());
    }
}
