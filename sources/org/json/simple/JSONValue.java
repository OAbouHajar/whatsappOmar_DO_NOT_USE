package org.json.simple;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.util.List;
import java.util.Map;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONValue {
    public static String escape(String str) {
        if (str == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        escape(str, stringBuffer);
        return stringBuffer.toString();
    }

    static void escape(String str, StringBuffer stringBuffer) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt == 12) {
                stringBuffer.append("\\f");
            } else if (charAt == 13) {
                stringBuffer.append("\\r");
            } else if (charAt == '\"') {
                stringBuffer.append("\\\"");
            } else if (charAt == '/') {
                stringBuffer.append("\\/");
            } else if (charAt != '\\') {
                switch (charAt) {
                    case 8:
                        stringBuffer.append("\\b");
                        break;
                    case 9:
                        stringBuffer.append("\\t");
                        break;
                    case 10:
                        stringBuffer.append("\\n");
                        break;
                    default:
                        if ((charAt >= 0 && charAt <= 31) || ((charAt >= 127 && charAt <= 159) || (charAt >= 8192 && charAt <= 8447))) {
                            String hexString = Integer.toHexString(charAt);
                            stringBuffer.append("\\u");
                            for (int i3 = 0; i3 < 4 - hexString.length(); i3++) {
                                stringBuffer.append('0');
                            }
                            stringBuffer.append(hexString.toUpperCase());
                            break;
                        } else {
                            stringBuffer.append(charAt);
                            break;
                        }
                        break;
                }
            } else {
                stringBuffer.append("\\\\");
            }
        }
    }

    public static Object parse(Reader reader) {
        try {
            return new JSONParser().parse(reader);
        } catch (Exception e2) {
            return null;
        }
    }

    public static Object parse(String str) {
        return parse((Reader) new StringReader(str));
    }

    public static Object parseWithException(Reader reader) throws IOException, ParseException {
        return new JSONParser().parse(reader);
    }

    public static Object parseWithException(String str) throws ParseException {
        return new JSONParser().parse(str);
    }

    public static String toJSONString(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (!(obj instanceof String)) {
            return obj instanceof Double ? (((Double) obj).isInfinite() || ((Double) obj).isNaN()) ? "null" : obj.toString() : obj instanceof Float ? (((Float) obj).isInfinite() || ((Float) obj).isNaN()) ? "null" : obj.toString() : obj instanceof Number ? obj.toString() : obj instanceof Boolean ? obj.toString() : obj instanceof JSONAware ? ((JSONAware) obj).toJSONString() : obj instanceof Map ? JSONObject.toJSONString((Map) obj) : obj instanceof List ? JSONArray.toJSONString((List) obj) : obj.toString();
        }
        return "\"" + escape((String) obj) + "\"";
    }

    public static void writeJSONString(Object obj, Writer writer) throws IOException {
        if (obj == null) {
            writer.write("null");
        } else if (obj instanceof String) {
            writer.write(34);
            writer.write(escape((String) obj));
            writer.write(34);
        } else if (obj instanceof Double) {
            if (((Double) obj).isInfinite() || ((Double) obj).isNaN()) {
                writer.write("null");
            } else {
                writer.write(obj.toString());
            }
        } else if (obj instanceof Float) {
            if (((Float) obj).isInfinite() || ((Float) obj).isNaN()) {
                writer.write("null");
            } else {
                writer.write(obj.toString());
            }
        } else if (obj instanceof Number) {
            writer.write(obj.toString());
        } else if (obj instanceof Boolean) {
            writer.write(obj.toString());
        } else if (obj instanceof JSONStreamAware) {
            ((JSONStreamAware) obj).writeJSONString(writer);
        } else if (obj instanceof JSONAware) {
            writer.write(((JSONAware) obj).toJSONString());
        } else if (obj instanceof Map) {
            JSONObject.writeJSONString((Map) obj, writer);
        } else if (obj instanceof List) {
            JSONArray.writeJSONString((List) obj, writer);
        } else {
            writer.write(obj.toString());
        }
    }
}
