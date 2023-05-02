package org.json.simple.parser;

public class ParseException extends Exception {
    public static final int ERROR_UNEXPECTED_CHAR = 0;
    public static final int ERROR_UNEXPECTED_EXCEPTION = 2;
    public static final int ERROR_UNEXPECTED_TOKEN = 1;
    private static final long serialVersionUID = -7880698968187728548L;
    private int errorType;
    private int position;
    private Object unexpectedObject;

    public ParseException(int i2) {
        this(-1, i2, (Object) null);
    }

    public ParseException(int i2, int i3, Object obj) {
        this.position = i2;
        this.errorType = i3;
        this.unexpectedObject = obj;
    }

    public ParseException(int i2, Object obj) {
        this(-1, i2, obj);
    }

    public int getErrorType() {
        return this.errorType;
    }

    public int getPosition() {
        return this.position;
    }

    public Object getUnexpectedObject() {
        return this.unexpectedObject;
    }

    public void setErrorType(int i2) {
        this.errorType = i2;
    }

    public void setPosition(int i2) {
        this.position = i2;
    }

    public void setUnexpectedObject(Object obj) {
        this.unexpectedObject = obj;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        int i2 = this.errorType;
        if (i2 == 0) {
            stringBuffer.append("Unexpected character (");
            stringBuffer.append(this.unexpectedObject);
            stringBuffer.append(") at position ");
            stringBuffer.append(this.position);
            stringBuffer.append(".");
        } else if (i2 == 1) {
            stringBuffer.append("Unexpected token ");
            stringBuffer.append(this.unexpectedObject);
            stringBuffer.append(" at position ");
            stringBuffer.append(this.position);
            stringBuffer.append(".");
        } else if (i2 != 2) {
            stringBuffer.append("Unkown error at position ");
            stringBuffer.append(this.position);
            stringBuffer.append(".");
        } else {
            stringBuffer.append("Unexpected exception at position ");
            stringBuffer.append(this.position);
            stringBuffer.append(": ");
            stringBuffer.append(this.unexpectedObject);
        }
        return stringBuffer.toString();
    }
}
