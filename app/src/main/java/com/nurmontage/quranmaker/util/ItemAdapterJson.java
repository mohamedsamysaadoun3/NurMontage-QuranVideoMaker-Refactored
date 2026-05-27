package com.nurmontage.quranmaker.util;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.nurmontage.quranmaker.model.template.EntityQuranTemplate;
import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public class MItemAdapterJson implements JsonSerializer<EntityQuranTemplate>, JsonDeserializer<EntityQuranTemplate> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    public EntityQuranTemplate deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        try {
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            return (EntityQuranTemplate) jsonDeserializationContext.deserialize(asJsonObject.get("properties"), Class.forName("com.hazem.s_din12_24.model." + asJsonObject.get("type").getAsString()));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.google.gson.JsonSerializer
    public JsonElement serialize(EntityQuranTemplate entityQuranTemplate, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("type", new JsonPrimitive(entityQuranTemplate.getClass().getSimpleName()));
        jsonObject.add("properties", jsonSerializationContext.serialize(entityQuranTemplate, entityQuranTemplate.getClass()));
        return jsonObject;
    }
}
