package callback;

public class Test {
    public static void main(String[] args) {
        XiaoLi xiaoli = new XiaoLi();
        XiaoWang xiaoWang = new XiaoWang(xiaoli);

        xiaoWang.ask("1+1等于多少");
    }
}
