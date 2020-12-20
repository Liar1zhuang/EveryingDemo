package callback;

public class XiaoWang implements CallBack {

    private XiaoLi xiaoli;

    public XiaoWang(XiaoLi xiaoli){
        this.xiaoli = xiaoli;
    }

    public void ask(final String question){
        System.out.println("xiaowang想知道1+1等于多少");
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    xiaoli.answer(XiaoWang.this,question);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        play();

    }

    public void play(){
        System.out.println("xiaowang玩去了");
    }

    @Override
    public void solve(String result) {
        System.out.println("xiaoli得出的答案是" + result);
    }
}
