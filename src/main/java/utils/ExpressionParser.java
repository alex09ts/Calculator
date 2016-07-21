package utils;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ExpressionParser {

    private String result;
    public String parseTheExpression(String exp){
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        try {
            result = engine.eval(exp).toString();
        } catch (ScriptException e) {
            e.printStackTrace();
        }
        return result;
    }

    public String getResult(){
        return result;
    }
}
