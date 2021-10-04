package design.pattern.creational.factory.simplef.ex1;
/*
    use different
 */

public class RuleConfig {
    public RuleConfig load1(String ruleConfigFilePath) {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
        IRuleConfigParser parser = null;
        if ("json".equalsIgnoreCase(ruleConfigFileExtension)) {
            parser = new JsonRuleConfigParser();
        } else {
            // throw new InvalidRuleConfigException("Rule config file format is not supported: " + ruleConfigFilePath)
        }
        String configText = "";
        RuleConfig ruleConfig = parser.parse(configText);
        return ruleConfig;
    }

    private String getFileExtension(String ruleConfigFilePath) {
        return "json";
    }
    /*
        为了让代码逻辑更加清晰，可读性更好，我们要善于将功能独立的代码块封装成函数。
     */

}



