package callback;

public class XiaoLi {
    public void answer(CallBack callBack,String question) throws InterruptedException {
        System.out.println("xiaowang的问题是" + question);

        Thread.sleep(2000);
        String result = "答案是2";

        callBack.solve(result);

    }
}
