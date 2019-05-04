
package com.scio.quantum.harvesters.models.external.dataverse.resource;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Field_ {

    @SerializedName("typeName")
    @Expose
    private String typeName;
    @SerializedName("multiple")
    @Expose
    private boolean multiple;
    @SerializedName("typeClass")
    @Expose
    private String typeClass;
    @SerializedName("value")
    @Expose
    private List<Object> value = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Field_() {
    }

    /**
     * 
     * @param typeName
     * @param value
     * @param typeClass
     * @param multiple
     */
    public Field_(String typeName, boolean multiple, String typeClass, List<Object> value) {
        super();
        this.typeName = typeName;
        this.multiple = multiple;
        this.typeClass = typeClass;
        this.value = value;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public boolean isMultiple() {
        return multiple;
    }

    public void setMultiple(boolean multiple) {
        this.multiple = multiple;
    }

    public String getTypeClass() {
        return typeClass;
    }

    public void setTypeClass(String typeClass) {
        this.typeClass = typeClass;
    }

    public List<Object> getValue() {
        return value;
    }

    public void setValue(List<Object> value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("typeName", typeName).append("multiple", multiple).append("typeClass", typeClass).append("value", value).toString();
    }

}
