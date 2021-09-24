package main.java.com.def.max.Handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.*;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.requestType;

public class LaunchRequestHandler implements RequestHandler
{
    @Override
    public boolean canHandle(HandlerInput handlerInput)
    {
        return handlerInput.matches(requestType(LaunchRequest.class));
    }

    @Override
    public Optional<Response> handle(HandlerInput handlerInput)
    {
        String speechText = "Welcome to the Alexa PediaDesk. It's a pleasure to talk to you. You can say or ask, a definition for any word!. I can give the definition of that word.";

        String rePromptText = "Ok, now you can say definition for some word.";

        String cardTitle = "Welcome!";

        return handlerInput.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard(cardTitle,speechText)
                .withReprompt(rePromptText)
                .build();
    }
}
