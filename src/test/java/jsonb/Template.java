package jsonb;

/**
 * @author xielongwang
 * @create 2017-03-17 下午9:01
 * @email xielong.wang@nvr-china.com
 */
public class Template {
    private String name;
    private int    register;
    private String type;
    private int length;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegister() {
        return register;
    }

    public void setRegister(int register) {
        this.register = register;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}