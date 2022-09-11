public class Fruit {
    String name;
    String color;
    String weiDao;

    public Fruit() {
    }

    public Fruit(String name, String color, String weiDao) {
        this.name = name;
        this.color = color;
        this.weiDao = weiDao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWeiDao() {
        return weiDao;
    }

    public void setWeiDao(String weiDao) {
        this.weiDao = weiDao;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weiDao='" + weiDao + '\'' +
                '}';
    }

    public String GetMsg() {
        String A;
        A=("颜色："+color+"  名字："+name+"  味道 ："+weiDao);
        return A;
    }
}
