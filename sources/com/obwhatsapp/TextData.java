package com.obwhatsapp;

import java.io.Serializable;
import java.util.Arrays;

public class TextData implements Serializable {
    public static final long serialVersionUID = 1;
    public int backgroundColor;
    public int fontStyle;
    public int textColor;
    public byte[] thumbnail;

    public boolean equals(Object obj) {
        int length;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TextData textData = (TextData) obj;
        if (this.fontStyle != textData.fontStyle || this.textColor != textData.textColor || this.backgroundColor != textData.backgroundColor) {
            return false;
        }
        byte[] bArr = this.thumbnail;
        byte[] bArr2 = textData.thumbnail;
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null) {
            length = bArr2.length;
        } else if (bArr2 != null) {
            return Arrays.equals(bArr, bArr2);
        } else {
            length = bArr.length;
        }
        return length == 0;
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{Integer.valueOf(this.fontStyle), Integer.valueOf(this.textColor), Integer.valueOf(this.backgroundColor), this.thumbnail});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TextData; fontStyle=");
        sb.append(this.fontStyle);
        sb.append("; textColor=");
        sb.append(this.textColor);
        sb.append("; backgroundColor=");
        sb.append(this.backgroundColor);
        sb.append("; thumbnail=");
        byte[] bArr = this.thumbnail;
        sb.append(bArr == null ? "null" : Integer.valueOf(bArr.length));
        return sb.toString();
    }
}
