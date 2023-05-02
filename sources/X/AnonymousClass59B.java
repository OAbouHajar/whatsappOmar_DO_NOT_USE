package X;

import java.io.IOException;

/* renamed from: X.59B  reason: invalid class name */
public class AnonymousClass59B implements C109175Qz {
    public void A8h(Appendable appendable, String str) {
        try {
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if (charAt == 12) {
                    appendable.append("\\f");
                } else if (charAt == 13) {
                    appendable.append("\\r");
                } else if (charAt == '\"') {
                    appendable.append("\\\"");
                } else if (charAt == '/') {
                    appendable.append("\\/");
                } else if (charAt != '\\') {
                    switch (charAt) {
                        case 8:
                            appendable.append("\\b");
                            break;
                        case 9:
                            appendable.append("\\t");
                            break;
                        case 10:
                            appendable.append("\\n");
                            break;
                        default:
                            if (charAt >= 0 && (charAt <= 31 || (charAt >= 127 && (charAt <= 159 || (charAt >= 8192 && charAt <= 8447))))) {
                                AnonymousClass3K2.A1E(appendable, charAt);
                                break;
                            } else {
                                appendable.append(charAt);
                                break;
                            }
                            break;
                    }
                } else {
                    appendable.append("\\\\");
                }
            }
        } catch (IOException unused) {
            throw AnonymousClass000.A0a("Impossible Error");
        }
    }
}
