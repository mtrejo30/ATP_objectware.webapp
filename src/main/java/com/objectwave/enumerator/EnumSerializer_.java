package com.objectwave.enumerator;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;

public class EnumSerializer_ extends JsonSerializer<BasicEnum_>
{
	public EnumSerializer_()
	{
		super();
	}

	public void serialize(BasicEnum_ value, JsonGenerator generator, SerializerProvider provider) throws IOException, JsonProcessingException
	{
		generator.writeStartObject();
		generator.writeFieldName("name");
		generator.writeString(value.getName_());
		generator.writeFieldName("id");
		generator.writeNumber(value.getId_());
		generator.writeEndObject();
	}

}
