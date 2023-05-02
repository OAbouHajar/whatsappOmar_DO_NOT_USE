package org.apache.commons.io.output;

import java.io.Serializable;
import java.io.Writer;

public class StringBuilderWriter extends Writer implements Serializable {
    private final StringBuilder builder;

    public StringBuilderWriter() {
        this.builder = new StringBuilder();
    }

    public StringBuilderWriter(int i2) {
        this.builder = new StringBuilder(i2);
    }

    public StringBuilderWriter(StringBuilder sb) {
        this.builder = sb != null ? sb : new StringBuilder();
    }

    public Writer append(char c2) {
        this.builder.append(c2);
        return this;
    }

    public Writer append(CharSequence charSequence) {
        this.builder.append(charSequence);
        return this;
    }

    public Writer append(CharSequence charSequence, int i2, int i3) {
        this.builder.append(charSequence, i2, i3);
        return this;
    }

    public void close() {
    }

    public void flush() {
    }

    public StringBuilder getBuilder() {
        return this.builder;
    }

    public String toString() {
        return this.builder.toString();
    }

    public void write(String str) {
        if (str != null) {
            this.builder.append(str);
        }
    }

    public void write(char[] cArr, int i2, int i3) {
        if (cArr != null) {
            this.builder.append(cArr, i2, i3);
        }
    }
}
