
package com.scio.quantum.extractor.models.publication;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.scio.quantum.extractor.models.vocabulary.Term;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

public class ExtractedMetadata{

    @SerializedName("vocabulary")
    @Expose
    private String vocabulary;
    @SerializedName("ready")
    @Expose
    private boolean ready;
    @SerializedName("data")
    @Expose
    private List<Term> data = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ExtractedMetadata() {
    }

    /**
     * 
     * @param vocabulary
     * @param data
     * @param ready
     */
    public ExtractedMetadata(String vocabulary, boolean ready, List<Term> data) {
        super();
        this.vocabulary = vocabulary;
        this.ready = ready;
        this.data = data;
    }

    public String getVocabulary() {
        return vocabulary;
    }

    public void setVocabulary(String vocabulary) {
        this.vocabulary = vocabulary;
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public List<Term> getData() {
        return data;
    }

    public void setData(List<Term> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("vocabulary", vocabulary).append("ready", ready).append("data", data).toString();
    }

}
