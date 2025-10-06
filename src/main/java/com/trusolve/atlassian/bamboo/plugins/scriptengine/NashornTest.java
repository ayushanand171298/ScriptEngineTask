package com.trusolve.atlassian.bamboo.plugins.scriptengine;
import javax.script.*;

public class NashornTest {
    public static void main(String[] args) throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("nashorn");
        if (engine == null) {
            System.out.println("Nashorn engine not found");
            return;
        }
        Object result = engine.eval("var x = 10; x + 5;");
        System.out.println("Result: " + result);
    }
}
