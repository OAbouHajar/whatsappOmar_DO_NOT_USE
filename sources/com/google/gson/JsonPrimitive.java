package com.google.gson;

import com.google.gson.internal.C$Gson$Preconditions;
import com.google.gson.internal.LazilyParsedNumber;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: XFMFile */
public final class JsonPrimitive extends JsonElement {

    /* renamed from: a  reason: collision with root package name */
    public final Object f272a;

    public JsonPrimitive(Boolean bool) {
        this.f272a = C$Gson$Preconditions.checkNotNull(bool);
    }

    public JsonPrimitive(Character ch) {
        this.f272a = ((Character) C$Gson$Preconditions.checkNotNull(ch)).toString();
    }

    public JsonPrimitive(Number number) {
        this.f272a = C$Gson$Preconditions.checkNotNull(number);
    }

    public JsonPrimitive(String str) {
        this.f272a = C$Gson$Preconditions.checkNotNull(str);
    }

    public static boolean a(JsonPrimitive jsonPrimitive) {
        Object obj = jsonPrimitive.f272a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public JsonPrimitive deepCopy() {
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || JsonPrimitive.class != obj.getClass()) {
            return false;
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) obj;
        Object obj2 = this.f272a;
        Object obj3 = jsonPrimitive.f272a;
        if (obj2 == null) {
            return obj3 == null;
        }
        if (a(this) && a(jsonPrimitive)) {
            return getAsNumber().longValue() == jsonPrimitive.getAsNumber().longValue();
        }
        if (!(obj2 instanceof Number) || !(obj3 instanceof Number)) {
            return obj2.equals(obj3);
        }
        double doubleValue = getAsNumber().doubleValue();
        double doubleValue2 = jsonPrimitive.getAsNumber().doubleValue();
        if (doubleValue != doubleValue2) {
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
        return true;
    }

    public BigDecimal getAsBigDecimal() {
        Object obj = this.f272a;
        return obj instanceof BigDecimal ? (BigDecimal) obj : new BigDecimal(obj.toString());
    }

    public BigInteger getAsBigInteger() {
        Object obj = this.f272a;
        return obj instanceof BigInteger ? (BigInteger) obj : new BigInteger(obj.toString());
    }

    public boolean getAsBoolean() {
        return isBoolean() ? ((Boolean) this.f272a).booleanValue() : Boolean.parseBoolean(getAsString());
    }

    public byte getAsByte() {
        return isNumber() ? getAsNumber().byteValue() : Byte.parseByte(getAsString());
    }

    public char getAsCharacter() {
        return getAsString().charAt(0);
    }

    public double getAsDouble() {
        return isNumber() ? getAsNumber().doubleValue() : Double.parseDouble(getAsString());
    }

    public float getAsFloat() {
        return isNumber() ? getAsNumber().floatValue() : Float.parseFloat(getAsString());
    }

    public int getAsInt() {
        return isNumber() ? getAsNumber().intValue() : Integer.parseInt(getAsString());
    }

    public long getAsLong() {
        return isNumber() ? getAsNumber().longValue() : Long.parseLong(getAsString());
    }

    public Number getAsNumber() {
        Object obj = this.f272a;
        return obj instanceof String ? new LazilyParsedNumber((String) obj) : (Number) obj;
    }

    public short getAsShort() {
        return isNumber() ? getAsNumber().shortValue() : Short.parseShort(getAsString());
    }

    public String getAsString() {
        if (isNumber()) {
            return getAsNumber().toString();
        }
        boolean isBoolean = isBoolean();
        Object obj = this.f272a;
        return isBoolean ? ((Boolean) obj).toString() : (String) obj;
    }

    public int hashCode() {
        long doubleToLongBits;
        Object obj = this.f272a;
        if (obj == null) {
            return 31;
        }
        if (a(this)) {
            doubleToLongBits = getAsNumber().longValue();
        } else if (!(obj instanceof Number)) {
            return obj.hashCode();
        } else {
            doubleToLongBits = Double.doubleToLongBits(getAsNumber().doubleValue());
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public boolean isBoolean() {
        return this.f272a instanceof Boolean;
    }

    public boolean isNumber() {
        return this.f272a instanceof Number;
    }

    public boolean isString() {
        return this.f272a instanceof String;
    }
}
