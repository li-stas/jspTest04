package app.services;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class IntToStrAttributeConverter  implements AttributeConverter<Integer, String> {


    @Override
    public String convertToDatabaseColumn(Integer nId) {
        return  nId == null? null : String.valueOf(nId);
    }

    @Override
    public Integer convertToEntityAttribute(String cId) {
        return cId == null? null : Integer.parseInt(cId);
    }
}
