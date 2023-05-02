package X;

/* renamed from: X.5ob  reason: invalid class name and case insensitive filesystem */
public enum C114785ob {
    KEY_CODE_EMPTY(0, 1001),
    KEY_CODE_INVALID(1, 1002),
    PARSER_MISCONFIG(3, 1004),
    UNKNOWN_ERROR(6, 1007),
    TRUST_NOT_VALID(7, 1008);
    
    public final int code;
    public final String description;

    /* access modifiers changed from: public */
    static {
        KEY_CODE_EMPTY = new C114785ob("KEY_CODE_EMPTY", "Your organization key is empty. Please provide a organization key.", 0, 1001);
        KEY_CODE_INVALID = new C114785ob("KEY_CODE_INVALID", "Your organization key is invalid. Please contact your system administrator or UPI support team.", 1, 1002);
        new C114785ob("PUBLICKEY_NOT_FOUND", "Public key file not found please contact your system administrator UPI support team", 2, 1003);
        PARSER_MISCONFIG = new C114785ob("PARSER_MISCONFIG", "XML Parser configuration error.Keys.xml may not be formatted correctly.", 3, 1004);
        new C114785ob("XML_PATH_ERROR", "XML File is not found or cannot be read.", 4, 1005);
        new C114785ob("KEYS_NOT_VALID", "Keys are not valid. Please contact your system administrator UPI support team", 5, 1006);
        UNKNOWN_ERROR = new C114785ob("UNKNOWN_ERROR", "Unknown error occurred.", 6, 1007);
        TRUST_NOT_VALID = new C114785ob("TRUST_NOT_VALID", "Trust is not valid", 7, 1008);
    }

    /* access modifiers changed from: public */
    C114785ob(int i2, int i3) {
        this.code = i3;
        this.description = r2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(this.code);
        A0o.append(": ");
        return AnonymousClass000.A0h(this.description, A0o);
    }
}
